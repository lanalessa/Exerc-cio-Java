package PrimeiroProjeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero =1;
		while (numero <=5) {
			System.out.println(numero);
			numero++; // +1
		}
		
		//--------------------------------------------
		
		int numero2 = 5;
		while (numero2 >=1) {
			System.out.println(numero2);
			numero2--; //-1
		}
		
		//--------------------------------------------
		
		int soma = 0;
		int valor;
		int contador = 1;
		
		while (contador <=3) {
			System.out.println("Digite 3 números: ");
			valor = scanner.nextInt();
			soma += valor;
			contador += 1 ;
		}
		System.out.println("A soma dos números é: "+ soma);
		
		//--------------------------------------------
		
		System.out.println("Digite sair para sair do sistema ");
		String resposta = scanner.next();
		while (!resposta.equalsIgnoreCase("Sair")) {
			System.out.println("Tente novamente");
			resposta = scanner.next();
		}
		System.out.println("Você conseguiu sair");
		
		//Peça um número para o usuario e mostre os números do 1 até chegar no numero q ele digitou
		
		int num;
		int aux =1;
		System.out.println("Digite um número: ");
		num = scanner.nextInt();
		while (aux <= num) {
			System.out.println(aux);
			aux ++;
		}
		
		// Peça um número para o usuario e continue  pedindo enquanto o numero for diferente de 7 
		System.out.println("Digite um valor: ");
		int valor7 = scanner.nextInt();
		while (valor7 != 7) {
			System.out.println("Tente novamente");
			valor7 = scanner.nextInt();
		}
		System.out.println("Você escolheu o 7");
		
		
		
		

		

	}

}
