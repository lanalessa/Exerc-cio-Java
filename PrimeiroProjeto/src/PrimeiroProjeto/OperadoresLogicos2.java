package PrimeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos2 {

	public static void main(String[] args) {


		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		
		System.out.println("Tem titulo de eleitor? ");
		String resposta =scanner.next();
		
		if ( idade >= 16 && resposta.equalsIgnoreCase("sim")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
				// PRA SER VERDADE, TUDO TEM QUE SER VERDADE
		
		System.out.println("Informe um numero: ");
		int numero = scanner.nextInt();
		// OU
		if (numero >= 10 || numero <=20) {
			System.out.println("O número está no intervalo");
		} else { 
			System.out.println("O número não está no intervalo");
		}
		
		//SO UMA PODE SER VERDADEIRA
		
		System.out.println("Qual o valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("É cliente VIP?");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		}else {
			System.out.println("Não tem desconto ");
		}
		
		
		/* Para participar de um workshop precisa ter idade entre 20 e 40 
		 * anos e possuir experiência. Se as informaçoes forem verdadeiras exiba
		 *  "Inscrição aceita", senão "Inscrição Rejeitada" */
		
		System.out.println(" \n Qual sua idade? ");
		int idade1 = scanner.nextInt();
		
		System.out.println("Você possui experiência?  ");
		String resposta1 =scanner.next();
		
		if ( idade1 >= 20 && idade1 <= 40 && resposta1.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição Aceita");
		} else {
			System.out.println("Inscrição Rejeitada");
		}
		
		
		
		
		
		
		

	}

}
