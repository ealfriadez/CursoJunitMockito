package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class CalculadoraTestBeforeAll {

	Calculadora calculadora;
	
	private static Date fechaInicio;
	private static Date fechaFin;
	
	@BeforeAll
	static void beforeAll() {
		fechaInicio = new Date();
		System.out.println("Iniciando pruebas: " + fechaInicio);
	}
	
	@AfterAll
	static void afterAll() {
		fechaFin = new Date();
		System.out.println("Finalizando pruebas: " + fechaFin);
		
		System.out.println((fechaFin.getTime() - fechaInicio.getTime()));
	}
	
	@BeforeEach
	void setup() {
		calculadora = new Calculadora();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Ejecutado afterEach");
	}
	
	@Disabled
	@Test
	void testSumar() {				
		int resultado = calculadora.sumar(8, 5);
		
		assertEquals(13, resultado);
	}
	
	@Disabled
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
	
	@Test
	void testMultiplicarBucle() {	
		System.out.println("testMultiplicarBucle");
		
		int resultado = calculadora.multiplicarBucle(10, 0);
		
		assertEquals(0, resultado);
	}
	
	@Timeout(1)
	@Test
	void testShouldTakeLongTime() throws InterruptedException {
		Thread.sleep(800);
	}	
}
