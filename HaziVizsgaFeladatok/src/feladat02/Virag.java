package feladat02;

public class Virag extends Noveny{
	
	private String color;

	public Virag(String azonosito, String megnevezes, int felfedezesEve, String color) {
		super(azonosito, megnevezes, felfedezesEve);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + " " + color;
	}
	
	
	

}
