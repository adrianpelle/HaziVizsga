package feladat04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import feladat03.SzervizMunka;

public class PapirBoltFoprogram {

	public static void main(String[] args) throws IOException {
		
		List<Rendeles> rendelesek = new ArrayList<Rendeles>();
		FajlKezeles fajlObj = new FajlKezeles();
		
		System.out.println("Fájl beolvasva. Hibás tételek száma: "+fajlObj.beolvas(rendelesek,"SzallitoiRendelesek.csv"));
		
		
		for (int i=0; i<rendelesek.size(); i++) {
			System.out.println(rendelesek.get(i).toString());
		}
		
		
		rendelesek.add(new Rendeles("S00009", "fehér radír", 133, 300, false));
		rendelesek.add(new Rendeles("S00010", "piros-kék ceruza", 444, 500, true));
		
		FajlKezeles.fajlbaIras(rendelesek, ";");

	}

}
