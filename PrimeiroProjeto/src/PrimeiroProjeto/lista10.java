package PrimeiroProjeto;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in); 
		Scanner sc = new Scanner (System.in);
		
		//1 - Contador:
		int contador = 10;
		while (contador <= 30){
			System.out.println(contador);
			contador++; // +1 
		}

		
		System.out.println("-------------------------");
		//2 - Soma de Números Digitados:
		
		
		int contador2 = 1;
		int soma = 0;
		while (contador2 <= 3){
			System.out.println("Digite o número "+ contador2 + ":");
			int numero = sc.nextInt();
			soma = soma + numero;
			contador2++;
		}
		
		System.out.println("A soma é: "+ soma);
		
		
		System.out.println("-------------------------");
		//3 - Multiplicação de Números Digitados:
		
	
		int cont = 1;
		int mult = 1;
		while (cont <= 5){
			System.out.println("Digite o número "+ cont + ":");
			int numero = sc.nextInt();
			mult = mult * numero;
			cont++;
		}
		System.out.println("A multiplicação é: "+ mult);
		
		
		
		
		System.out.println("-------------------------");
		//4 - Contar até o número informado:
		
				System.out.println("Digite um número: ");
				int numero2 = scanner.nextInt();
				int num =1;
				while (num <= numero2) {
					System.out.println(num);
					num++; //-1
				}
		
		
		System.out.println("-------------------------");
		//5 - Somar os números de 1 a 5:
				int num1 = 1;
				int dois = 0;
				
				while(num1 <= 5) {
					dois = dois + num;
					num1++;
				}
				System.out.println("A soma do 1 a 5 é: " + dois);
				System.out.println("-------------------");
		
		
		System.out.println("-------------------------");
		//6 - Tabuada
				System.out.println("Digite um número para ver a tabuada dele: ");
				int tabuada = scanner.nextInt();
				int i = 1;
				while (i <= 10) {
					System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
					i++;
				}
		
		
		
		
		
		
	}

}
