package pe.edu.unfv.courses.ejemplo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CadenaMayuscula {

	@ParameterizedTest
	@CsvSource({"java,JAVA", "Java,JAVA", "JAVa, JAVA"})
	void testAsetionsObjetoNull(String valorEntrada, String valorEsperado) {
				
		//assertEquals(valorEsperado, Cadenas);
	}
}
