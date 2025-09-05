package PrimeiroProjeto;

import java.util.Scanner;

public class lista09 {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		
		
		// 1 - Contador:
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++; 
		}

		System.out.println("---------------------");

		// 2 - Contagem regressiva:
		int num = 10;
		while (num >= 1) {
			System.out.println(num);
			num--; 
		}

		System.out.println("---------------------");

		// 3 - Sequência numérica:
		int num2 = 5;
		while (num2 <= 100) {
			System.out.println(num2);
			num2 += 5; 
		}
		
		System.out.println("---------------------");
		
		//4 - Mostrando mensagem:
		
		int msg = 1;
		while (msg <= 5) {
			System.out.println("Eu gosto de Java");
			msg ++; 
		}
		System.out.println("---------------------");
		//5 - Soma de Números Digitados:
		int soma = 0;
		int valor;
		int contador = 1;
		
		while (contador <=5) {
			System.out.println("Digite 5 números: ");
			valor = scanner.nextInt();
			soma += valor;
			contador += 1 ;
		}
		System.out.println("A soma dos números é: "+ soma);
		System.out.println("---------------------");
		
		//6 - Validação de Senha:
		
		System.out.println("Digite a senha ");
		int senha = scanner.nextInt();
		while (senha != 1234) {
			System.out.println("Errado! Tente novamente");
			senha = scanner.nextInt();
		}
		System.out.println("Você acertou a senha!");
		
		
		//7 - Contagem Regressiva:
		System.out.println("Digite um número: ");
		int numero2 = scanner.nextInt();
		
		while (numero2 >=1) {
			System.out.println(numero2);
			numero2--; //-1
		}

		
		
		
		
	}

}
