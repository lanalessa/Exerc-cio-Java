package PrimeiroProjeto;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int contador = 11;
		do {
			System.out.println("Do...While");
			contador++;
		} while (contador <= 10);

		while (contador <= 10) {
			System.out.println("while");
		}

		System.out.println("-------------------------");
		int numero = 0;
		do {
			System.out.println(numero);
			numero += 5;
		} while (numero <= 20);

		System.out.println("-------------------------");

		int secreto = 5;
		int escolha = 0;
		do {
			System.out.println("Escolha um número: ");
			escolha = sc.nextInt();
			if (escolha > secreto) {
				System.out.println("É menor");
			} else if (escolha < secreto) {
				System.out.println("É maior");
			}
		} while (secreto != escolha);
		System.out.println("Acertou!!");

		System.out.println("-------------------------");

		System.out.println("Escolha uma opcao do menu");
		System.out.println("1 - Ficar na navegação");
		System.out.println("2 - Sair da navegação");
		int opcao = sc.nextInt();
		do {
			System.out.println("Escolha novamente uma opção do menu");
			opcao = sc.nextInt();
		} while (opcao != 2);

		/*
		 * peca uma idade cinco vezes para o usuario, se a idade for menor ou igual a
		 * 12, mostre "CRIANÇA" senão, mostre "NÃO E CRIANÇA"
		 */

		int idade;
		int cont = 1;
		do {
			System.out.println("Informe uma idade");
			idade = sc.nextInt();
			if (idade <= 12) {
				System.out.println("CRIANÇA");
			} else {
				System.out.println("NÃO É CRIANÇA");
			}
			cont++;
		} while (cont <= 5);
		System.out.println("FIM");
		
		
		/*Pergunte a nota para o usuario três vezes, se a nota for menor que cinco
		 * mostre "nota ruim" senao, mostre "nota boa"*/
		
		int nota;
		int cont1 = 1;
		do {
			System.out.println("Informe sua nota: ");
			nota = sc.nextInt();
			if (nota < 5 ) {
				System.out.println("Nota ruim");
			} else { 
				System.out.println("Nota boa");
			}
			cont1++;
		}while (cont1 <= 3);
		System.out.println("Diario Fechado");
		
		
		
		
		
	}
}
