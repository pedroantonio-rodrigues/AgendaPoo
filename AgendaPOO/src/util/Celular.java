package util;

public class Celular {
	
	private String Celular;

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		this.Celular = celular;
	}
	public String validaCelular() {
		if (Celular == null) {
			return "Digite um numero valido";
		}else {
			return Celular;
		}
	}
	
}
