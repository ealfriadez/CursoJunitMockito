package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class CadenasVacias {

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
	
	@ParameterizedTest
	@MethodSource()
	//@MethodSource("generaDatosPrueba")
	void testCadenaEsVaciaNew(String cadena, boolean valorEsperado) {	
		
		assertEquals(valorEsperado, cadenas.esBlanco(cadena));	
	}
	
	@ParameterizedTest
	@MethodSource("providesBlankSource")
	void testCadenaEsVaciaNewPlus(String cadena) {	
		
		assertTrue(cadenas.esBlanco(cadena));	
	}
	
	public static Stream<String> providesBlankSource(){
		return Stream.of("", null, "   ");
	}
	
	@ParameterizedTest
	@MethodSource("pe.edu.unfv.courses.ejemplo.OrdenandoTest#providesBlankSource")
	void testCadenaEsVaciaNewInClass(String cadena) {	
		
		assertTrue(cadenas.esBlanco(cadena));	
	}
	
	private static Stream<Arguments> testCadenaEsVaciaNew(){
		return Stream.of(Arguments.of("", true), 
				Arguments.of(null, true),
				Arguments.of("   ", true),
				Arguments.of(" No vacia ", false));
	}
	
	@ParameterizedTest
	@MethodSource
	public void testNombreCompleto(Persona persona, String resultadoEsperado) {
		
		assertEquals(resultadoEsperado, persona.getNombreCompleto());
	}
	
	private static Stream<Arguments> testNombreCompleto(){
		return Stream.of(
					Arguments.of(new Persona("Carlos", "Ruiz"), "Carlos Ruiz"),
					Arguments.of(new Persona("Santiago", "Alfriadez"), "Santiago Alfriadez"),
					Arguments.of(new Persona("Sebastian", "Alfriadez"), "Sebastian Alfriadez")
				);
	}
}
