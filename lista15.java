package PrimeiroProjeto;

import java.util.Scanner;

public class lista15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1 - Criando um vetor
		
		String[] frutas = new String[5];
		for(int i= 0; i < 5; i++) {
			System.out.println("Digite as frutas:");
			System.out.print("Fruta["+i+"]: ");
			frutas[i] = sc.next();
			System.out.println("_______");
		}
			for(int i= 0; i < 5; i++) { 
				System.out.println(frutas[i]);
				
			}
			System.out.println("___________");
		
		// 2 - Vetor de números inteiros
			int[] num = new int[10];
			for(int i= 0; i < 10; i++) {
				System.out.println("Digite os números:");
				System.out.print("Número["+i+"]: ");
				num[i] = sc.nextInt();
				System.out.println("_______");
			}
				for(int i= 0; i < 10; i++) { 
					System.out.println(num[i]);
					
				}
				System.out.println("___________");
				
		// 3 - Mostrando os valores na ordem inversa
			int[] valores  = new int[7];
			for(int i= 0; i < 7; i++) {
			System.out.print("Digite o número["+i+"]: ");
			valores [i] = sc.nextInt();
			
					}
			System.out.println("\n\n");
			System.out.println("Valores invertidos: ");
			for(int i =6; i>=0; i--) {
			System.out.println(valores [i]);
					}
			System.out.println("___________");
			
		// 4 - Maiores que 100
			int[] numeros10 = new int[10];
			for (int i = 0; i < 9; i++) {
				System.out.println("Digite um número (" + (i + 1) + "): ");
				numeros10[i] = sc.nextInt();
				if (numeros10[i] > 100) {
					System.out.println(numeros10[i] + " é maior do que 100");
				}
			}
			
			System.out.println("___________");
			
		// 5 - Procurando um valor no vetor
			int[] vetor8 = new int[8];
			for (int i = 0; i < 7; i++) {
				System.out.println("Digite um número (" + (i + 1) + "): ");
				vetor8[i] = sc.nextInt();
			}
			System.out.println("Digite um número para procurar: ");
			int procurar = sc.nextInt();
			boolean achou = false;
			for (int i = 0; i < 7; i++) {
				if (vetor8[i] == procurar) {
					achou = true;
					break;
				}
			}
			if (achou) {
				System.out.println("O número " + procurar + " existe no vetor!");
			} else {
				System.out.println("O número " + procurar + " não foi encontrado.");
			}
			System.out.println("___________");

			// 6 - Nome e idade de 5 pessoas
			String[] nomes = new String[5]; // Faltava essa linha!
			int[] idades = new int[5];
			for (int i = 0; i < 5; i++) {
				System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
				nomes[i] = sc.next();
				System.out.println("Digite a idade de " + nomes[i] + ": ");
				idades[i] = sc.nextInt();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(nomes[i] + " tem " + idades[i] + " anos");
			}

			System.out.println("___________");


			// 7 - Identificação de idade

			int[] idade10 = new int[10];
			for (int i = 0; i < 10; i++) {
			    System.out.println("Digite a idade " + (i + 1) + ": ");
			    idade10[i] = sc.nextInt();

			    if (idade10[i] < 18) {
			        System.out.println("você é menor de idade");
			    }
			}

			System.out.println("___________");

			// 8 - Aumento em massa
			double[] salarios = new double[7];
			for (int i = 0; i < 7; i++) {
			    System.out.println("Digite o salário da pessoa " + (i + 1) + ": ");
			    salarios[i] = sc.nextDouble();

			    if (salarios[i] <= 2500) {
			        System.out.println("você receberá um aumento");
			    }
			}
		

	}
}
