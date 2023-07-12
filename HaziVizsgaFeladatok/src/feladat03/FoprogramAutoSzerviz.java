package feladat03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoprogramAutoSzerviz {

	static Map<String, Integer> munkadijak = new HashMap<String, Integer>();

	public static void main(String[] args) {
		
		int oradij = 8000;
		
		List<SzervizMunka> munka = AdatBekeres.munkaBekeres();
		if (munka.size()>0) {
			
			System.out.println("A leghosszabb ideig tartó szerviztevékenység: "+munka.get(leghosszabbMunkafolyamat(munka)).getSzervizTevekenyseg());

			for (int i=0; i<munka.size(); i++) {
				
				munkadijak.put(munka.get(i).getSzervizTevekenyseg(), munka.get(i).arKepzes(oradij));
			}
			mapKilistazas(munkadijak);
		}
		

		
		
	}
	
	
	private static void mapKilistazas(Map<String, Integer> munkadijak) {

		for (Map.Entry<String,Integer> munka : munkadijak.entrySet()) {
			
			System.out.println(munka.getKey()+" "+munka.getValue()+" Ft");
			
		}
	}


	public static int leghosszabbMunkafolyamat(List<SzervizMunka> munka) {
		int maxindex=0;
		for (int i=1; i<munka.size(); i++) {
			if (munka.get(maxindex).getMunkaOra()<munka.get(i).getMunkaOra()) {
				maxindex = i;
			}
		}
		
		return maxindex;
	}

}
