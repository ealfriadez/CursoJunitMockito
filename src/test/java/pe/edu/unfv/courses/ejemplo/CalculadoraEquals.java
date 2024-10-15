package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraEquals {

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
}
