package util;

public class Contato {
	
	private static String nome;
	private static String Sobrenome;
	
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Contato.nome = nome;
	}
	public static String getSobrenome() {
		return Sobrenome;
	}
	public static void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	public String validaNome() {
		if (nome == null) {
			return "Favor iserir um nome no contato";
		}else {
			 return nome;
		}
	}

}
