package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CadenaMayuscula {

	@ParameterizedTest
	@CsvSource({"java,JAVA", "Java,JAVA", "JAVa, JAVA"})
	void testAsetionsObjetoNull(String valorEntrada, String valorEsperado) {
				
		//assertEquals(valorEsperado, Cadenas);
	}
}
