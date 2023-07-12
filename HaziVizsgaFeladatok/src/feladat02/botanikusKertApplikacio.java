package feladat02;


public class botanikusKertApplikacio {

	public static void main(String[] args) {
		
		Noveny[] novenyek = {new Noveny("N01", "alpesi sziromka", 2000),
				new Virag("N02", "büdöske", 1999, "piros"),
				new Virag("N03", "dunai hosszúlevelű", 2010, "zöld"),
				new Noveny("N04", "közönséges tulipán", 2005)
		};
		
		kiir(novenyek);

	}


	public static void kiir(Noveny[] novenyek) {
		for (int i=0; i<novenyek.length; i++) {
			System.out.println(novenyek[i].toString()+" :: "+novenyek[i].hanyHonapjaLatogathato() +" hónapja látogatható :: "+ ((novenyek[i] instanceof Virag)?"Virág":"Általános növény"));
		}
	}

}
