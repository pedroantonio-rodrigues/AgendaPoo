package agenda.poo;

import util.Contato;
public class Agenda {

	public String Nome;
	public String Sobrenome;
	public String Celular;
	public String Telefone;
	public String Email;

	public Agenda(String Nome, String Sobrenome, String Celular, String Telefone, String Email) {

		Contato.setNome(this.Nome = Nome);
		Contato.setSobrenome(this.Sobrenome = Sobrenome);
		util.Celular.setCelular(this.Celular = Celular);
		util.Telefone.setTelefone(this.Telefone = Telefone);
		util.Email.setEmail(this.Email = Email);
		
	}
	
	public Agenda() {
		
	}

	public void addContatos() {
		new Agenda();
	}
	
	public void removeContatos() {
		
	}
	public void editaContatos() {
		
	}
	
	public String toString() {
		return Nome
				+ "\n "
				+ Sobrenome 
				+ "\n "
				+ Celular
				+ "\n"
				+ Telefone
				+ "\n"
				+ Email;
				
	}
	
	
}
