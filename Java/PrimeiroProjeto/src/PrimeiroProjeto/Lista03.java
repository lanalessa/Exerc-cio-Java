package PrimeiroProjeto;

import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
	
		//1 - Resultado de dois números
		int numero1;
		int numero2;
		System.out.println("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma resulta em: " + soma);
		
		//2 - Divisão e Resto
		int num1;
		int num2;
		System.out.println("Informe um número: ");
		num1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		num2 = scanner.nextInt();
		int divisao = num1 / num2;
		System.out.println("A divisão resulta em: " + divisao);
		int resto = num1 % num2;
		System.out.println("O resto da divisão fica: "+ resto);

		//3 - Perímetro de um triângulo
		int lado1;
		int lado2;
		int lado3;
		System.out.println("Informe um lado: ");
		lado1 = scanner.nextInt();
		System.out.println("Informe o segundo lado: ");
		lado2 = scanner.nextInt();
		System.out.println("Informe o ultimo lado: ");
		lado3 = scanner.nextInt();
		int perimetro = lado1 + lado2 + lado3;
		System.out.println("O perímetro do triângulo fica: " + perimetro);
		
		//4 - Calculadora de Gorjeta
		int conta;
		int porcentagem;
		System.out.println("Informe o valor da conta: ");
		conta = scanner.nextInt();
		System.out.println("Informe a porcentagem da gorjeta: ");
		porcentagem = scanner.nextInt();
		int gorjeta = conta * (porcentagem / 100);
		int total = conta + gorjeta; 
		System.out.println("A gorjeta fica: " + gorjeta);
		System.out.println("O total da conta fica: "+ total);
		
		//5 - Calculadora de área de círculo
		double raio;
		System.out.println("Informe o raio do círculo: ");
		raio = scanner.nextInt();
		double area = 3.14159 * (raio * raio);
		System.out.println("A área do círculo fica: " + area);
		
		//6 - Conversor de idade em dias
		int anos;
		int meses;
		int dias;
		System.out.print("Digite sua idade - anos: ");
        anos = scanner.nextInt();
        System.out.print("Digite meses: ");
        meses = scanner.nextInt();
        System.out.print("Digite dias: ");
        dias = scanner.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Total de dias vividos: " + totalDias);

        // 7 - Calculadora de pagamento por hora
        double horas;
        double valorHora;
        System.out.print("Digite as horas trabalhadas: ");
        horas = scanner.nextDouble();
        System.out.print("Digite o valor pago por hora: ");
        valorHora = scanner.nextDouble();
        double salarioBruto = horas * valorHora;
        double imposto = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - imposto;
        System.out.printf("Salário Bruto: %.2f\n", salarioBruto);
        System.out.printf("Imposto (10%%): %.2f\n", imposto);
        System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);
		
		
		
		
		
		
		
		
		
		

	}

}
