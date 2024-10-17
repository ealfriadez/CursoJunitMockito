package pe.edu.unfv.courses.ejemplo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CadenaMayuscula {

	@Test
	@DisplayName("Probar las aserciones booleanassss")
	void testAsetionsObjetoNull() {
		
		String valor = "Hola";
		
		assertNull(null, "El objeto deberia ser nulo");
		assertNotNull(valor, "El objeto deberia no ser nulo");
	}
}
