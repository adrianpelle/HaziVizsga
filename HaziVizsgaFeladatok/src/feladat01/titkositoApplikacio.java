package feladat01;

import java.util.Scanner;

public class titkositoApplikacio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Kérem a titkosítandó szöveget: ");
		String beolvasottSzoveg = sc.nextLine();
		
		System.out.println("Titkosított szöveg: "+titkosit(beolvasottSzoveg));
		
		
		System.out.println("Dekódolt szöveg: "+dekodol(titkosit(beolvasottSzoveg)));
		
	}

	
	public static String titkosit(String titkositando) {
		
		String mitKellCserelni = "kstea ";
		String mireKellCserelni = "135790";
		String eredmeny = titkositando;
		
	    for (int i = 0; i < mitKellCserelni.length(); i++)
        {
            eredmeny = eredmeny.replace(mitKellCserelni.charAt(i), mireKellCserelni.charAt(i));
        }

	    if (eredmeny.length() > 1) {
	    		    	
	    	eredmeny = eredmeny.charAt(eredmeny.length()-1)+eredmeny.substring(0,eredmeny.length()-1);
	    	
	    }	    
		
		return eredmeny;
		
	}


	public static String dekodol(String titkositando) {
		
		String mitKellCserelni = "135790";
		String mireKellCserelni = "kstea ";
		String eredmeny = titkositando;
		
	    for (int i = 0; i < mitKellCserelni.length(); i++)
        {
            eredmeny = eredmeny.replace(mitKellCserelni.charAt(i), mireKellCserelni.charAt(i));
        }

	    if (eredmeny.length() > 1) {
	    		    	
	    	eredmeny = eredmeny.charAt(1)+eredmeny.substring(2,eredmeny.length())+eredmeny.charAt(0);
	    	
	    }	    
		
		return eredmeny;
		
	}

}
