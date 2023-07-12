package feladat03_Teszt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import feladat03.AdatBekeres;
import feladat03.FoprogramAutoSzerviz;
import feladat03.SzervizMunka;

class SzervizMunkaTest {

	@Test
	void arKepzesTeszt() {
		
		int oradij = 8000;
		SzervizMunka tesztObj = new SzervizMunka("olajcsere", 2);
		int elvartErtek = 16000;
		
		assertEquals(elvartErtek,tesztObj.arKepzes(oradij));
		
	}

	@Test
	void leghosszabbSzervizTevekenysegTeszt() {
		
		List<SzervizMunka> munkaTeszt = new ArrayList<SzervizMunka>();
		munkaTeszt.add(new SzervizMunka("olajcsere", 3));
		munkaTeszt.add(new SzervizMunka("klímatisztítás", 2));
		munkaTeszt.add(new SzervizMunka("gumicsere", 1));
		munkaTeszt.add(new SzervizMunka("kipufogóhegesztés", 4));
		
		int elvartErtek = 4;
		
		assertEquals(elvartErtek,munkaTeszt.get(FoprogramAutoSzerviz.leghosszabbMunkafolyamat(munkaTeszt)).getMunkaOra());
		
	}

}
