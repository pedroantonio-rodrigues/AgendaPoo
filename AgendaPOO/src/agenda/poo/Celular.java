package agenda.poo;

public class Celular {
	
	public String Numero;
	
	public Celular(String Numero) {
		
		this.Numero = Numero;  
	}
	
	public void verificaNumero() {
		
		if (this.Numero == null) {
			System.out.println("numero de telefone invalido");
		}
	
	}
}


