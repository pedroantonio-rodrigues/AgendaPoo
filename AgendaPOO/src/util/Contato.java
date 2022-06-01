package util;

public class Contato {

	private String nome;
	private String sobrenome;

	// injeção de de pendecia das classes Celular, Telefone e Email
	private Celular celular;
	private Telefone telefone;
	private Email email;

	// metodo construtor da classe Contato passando os parametros(nome, sobrenome,
	// celular, telefone e email)
	public Contato(String nome, String sobrenome, Celular celular, Telefone telefone, Email email) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.celular = celular;
		this.telefone = telefone;
		this.email = email;
	}

	
	public Contato() {
	
	}


	public Contato(String nome, String sobrenome, String celular, String telefone, String email) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append("\nSobrenome: " + sobrenome);
		return sb.toString();
	}
}
