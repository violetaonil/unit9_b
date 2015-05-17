package unit9_b.unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculaTasaMatriculaTest {

	@Test //Menor de 25, no fam_numerosa, sí repetidor
	public void calculaTasaMatriculatest1() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(20, false, true);
		float resultado_esperado = 2000.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Mayor de 25, no fam_numerosa, sí repetidor
	public void calculaTasaMatriculatest2() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(26, false, true);
		float resultado_esperado = 500.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Menor de 25, sí fam_numerosa, sí repetidor
	public void calculaTasaMatriculatest3() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(24, true, true);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Menor de 25, sí fam_numerosa, no repetidor
	public void calculaTasaMatriculatest4() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(24, true, false);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Menor de 25, no fam_numerosa, no repetidor
	public void calculaTasaMatriculatest5() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(24, false, false);
		float resultado_esperado = 500.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Mayor de 25, no fam_numerosa, no repetidor
	public void calculaTasaMatriculatest6() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(26, false, false);
		float resultado_esperado = 500.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Mayor de 25, sí fam_numerosa, sí repetidor
	public void calculaTasaMatriculatest7() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(26, true, true);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Mayor de 25, sí fam_numerosa, no repetidor
	public void calculaTasaMatriculatest8() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(26, true, false);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Tener 65 y sí fam_numerosa
	public void calculaTasaMatriculatest9() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(65, true, false);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Mayor y sí fam_numerosa
	public void calculaTasaMatriculatest10() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(66, true, false);
		float resultado_esperado = 250.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}
	
	@Test //Entre 50 y 65, no fam_numerosa
	public void calculaTasaMatriculatest11() {
		Alumno aTest = new Alumno();
		float resultado_real = aTest.calculaTasaMatricula(51, false, false);
		float resultado_esperado = 400.00f;
		assertEquals(resultado_esperado, resultado_real, 0);
	}

}
