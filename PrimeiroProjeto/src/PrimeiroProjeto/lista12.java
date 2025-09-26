package PrimeiroProjeto;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		
		//1 - Contador:
				int numero = 1;
				do {
					System.out.println(numero);
					numero++;
				} while (numero <= 30);
				
				System.out.println("-------");
		
		//2 - Adivinhação de número:
				int num;
				do {
					System.out.println("Qual o número? ");
					num = scanner.nextInt();
					} while(num != 5);
				System.out.println("Acertou o numero! ");
				
				System.out.println("-------");
		
		//3 - Verificação de peso na mala:
				int peso;
				
				do {
					System.out.println("Qual é o peso da mala?");
					peso= scanner.nextInt();
					 if(peso >= 23){
						System.out.println("Peso excedido! Tente novamente.");
					} else {
						System.out.println("Peso dentro do limite!");
					} 
				} while (peso >= 23);
				
				System.out.println("-------");
	
				
		//4 - Verificar quantidade de páginas lidas na semana:
				
				int dias = 1; 
				int totalPag = 0;
				
				do {
					System.out.println("Quantos páginas você leu hoje? ");
					int leu = scanner.nextInt();
							totalPag = totalPag + leu; 
					dias++;//+1
				} while (dias <= 7);
				System.out.println("Você leu: " + totalPag + " páginas na semana");
				
				System.out.println("-------");
				
		//5 - Testar código de acesso:
				
				int codigo;
				
				do {
					System.out.println("Qual é o código?");
					codigo= scanner.nextInt();
					 if(codigo != 789){
						System.out.println("Errado! Tente novamente.");
					} else {
						System.out.println("Acertou o código!");
					} 
				} while (codigo != 789);
				
				System.out.println("-------");
				
		//6 - Verificar nível de combustivel:
				
				int combustivel;
				
				do {
					System.out.println("Quantos litros tem de combustível?");
					combustivel= scanner.nextInt();
					 if(combustivel <= 10){
						System.out.println("Combustível baixo.");
					} else {
						System.out.println("Combustível suficiente");
					} 
				} while (combustivel <= 10);
				
				System.out.println("-------");
				
		//7 - Contar Kilômetros Percorridos:
				
				int distancia;
				int km = 0;
				do {
					System.out.println("Digite a distância percorrida:");
					distancia = scanner.nextInt();
					if (distancia > 0) {
						km += distancia;
					}
				} while (distancia > 0);
				System.out.println("Total de quilômetros percorridos: " + km);

				
	
				
		
		
		
		
		
		

	}

}
