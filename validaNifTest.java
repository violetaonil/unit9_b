package unit9_b.unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class validaNifTest {

	@Test //Más de 9 caracteres
	public void validaNiftest1() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("456446618748F");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //Menos de 9 caracteres
	public void validaNiftest2() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("76343N");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //String vacío
	public void validaNiftest3() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //Sólo números
	public void validaNiftest4() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("765765764");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //Sólo letras
	public void validaNiftest5() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("AAAAAAAAA");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //dni correcto
	public void validaNiftest6() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("45844661A");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //Letra en medio
	public void validaNiftest7() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("4584A4661");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
		
	@Test //Letra delante
	public void validaNiftest8() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("A45844661");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test //Letra prohibida
	public void validaNiftest9() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("4584A4661Ñ");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}

}
