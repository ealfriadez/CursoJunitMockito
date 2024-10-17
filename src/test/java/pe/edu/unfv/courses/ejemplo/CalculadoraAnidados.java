package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculadoraAnidados {	

	// TEST ANIDACIONES
	@Nested
	@DisplayName("Pruebas unitarias de la operacion suma")
	class TestOperacionesSuma {
		Calculadora calculadora;

		@BeforeEach
		void setup() {
			System.out.println("@BeforeEach padre");
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
		void testSumarCero() {
			int resultado = calculadora.sumar(80, 0);

			assertEquals(80, resultado);
		}
	}

	// TEST ANIDACIONES
	@Nested
	@DisplayName("Pruebas unitarias de la operacion multiplicacion")
	class TestOperacionesMultiplicacion {
		Calculadora calculadora;

		@BeforeEach
		void setup() {
			System.out.println("@BeforeEach padre");
			calculadora = new Calculadora();
		}

		@AfterEach
		void afterEach() {
			System.out.println("Ejecutado afterEach");
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

	// TEST ANIDACIONES
	@Nested
	@DisplayName("Pruebas unitarias de la operacion division")
	class TestOperacionesDivision {
		Calculadora calculadora;

		@BeforeEach
		void setup() {
			System.out.println("@BeforeEach padre");
			calculadora = new Calculadora();
		}

		@AfterEach
		void afterEach() {
			System.out.println("Ejecutado afterEach");
		}

		@Test
		void testDividir() {
			int resultado = calculadora.dividir(25, 5);

			assertEquals(5, resultado);
		}
	}
	
	// TEST ANIDACIONES
		@Nested
		@DisplayName("Pruebas unitarias de la operacion impares")
		class TestImpar {
			Calculadora calculadora;

			@BeforeEach
			void setup() {
				System.out.println("@BeforeEach impar");
				calculadora = new Calculadora();
			}

			@AfterEach
			void afterEach() {
				System.out.println("Ejecutado afterEach impar");
			}

			@Test
			void testImpar21() {
				boolean resultado = calculadora.esImpar(21);

				assertTrue(resultado);
			}
			
			@Test
			void testImpar33() {
				boolean resultado = calculadora.esImpar(33);

				assertTrue(resultado);
			}
			
			@Test
			void testPar27() {
				boolean resultado = calculadora.esImpar(27);

				assertFalse(resultado);
			}
		}
}
