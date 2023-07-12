package feladat03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdatBekeres {

	static Scanner sc = new Scanner(System.in);

	public static List<SzervizMunka> munkaBekeres() {
		List<SzervizMunka> munka = new ArrayList<SzervizMunka>();
		boolean igaz = true;

		while (igaz) {

			System.out.println("Kérem a szerviztevékenység nevét: ");
			String szerviztevekenyseg = sc.nextLine();
			if (szerviztevekenyseg.equals("")) {
				igaz = false;
			}

			if (igaz) {
				System.out.println("Kérem a szerviztevékenység óráinak száma: ");
				int tevekenysegMunkaideje = Integer.parseInt(sc.nextLine());
				munka.add(new SzervizMunka(szerviztevekenyseg, tevekenysegMunkaideje));
			}
		}

		return munka;
	}

}
