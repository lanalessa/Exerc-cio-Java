package PrimeiroProjeto;

import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		
		//1 - Resultado de dois números
		int numero1;
		int numero2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		System.out.println("A soma desses números resulta em: " + soma + ", a subtração é: " + subtracao + " já a multiplicação fica: " + multiplicacao +" e a divisão da: " + divisao);
        
        //2 - Cálculo de temperatura
		double celsius;
		System.out.println("Informe a temperatura em celsius: ");
		celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Essa temperatura em fahrenheit fica: " + fahrenheit);
		
		//3 - Conversão de valor
		double dolar = 5.70;
		double real;
		System.out.println("Informe o valor em dolar: ");
		real = scanner.nextDouble();
		double conversao = real * dolar;
		System.out.println("O valor em real fica R$" + conversao);
		
		//4 - Área do retângulo
		int altura;
		int base;
		System.out.println("Informe a base: ");
		base = scanner.nextInt();
		System.out.println("Informe a altura: ");
		altura = scanner.nextInt();
		int area = base * altura;
		System.out.println("A área do retângulo fica: " + area);
		
		
		//5 - Conversor de idade
		int idade;
		System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
		int meses = idade * 12;
		System.out.println("Você já viveu " + meses + " meses");
		
		//6 - Conversor de minutos para segundos
		double minutos;
		System.out.println("Informe os minutos para conversão: ");
		minutos = scanner.nextInt();
		double segundo = 60 ;
		double segundos = minutos * segundo;
		System.out.println("São " + segundos + " segundos");
		
		//7 - Custo da compra
		int produto;
		int quantidade;
		System.out.println("Qual é o preço do produto? ");
		produto = scanner.nextInt();
		System.out.println("Quantos foram comprados? ");
		quantidade = scanner.nextInt();
		int custo = produto * quantidade;
		System.out.println("A compra vai custar: " + custo +" reais");
		
		//8 - Divisão de uma conta de restaurante
		int total;
		int quantidadePessoas;
		System.out.println("Qual é o total da conta? ");
		total = scanner.nextInt();
		System.out.println("Quantas pessoas vão pagar? ");
		quantidadePessoas = scanner.nextInt();
		int pagar = total / quantidadePessoas;
		System.out.println("Cada pessoa deve pagar R$" + pagar);
		
		//9 - Cálculo de troco
		int compra;
		int pagamento;
		System.out.println("Qual é o total da compra? ");
		compra = scanner.nextInt();
		System.out.println("Quanto o cliente pagou? ");
		pagamento = scanner.nextInt();
		int troco = pagamento - compra;
		System.out.println("O troco é de R$" + troco);
	
		


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

        
	}

}
