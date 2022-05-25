package util;

public class Celular {
	
	private static String Celular;

	public static String getCelular() {
		return Celular;
	}

	public static void setCelular(String celular) {
		Celular = celular;
	}
	public String validaCelular() {
		if (Celular == null) {
			return "Digite um numero valido";
		}else {
			return Celular;
		}
	}
	
}
