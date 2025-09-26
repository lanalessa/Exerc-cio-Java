package PrimeiroProjeto;

import java.util.Scanner;

public class Lista04 {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		//1 - Verificar maioridade

		int idade;
		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt();
		if (idade >= 18) {
		System.out.println("Você tem " + idade +" anos e é maior de idade");
		} else {
			System.out.println("Você tem " + idade + " anos e é menor de idade");
		}
		
		
		//2 - Comparar dois números

		int n1, n2;
		System.out.println("Informe um número: ");
		n1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		n2 = scanner.nextInt();
		
		if (n1 >  n2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior ou eles são iguais");
		}
		
		
		//3 - Aprovação por nota
		double nota1, nota2;
		System.out.println("Informe a nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado: sua nota foi "+ media);
		} else {
			System.out.println("Reprovado: sua nota foi " + media);
		}
		
		
		//4 - Verificar número positivo
		int num;
		System.out.println("Informe um número: ");
		num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo ou zero");
		}
		
		//5 - Cálculo de frete
		double distancia;
		System.out.println("Digite a distância em km: ");
		distancia = scanner.nextDouble();
		
		double frete = distancia * 0.5;
		if (distancia <= 50) {
			System.out.println("O frete custa R$ 10.00");
		} 	else {
				System.out.println("Valor do frete: R$"+ frete);
		}
		
		
		//6 - O Número é 10?
		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		
		if (numero == 10) {
			System.out.println("o número é 10");
		} else {
			System.out.println("o número não é 10");
		}
		
		
		//7 - Desconto para Associados
		String associado;
		System.out.println("Você é associado? ");
		associado = scanner.next();
		if(associado == "sim") {
			System.out.println("você tem desconto");
		} else {
			System.out.println("Você não tem desconto");
		}
		
		//8 - Cálculo de bônus por horas extras
		int horas;
		System.out.println("Informe a quantidade de horas extras trabalhadas: ");
		horas = scanner.nextInt();
		int bonus;
		
		if (horas < 10) {
			bonus = horas * 20;
			System.out.println("Bônus por hora extra resulta em R$" + bonus);
		} else {
			bonus = horas * 15; 
			System.out.println("Bônus por hora extra resulta em R$" + bonus);
		}



		
	
		
		
		
		
		
	}
}
