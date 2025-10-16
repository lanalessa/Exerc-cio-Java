package PrimeiroProjeto;

import java.util.Scanner;

public class listaa17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		// 1
		System.out.println("1 – Criando uma matriz simples");
		int[][] simples = new int[2][3];
		for(int i=0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("numeros["+i+"]["+j+"]: ");
				simples[i][j] = scanner.nextInt();
			}
		}
		System.out.println("\n");
		for(int i=0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(simples[i][j]);
			}
			System.out.println("\n");
		}
		
		
		
		System.out.println("==========");
		
		
		// 2
		System.out.println("2 – Nomes em uma tabela");
		String[][] tabela = new String[3][2];
		for(int i=0; i<3; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println("Nomes["+i+"]["+j+"]: ");
				tabela[i][j] = scanner.next();
			}
		}
		System.out.println("\n");
		for(int i=0; i<3; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println(tabela[i][j]);
			}
			System.out.println("\n");
		}
		
		
		System.out.println("==========");
		
		// 3
		System.out.println("3 – Mostrando a diagonal principal");
		int[][] diagonal = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("Valor: ");
				diagonal[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Diagonal principal");
		for(int i = 0; i<3; i++) {
			System.out.println("numeros["+i+"]["+i+"]:"+ diagonal[i][i]);
		}
		
		System.out.println("==========");
		
		//4
		System.out.println("4 – Procurando um número");
		int[][] numeros = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("Números["+i+"]["+j+"]: ");
				numeros[i][j] = scanner.nextInt();
			}
		}
		System.out.println("\n");
		System.out.println("Digite um valor para ser encontrado: ");
		int procurado = scanner.nextInt();
		int contador = 0;
		
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(numeros[i][j] == procurado) {
					System.out.println("Número encontrado na posição ["+i+"]["+j+"]");
					contador++;
				}
			}
		}
		if(contador == 0) {
			System.out.println("Número não encontrado na matriz.");
		}
			
		System.out.println("==========");
		
		//5
		System.out.println("5 – Elementos maiores que 10");
		int[][] matriz = new int[4][3];
		for(int i=0; i<4; i++) {
		    for(int j=0; j<3; j++) {
		        System.out.println("Valor["+i+"]["+j+"]: ");
		        matriz[i][j] = scanner.nextInt();
		    }
		}
		System.out.println("Valores maiores que 10:");
		for(int i=0; i<4; i++) {
		    for(int j=0; j<3; j++) {
		        if(matriz[i][j] > 10) {
		            System.out.println("matriz["+i+"]["+j+"] = " + matriz[i][j]);
		        }
		    }
		}
		

		


	}

}
