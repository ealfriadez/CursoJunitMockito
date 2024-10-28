package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CadenasTest2 {

	@ParameterizedTest(name="Indice: {index}, la cadena {0} en mayusculas seria: {1}")
	@CsvSource(value={"java|JAVA", "Java|JAVA", "JAVa|JAVA"}, delimiter='|')
	void testEsBlanco(String valorEntrada, String valorEsperado) {
		
		Cadenas cadenas = new Cadenas();
		
		assertEquals(valorEsperado, cadenas.pasarMayuscula(valorEntrada));
		
	}
	
	@ParameterizedTest(name="Indice: {index}, la cadena {0} en mayusculas seria: {1}")	
	@CsvFileSource(resources = "/datos.csv", delimiter = ':', numLinesToSkip = 1)
	void testCadenaMayuscula(String valorEntrada, String valorEsperado) {
		
		Cadenas cadenas = new Cadenas();
		
		assertEquals(valorEsperado, cadenas.pasarMayuscula(valorEntrada));
		
	}

}
