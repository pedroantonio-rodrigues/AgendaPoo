package application;
import agenda.poo.Agenda;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= Bem Vindo a Agenda de Contatos =====");
		System.out.println("1 -  Listar contatos");
		System.out.println("2 -  Adicionar contatos");
		System.out.println("3 -  Visualizar contato detalhado");
		System.out.println("4 -  Editar contato existente");
		System.out.println("5 -  Excluir Contato Existente ");
		
		Agenda agenda = new Agenda();
		
		int opcao = 5;
		switch(opcao) {
		case 1 :
			
			System.out.println(agenda);
			break;
			
		case 2 :
	
			System.out.println("Nome do contato: ");
			agenda.Nome = sc.nextLine();
			System.out.println("Sobrenome: ");
			agenda.Sobrenome = sc.nextLine();
			System.out.println("Celular: ");
			agenda.Celular = sc.nextLine();
			System.out.println("Telefone: ");
			agenda.Telefone = sc.nextLine();
			System.out.println("Email: ");
			agenda.Email = sc.nextLine();
			
			break;
		case 3 :
			System.out.println(agenda.toString());
			break;
		case 4 :
			agenda.editaContatos();
			break;
		case 5 :
			agenda.removeContatos();
			break;
			
			default :
				System.out.println("escolha umas das opçoes acima");;
		
		}
		
		sc.close();
		

	}

}
