package feladat04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;


public class FajlKezeles {

public static void fajlbaIras(List<Rendeles> rendelesek, String elvalaszto) throws IOException {
		
	
		
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("UjSzallitoiRendelesek.csv",false),"UTF-8");
		out.write("szallitoazonosito"+elvalaszto+
				"megnevezes"+elvalaszto+
				"mennyiseg"+elvalaszto+
				"osszertek"+elvalaszto+
				"surgos"+
				"\n");

		for (int i=0; i<rendelesek.size(); i++) {

			String kiiras;
			
			kiiras = rendelesek.get(i).getSzallitoiAzonosito()+elvalaszto+
					rendelesek.get(i).getMegnevezes()+elvalaszto+
					rendelesek.get(i).getMennyiseg()+elvalaszto+
					rendelesek.get(i).getOsszertek()+elvalaszto+
					(rendelesek.get(i).isSurgos()?"1":"0");
			
			out.write(kiiras+"\n");
		}

		out.close();

		
    }
		
		
		
	public int beolvas(List<Rendeles> rendelesek, String fajlnev) throws IOException {

		int hibasTetelekSzama = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"));

		while (br.ready()) {

			String csvSor[] = br.readLine().split(";");

			if (ellenoriz(csvSor)) {

				rendelesek.add(new Rendeles(csvSor));

			} else {

				hibasTetelekSzama++;

			}

		}

		br.close();
		return hibasTetelekSzama;

	}

	public boolean ellenoriz(String[] csvSor) {

		return csvSor.length == 5 && csvSor[0].length() >= 5;

	}

}
