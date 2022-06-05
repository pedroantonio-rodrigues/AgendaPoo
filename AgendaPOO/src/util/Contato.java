package util;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
	private String sobrenome;

	// injeção de dependecia das classes Celular, Telefone e Email
	private List<Celular> celulares = new ArrayList<>();
	private List<Telefone> telefones = new ArrayList<>();
	private List<Email> emails = new ArrayList<>();

	// metodo construtor da classe Contato passando os parametros(nome, sobrenome)
	public Contato(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Contato() {
	
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

	public List<Celular> getCelular() {
		return celulares;
	}

	public List<Telefone> getTelefone() {
		return telefones;
	}
	
	public List<Email> getEmail() {
		return emails;
	}
	public void addCelular(Celular celular) {
		celulares.add(celular);
	}
	public void removeCelular(Celular celular) {
		celulares.add(celular);
	}
	public void addTelefone(Telefone telefone) {
		telefones.add(telefone);
	}
	public void removeTelefone(Telefone telefone) {
		telefones.add(telefone);
	}
	public void addEmail(Email email) {
		emails.add(email);
	}
	public void removeEmail(Email email) {
		emails.add(email);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append("\nSobrenome: " + sobrenome);
		return sb.toString();
	}
}
