package PrimeiroProjeto;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		int opcao = 2;
//
//		switch (opcao) {
//		case 1:
//			System.out.println("O número é 1");
//			break;
//		case 2:
//			System.out.println("O número é 2");
//			break;
//		default:
//			System.out.println("Número incorreto.");
//		}
//
//		// Cardápio da cantina
//		System.out.println("Qual produto deseja? ");
//		System.out.println("1 - Suco");
//		System.out.println("2 - lanche");
//		System.out.println("3 - chocolate");
//		int escolha = scanner.nextInt();
//		switch (escolha) {
//		case 1:
//			System.out.println("Pague R$4.00");
//			break;
//		case 2:
//			System.out.println("Pague R$7.00");
//			break;
//		case 3:
//			System.out.println("Pague R$5.00");
//			break;
//		default:
//			System.out.println("Opção Incorreta");
//		}
//
//		/* Peça um valor para o usuário, se for igual 1 ou 2, mostre "muito bom" se for
//		 * igual igual 3 ou 4 mostre "bom", senão mostre "ruim" */
//
//		int valor = 5;
//		switch (valor) {
//		case 1:
//		case 2:
//			System.out.println("Muito bom");
//			break;
//		case 3:
//		case 4:
//			System.out.println("bom");
//			break;
//		default:
//			System.out.println("ruim");
//		}
		
		Scanner scanner = new Scanner(System.in);

		int escolha;
		System.out.println("Digite um número e veja uma cor ");
		escolha = scanner.nextInt();

		switch(escolha) {
		case 1:
		System.out.println("Vermelho");
		break;
		case 2:
		System.out.println("Azul");
		break;
		default:
			System.out.println("Opção inválida");
		}
		//--------------------------------------------------
		
		
		int escolha1;
		System.out.println("Digite um número e veja uma cor ");
		escolha1 = scanner.nextInt();

		switch(escolha1) {
		case 1:
		System.out.println("Vermelho");
		break;
		case 2:
		System.out.println("Azul");
		break;
		default:
			System.out.println("Opção inválida");
		}
		
		//--------------------------------------------------
		System.out.println("Qual categoria você pertence?");
		String categoria = scanner.next();
		switch (categoria.toUpperCase()) {
		case "A":
		System.out.println("Infantil");
		break;
		case "B":
			System.out.println("Juvenil");
			break;
			default:
				System.out.println("Categoria Incorreta");
		}
		
		//-------------------------------------------------
		
		System.out.println("Escolha a operação matemática de dois números");
		String operacao = scanner.next();
		switch (operacao) {
		case "+":
			int adicao = 5 + 5;
			System.out.println(adicao);
			break;
		case "-":
			int subtracao = 5 - 5;
			System.out.println(subtracao);
			break;
		case "*":
			int multi = 5 * 5;
			System.out.println(multi);
			break;
		case "/":
			int divisao = 5 / 5;
			System.out.println(divisao);
			break;
			default:
				System.out.println("Operação Incorreta");
		}
		
		System.out.println();
		
		
		
		
		
	}
}
