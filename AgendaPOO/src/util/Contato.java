package util;

public class Contato {
	
	private String nome;
	private String Sobrenome;
	private String Celular;
	private String Telefone;
	private String Email;
	
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.Sobrenome = sobrenome;
	}
	
	public String validaNome() {
		if (nome == null) {
			return "Favor iserir um nome no contato";
		}else {
			 return nome;
		}
	}

}
