package feladat04_Teszt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat04.FajlKezeles;

class ujElemekTest {

	
	
	@Test
	void ellenorizTeszt() {
		
		FajlKezeles fajlObj = new FajlKezeles();
		String[] tesztCsvSor = {"S0008","toll","100","4000","1"};
		
		assertTrue(fajlObj.ellenoriz(tesztCsvSor));
		
	}

	@Test
	void lettUjElemTeszt() {
	}

}
