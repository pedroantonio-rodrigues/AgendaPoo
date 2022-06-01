package util;

public class Celular {

	private String celular;

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String validaCelular() {
		if (celular == null) {
			return "Digite um numero valido";
		} else {
			return celular;
		}
	}

}
