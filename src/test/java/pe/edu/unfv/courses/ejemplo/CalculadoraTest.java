package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calculadora;
	
	@BeforeEach
	void setup() {
		calculadora = new Calculadora();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Ejecutado afterEach");
	}
	
	@Test
	void testSumar() {				
		int resultado = calculadora.sumar(8, 5);
		
		assertEquals(13, resultado);
	}
	
	@Test
	void testMultiplicarCero() {			
		int resultado = calculadora.multiplicar(10, 0);
		
		assertEquals(0, resultado);
	}

	@Test
	void testMultiplicar() {		
		int resultado = calculadora.multiplicar(10, 35);
		
		assertEquals(350, resultado);
	}	
}
