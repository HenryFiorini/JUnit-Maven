package pucrs.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest_JUnit4 {

	@Test
	public void testGetSaudacaoEhOlaMundo() {

		String expected = "Olá, mundo";
		String actual = App.getSaudacao();
		assertEquals(expected, actual);
	}

	public void testGetSaudacaoIniciaComO() {

		String actual = App.getSaudacao();
		assertTrue(actual.startsWith("O"));
	}

}
