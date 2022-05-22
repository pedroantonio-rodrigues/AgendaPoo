package agenda.poo;

public class Telefone {

	public String Numero;

	public Telefone(String Numero) {
		this.Numero = Numero;
	}

	public void verificaNumero() {
		if (this.Numero == null) {
			System.out.println("O telefone precisa de numeros ");
		}
	}
}
