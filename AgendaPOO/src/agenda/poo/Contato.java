package agenda.poo;

public class Contato {

	public String Nome;
	public String Sobrenome;
	public String Numero;

	public Contato(String Nome, String Sobrenome, String Numero) {
		this.Nome = Nome;
		this.Sobrenome = Sobrenome;
		this.Numero = Numero;
	}

	public void verificaNome() {
		if (this.Nome == null) {
			System.out.println("O contato precisa ter um nome!");
		}

	}

	public void verificaNumero() {
		if (this.Numero == null) {
			System.out.println("O contato precisa ter um numero!");
		}
	}
}
