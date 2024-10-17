package pe.edu.unfv.courses.ejemplo;

public class Calculadora {

	public int sumar(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}
	
	public int multiplicarBucle(int valor1, int valor2) {
		int resultado = 0;
		
		for (int i = 1; i <= valor2; i++) {
			resultado = hacerSuma(valor1, resultado);
		}
		
		return resultado;
	}

	private int hacerSuma(int valor1, int resultado) {
		resultado = resultado + valor1;
		return resultado;
	}
	
	public int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}
	
	public boolean esImpar(int valor) {
		return (valor % 2) != 0;
	}
}
