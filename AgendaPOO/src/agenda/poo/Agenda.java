package agenda.poo;

import java.util.ArrayList;

import util.Contato;

public class Agenda {

	private ArrayList<Contato> contatos;

	// contrutor Agenda
	public Agenda(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	// metodo getContato
	public ArrayList<Contato> getContato() {
		return contatos;
	}

	// metodo setContato
	public void setContato(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	public void imprimeTodosContatosDaAgenda() {
		this.contatos.forEach(pessoas -> {
			System.out.println(pessoas);
		});
	}

	public void imprimeContatoDetalhado(String nome) {
		this.contatos.indexOf(contatos);
		for (Contato x : contatos)
			System.out.println(x);
	}

	public void removeContato(String nome) {
		this.contatos.removeIf(x -> x.getNome() == nome);
		for (Contato x : contatos) {
			System.out.println(x);
		}
	}

	public void editaContato(String nome) {

	}

}
