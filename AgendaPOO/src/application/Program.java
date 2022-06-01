package application;

import util.Contato;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import agenda.poo.Agenda;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Contato> contatos = new ArrayList<>();
		Agenda agenda = new Agenda(contatos);
		
		char resp;	
		do {
		
		System.out.println("======= Bem Vindo a Agenda de Contatos =====");
		System.out.println("1 -  Adicionar novo contato");
		System.out.println("2 -  Listar contatos ");
		System.out.println("3 -  Visualizar contato detalhado");
		System.out.println("4 -  Editar contato existente");
		System.out.println("5 -  Excluir Contato Existente ");
		
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			sc.nextLine();
			System.out.println("Nome do contato: ");
			String nome = sc.nextLine();
			System.out.println("Sobrenome: ");
			String sobrenome = sc.nextLine();
			System.out.println("Celular: ");
			String celular = sc.nextLine();
			System.out.println("Telefone: ");
			String telefone = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();

			Contato contato = new Contato(nome, sobrenome, celular, telefone, email);
			
			contatos.add(contato);
			System.out.println("Contato Salvo com sucesso");
			
			break;
		
		case 2:
			agenda.imprimeTodosContatosDaAgenda();
			break;
			
		case 3:
			System.out.println("Digite o nome que deseja ver detalhado");
			String nomeDetalhado = sc.nextLine();
			agenda.imprimeContatoDetalhado(nomeDetalhado);
			break;

		case 4:
			
			break;

		case 5:
			System.out.println("digite o nome do contato que queira excluir: ");
			String nomeRemove = sc.nextLine();
			agenda.removeContato(nomeRemove);
			break;

		default:
			System.out.println("escolha umas das opçoes acima");
		}
		
		System.out.println("desea repetir (s/n)");
		resp = sc.next().charAt(0);

		}while (resp != 'n');
		sc.close();
	}

}
