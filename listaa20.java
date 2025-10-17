package PrimeiroProjeto;

import java.util.Scanner;

public class listaa20 {

	public static void main(String[] args) {
		
			dia();
			dia();
			dia();
			dia();
			dia();
			linha();
			System.out.println("\n");
			retangulo();
			linha();
			System.out.println("\n");
			contagem();
			linha();
			System.out.println("\n");
			crescente();
			System.out.println("Pronto!");
			linha();
			System.out.println("\n");
			dias();
			linha();
			System.out.println("\n");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insira um número: ");
			int numero = scanner.nextInt();
			divisivel(numero);
			linha();
			System.out.println("\n");
			System.out.println("Qual é o seu nome? ");
			String nome = scanner.next();
			System.out.println("Olá " + nome +"!");
			linha();
			System.out.println("\n");
			System.out.println("Informe o primeiro nome: ");
			String nomes = scanner.next();
			System.out.println("Informe o sobrenome: ");
			String nomes2 = scanner.next();
			nomes(nomes, nomes2);
			linha();
			System.out.println("\n");
			
			System.out.println("Informe o número:");
			int numero1 = scanner.nextInt();
			num(numero1);
			linha();
			System.out.println("\n");
			
			
			System.out.println("Informe a velocidade: ");
			int vel = scanner.nextInt();
			velocidade(vel);
			linha();
			System.out.println("\n");
			
			System.out.println("Informe um dia da semana: ");
			String semana = scanner.next();
			semana(semana);
			linha();
			System.out.println("\n");
			
			System.out.println("Informe a quantidade de itens: ");
			int estoque = scanner.nextInt();
			estoque(estoque);
			linha();
			System.out.println("\n");
			
			

		}
		public static void linha() {
			System.out.println("-------------");
		}
		 
		// ------------------------------------------------------
			// Função sem Parâmetro
		
		// 1
		public static void dia() {
		System.out.println("Bom Dia!");
		
		
	}
		

		// 2
		public static void retangulo() {
			System.out.println("* * * * *");
			System.out.println("*       *");
			System.out.println("* * * * *");
			
		}

		//3 
		public static void contagem() {
			for(int i =5; i<= 25; i+=5) {
				System.out.println(i);
			}
		}
		
		//4
		public static void crescente() {
			for(int i =1; i<= 8; i++) {
				System.out.println(i);
				
	} 
			}
		
		//5
		public static void dias() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
		}
		
		// ------------------------------------------------------
		// Função com Parâmetro

		// 1 
		public static void divisivel(int numero) {
			if (numero % 5 == 0) {
				System.out.println("O número "+numero+" é divisível.");
			} else {
				System.out.println("O número "+numero+" não é divisível.");
			}
		}
		
		// 2 
		public static void saudacao(String nome) {
			System.out.println("Olá " + nome);
			}
		
		//3 
		public static void nomes(String nomes, String nomes2) {
			System.out.println(nomes+" " +  nomes2);
		}
		
		
		//4
		public static void num (int numero1) {
			if (numero1 >= 100) {
				System.out.println("O número "+numero1+" é maior que 100.");
			} else {
				System.out.println("O número "+numero1+" é menor que 100.");
			}
		}
		
		
		// 5 
			public static void velocidade(int vel) {
				if (vel < 40) {
					System.out.println("Lenta");
				} else if (vel > 40 && vel < 80){
					System.out.println("Normal");
				} else if (vel > 80){
					System.out.println("Rápida");
				}
			}
			
			
			// 6 
			public static void semana(String semana) {
				System.out.println("Tenha uma ótima "+semana+"!");
			}
			
			
			// 7 
			public static void estoque(int estoque) {
				if (estoque >= 10) {
					System.out.println("Estoque suficiente.");
				} else if (estoque >= 5 && estoque < 10){
					System.out.println("Estoque baixo.");
				} else if (estoque < 5){
					System.out.println("Estoque crítico.");
				}
			}

	}