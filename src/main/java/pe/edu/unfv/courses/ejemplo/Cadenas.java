package pe.edu.unfv.courses.ejemplo;

public class Cadenas {

	public boolean esBlanco(String cadena) {
		return cadena == null || cadena.trim().isEmpty();
	}
	
	public String pasarMayuscula(String cadena) {
		return cadena.toUpperCase();
	}
}
