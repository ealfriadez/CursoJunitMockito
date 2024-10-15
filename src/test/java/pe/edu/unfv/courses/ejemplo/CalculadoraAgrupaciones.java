package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraAgrupaciones {

	@Test
	@DisplayName("Probar las aserciones booleanas")
	void testAsetions() {	
		
		boolean flag = true;
		boolean flag2 = false;
		
		assertTrue(flag, "Flag deberia ser TRUE");
		assertFalse(flag2, "Flag deberia ser FALSE");
	}

	@Test
	@DisplayName("Probar las aserciones booleanassss")
	void testAsetionsObjetoNull() {
		
		String valor = "Hola";
		
		assertNull(null, "El objeto deberia ser nulo");
		assertNotNull(valor, "El objeto deberia no ser nulo");
	}
	
	@Test
	@DisplayName("Probar las aserciones equalls")
	void testAsercionesEquals() {
		
		Persona personaEsperado = new Persona("Eleazar", "Alfriadez");
		Persona personaActual = new Persona("Eleazar", "Alfriadez");
				
		assertEquals(personaEsperado, personaActual, "Ambas personaas deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones equalls")
	void testAsercionesNotEquals() {
		
		Persona personaEsperado = new Persona("Eleazar Alfredo", "Alfriadez");
		Persona personaActual = new Persona("Eleazar", "Alfriadez");
				
		assertEquals(personaEsperado, personaActual, "Ambas personas deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones equalls")
	void testAsercionesEqualsplus() {
		
		Persona personaEsperado = new Persona("Eleazar Alfredo", "Alfriadez");
		Persona personaActual = new Persona("Eleazar", "Alfriadez");
		Persona personaActualPlus = new Persona("Eleazar Alfredo", "Alfriadez");
				
		assertEquals(personaEsperado, personaActualPlus, "Ambas personas deberian ser iguales");
		assertNotEquals(personaEsperado, personaActual, "Ambas personas no deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones arrays")
	void testAsercionesArrays() {
		
		int[] arrayEsperado = {1, 2, 3};
		int[] arrayActual = {1, 2, 3};
				
		assertArrayEquals(arrayEsperado, arrayActual, "Ambas arrays deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones arrays")
	void testAsercionesArraysDiferentes() {
		
		int[] arrayEsperado = {1, 2, 3};
		int[] arrayActual = {1, 2};
				
		assertArrayEquals(arrayEsperado, arrayActual, "Ambas arrays deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones arrays")
	void testAsercionesArraysNulls() {
		
		int[] arrayEsperado = {1, 2, 3};
		int[] arrayActual = null;
				
		assertArrayEquals(arrayEsperado, arrayActual, "Ambas arrays deberian ser iguales");
	}
	
	@Test
	@DisplayName("Probar las aserciones throws")
	void testAsercionesThrows() {
		
		Calculadora calculadora = new Calculadora();
		
		assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0), "El metodo a dividir deberia lanzar una exception");
	}
	
	@Test
	@DisplayName("Probar las aserciones throws")
	void testAsercionesThrowsNullPointexception() {
		
		Calculadora calculadora = new Calculadora();
		
		NullPointerException exception = assertThrows(NullPointerException.class, () -> calculadora.dividir(5, 0), "El metodo a dividir deberia lanzar una exception");
		
		assertEquals("/ by zero", exception.getMessage());
	}
	
	@Test
	@DisplayName("Probar las aserciones throws")
	void testAsercionesThrowsArithmeticException() {
		
		Calculadora calculadora = new Calculadora();
		
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0), "El metodo a dividir deberia lanzar una exception");
		
		assertEquals("/ by zero", exception.getMessage());
		
		assertDoesNotThrow(() -> calculadora.dividir(5, 0));
	}
	
	@Test
	@DisplayName("Probar las aserciones timeOut")
	void testAsercionesTimeout() {		
	
			String mensaje =assertTimeout(Duration.ofMillis(1000), () -> {
				Thread.sleep(500);
				return "Hola";
			});
			
			assertEquals("Hola", mensaje);
	}
	
	@Test
	@DisplayName("Probar las aserciones timeOut")
	void testAsercionesTimeoutExced() {		
	
			String mensaje =assertTimeout(Duration.ofMillis(1000), () -> {
				Thread.sleep(3500);
				return "Hola";
			});
			
			assertEquals("Hola", mensaje);
	}
	
	@Test
	@DisplayName("Probar las aserciones timeOut")
	void testAsercionesTimeoutPreemptyvely() {		
	
			String mensaje =assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
				Thread.sleep(900);
				return "Hola";
			});
			
			assertEquals("Hola", mensaje);
	}
}
