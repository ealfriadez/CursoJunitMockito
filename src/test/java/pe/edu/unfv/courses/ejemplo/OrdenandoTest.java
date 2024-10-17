package pe.edu.unfv.courses.ejemplo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class OrdenandoTest {

	@Test
	@DisplayName("Test A")
	@Order(3)
	void testUno() {
		System.out.println("Test nro. 1");
	}
	
	@Test	
	void testCuatro() {
		System.out.println("Test nro. 4");
	}
	
	@Test
	@DisplayName("Test B")
	@Order(2)
	void testDos() {
		System.out.println("Test nro. 2");
	}
	
	@Test
	@DisplayName("Test C")
	@Order(1)
	void testTres() {
		System.out.println("Test nro. 3");
	}
}
