package PrimeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
	 //>= maior ou igual         <=menor ou igual
		// > maior               < menor
		// == igual             != diferente
		
		int idade = 18;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		
		Scanner scanner = new  Scanner(System.in);
		
		
		// Verificação de desconto
		
		System.out.println("Quanto você pagou?");
		double valor = scanner.nextDouble();
		if(valor >= 200 ) {
			System.out.println("Você ganhou desconto!");
		} else {
			System.out.println("Você não ganhou desconto");
		}
		
		//-----------------------------
		
		String continuar;
		System.out.println("Deseja Continuar? ");
		continuar = scanner.next();
		if(continuar != "sim") {
			System.out.println("Você escolheu continuar");
		} else {
			System.out.println("Você escolheu sair ");
		}
		
		//------------------------------
		
		double nota1, nota2;
		System.out.println("Informe a nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		/*Aplicação de desconto: Peça o valor da compra para o usuário
		se o valor for maior ou igual a 200, o usuário recebe um
		desconto de 15%, senão não tem desconto. Mostre se ele
		teve algum desconto e quanto deve pagar*/
		
		double compra;
		double desconto = 0;
		System.out.println("Informe o valor da compra: ");
		compra = scanner.nextDouble();
		
		if (compra >= 200) {
			desconto = compra * 0.15;
		} 		
		
		double preco = compra - desconto;
		System.out.println("Você tem um desconto de: " + desconto + " reais");
		System.out.println("E deve pagar R$" + preco);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Condicional Encadeada ---------------------------
    	int numero1 = 1;
    	int numero2 = 2;
    	
    	if(numero1 >= numero2) {
    	System.out.println("O primeiro é maior ");
	}else if (numero2 > numero1) {
		System.out.println("O segundo é maior");
	}else {
		System.out.println("Eles são iguais");
		}
    	
    	//-----------------------
//     Situação do estoque 
    	/* Um mercado solicitou um sistema de verificação de estoque
    	 * onde se o valor do estoque for maior ou igual a 50, mostre
    	 * "Atenção ao Estoque", senão, mostre "Estoque Crítico"  	 */
		int estoque;
		System.out.println("Quantos produtos tem no estoque?");
		estoque = scanner.nextInt();
		
		if (estoque >= 100) {
			System.out.println("Estoque OK");
		}else if (estoque >= 50) {
			System.out.println("Atenção ao estoque");
		} else {
			System.out.println("Estoque critico");
		}
		
		
		//*Crie um programa que verifica a classe eleitoral com base na idade. Se a idade for menor que 16, mostre "nao eleitor", se for menor que 18, mostre "voto opcional", se for menor de 65 mostre, "voto obrigatório", se for maior que 65, mostre "voto opcional", senao, mostre "idade inválida"
		int idade1;
		System.out.println("Qual sua idade? ");
		idade1 = scanner.nextInt();
		
		
		if (idade1 < 16) {
			System.out.println("Não eleitor");
		}else if (idade1 < 18) {
			System.out.println("Voto opcional");
		}else if (idade1 < 65){
			System.out.println("Voto obrigatório");
		} else if (idade >= 65){
			System.out.println("Voto opcional");
		} else {
			System.out.println("Idade inválida");
		}
	}
}
