package PrimeiroProjeto;

import java.util.Scanner;

public class lista14 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		//1 - Contador:
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);
		}
		
		System.out.println("-------");
		
		//2 - Somando números de 1 a 100:
			int soma = 0;
			for (int i = 1; i <= 100; i++) {
			    soma += i; // soma acumulada
			    System.out.println("Soma até " + i + " = " + soma);
			}
			System.out.println("Resultado final da soma de 1 até 100: " + soma);
		
		System.out.println("-------");
		
		//3 - Imprimir números pares de 1 a 20:
		for(int cont = 0; cont <= 20; cont+= 2) {
			System.out.println(cont);
			}
		
		System.out.println("-------");
		
		//4 - Imprimir a tabuada de um número:
		System.out.println("Digite um número para ver a tabuada dele: ");
		int tabuada = scanner.nextInt();
		for(int i = 1; i <= 10;) {
		System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			i++;
		}
		
		
		System.out.println("-------");
		
		//5 - Contar números divisíveis por 3:
		int contadorDiv3 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				contadorDiv3++;
			}
		}
		System.out.println("Existem " + contadorDiv3 + " números divisíveis por 3 entre 1 e 50.");
		
		System.out.println("-------");
		
		//6 - Imprimir números ímpares de 1 a N:
		int n;
		System.out.println("Digite um número:");
		n = scanner.nextInt();
		for(int cont = 1; cont <= n; cont+= 2) {
			System.out.println(cont);
			}
		
		
		System.out.println("-------");
		
		//7 - Multiplicação de valores:
		int multiplicacao = 1;
		for (int i = 1; i <= 5; i++) {
		System.out.println("Informe o valor " + i + ":");
		int valor = scanner.nextInt();
		multiplicacao *= valor;
		}
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		
		System.out.println("-------");
		
		//8 - Premiação da empresa:
		for(int i = 0; i <= 9; i++) {
			System.out.println("Quantos anos você trabalha na empresa? ");
			int anos = scanner.nextInt();
			if (anos > 10) {
				System.out.println("Parabéns! Você irá receber um prêmio");
			} else {
				System.out.println("Quase lá");
			}
		}
		
		
		
		
		
		

	}

}
