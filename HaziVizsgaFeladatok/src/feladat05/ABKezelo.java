package feladat05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ABKezelo {

	
	private static Connection kapcsolat;
	
	private static PreparedStatement sqlUtasitas;
	
	
	public static void csatlakozas() throws SQLException {
		
		String connectionURL = "jdbc:mysql://localhost:3306/szinhaz_eloadasok_db?autoReconnect=true&useSSL=false";
		
		try {
			kapcsolat = DriverManager.getConnection(connectionURL,"root","Ruander2023");
		} catch (Exception e) {
			throw new SQLException("A csatlakozás sikertelen!");
		}
		
	}
	
	
	public static void kapcsolatBontas() throws SQLException {
		
		try {
			
			kapcsolat.close();
			
		} catch (Exception e) {
			throw new SQLException("A kapcsolat bontása sikertelen!");
		}
		
	}
	
	
	
	public static List<Eloadas> eloadasokBeolvasasa() throws SQLException {
		
		List<Eloadas> eloadasok = new ArrayList<Eloadas>();
		
		try {
			
			sqlUtasitas = kapcsolat.prepareStatement("SELECT * FROM eloadasok");
			
			ResultSet res = sqlUtasitas.executeQuery();
			while (res.next()) {
				
				eloadasok.add(new Eloadas(
						res.getString("cim"),
						res.getString("rendezo"),
						res.getDate("bemutato").toLocalDate(),
						res.getInt("eloadas_szam")));
				
			}
			res.close();
			
		} catch (Exception e) {
			throw new SQLException("Az adatok beolvasása sikertelen! "+e.getMessage());
		}
		
		return eloadasok;
	}


	
}
