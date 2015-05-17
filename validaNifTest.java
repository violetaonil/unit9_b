package unit9_b.unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class validaNifTest {

	@Test
	public void validaNiftest1() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("456446618748F");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest2() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("76343N");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest3() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest4() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("765765764");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest5() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("45844661A");
		boolean resultado_esperado = true;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest6() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("4584A4661");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
		
	@Test
	public void validaNiftest7() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("A4584A4661");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}
	
	@Test
	public void validaNiftest8() {
		Alumno aTest = new Alumno();
		boolean resultado_real = aTest.validaNif("4584A4661Ñ");
		boolean resultado_esperado = false;
		assertEquals(resultado_esperado, resultado_real);
	}

}
