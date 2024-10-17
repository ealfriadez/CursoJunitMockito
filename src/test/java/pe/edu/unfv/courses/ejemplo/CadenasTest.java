package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class CadenasTest {

	private Cadenas cadenas;
	
	@BeforeEach
	void setup() {
		cadenas = new Cadenas();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"", "  "})	
	@NullSource
	@EmptySource	
	void testCadenaEsVacia1(String cadena) {
		
		boolean resultado = cadenas.esBlanco(cadena);
		
		assertTrue(resultado);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"", "  "})
	@NullAndEmptySource	
	void testCadenaEsVacia(String cadena) {
		
		boolean resultado = cadenas.esBlanco(cadena);
		
		assertTrue(resultado);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	void testEnumerados2(Month month) {
	
		int monthNumber = month.getValue();
		
		assertTrue(monthNumber > 0 && monthNumber <= 12);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	void testEnumerados(Month month) {
	
		int monthNumber = month.getValue();
		
		assertTrue(monthNumber > 0 && monthNumber <= 12);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	void testEnumeradosPlus(Month month) {
	
		int dias = month.length(false);
		
		assertEquals(30, dias);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}, mode = Mode.EXCLUDE)
	void testEnumeradosPlusPlus(Month month) {
	
		int dias = month.length(false);
		
		assertEquals(31, dias);		
		
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {".+BER"}, mode = Mode.MATCH_ANY)
	void testEnumeradosPlusPlus_(Month month) {		
		
	}
}
