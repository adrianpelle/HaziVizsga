package feladat02_Teszt;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import feladat02.Noveny;
import feladat02.botanikusKertApplikacio;

class NovenyTest {

	@Test
	void hanyEveLatogathatoTeszt(){
		
		int bekerulesEve = 2003;
		int aktualisEv = LocalDate.now().getYear();
		int elvartEredmeny = (aktualisEv-bekerulesEve)*12;
		
		Noveny novenyObj = new Noveny("0001","magyar rózsa", bekerulesEve);
		
		assertEquals(elvartEredmeny, novenyObj.hanyHonapjaLatogathato());
		
	}
	
	@Test
	void megfeleloEvszamTeszt(){
		

		Noveny novenyObj = new Noveny("N01", "alpesi sziromka", 2000);
		assertTrue(novenyObj.hanyHonapjaLatogathato()>0);
		
	}
	
	
	

}
