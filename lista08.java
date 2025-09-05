package PrimeiroProjeto;

import java.util.Scanner;

public class lista08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//1 - Classificação de Dia da Semana
		int num ;
		System.out.println("Informe um número: ");
		num = scanner.nextInt();
		
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Dia útil");
			break;
		case 6:
		case 7:
			System.out.println("Fim de semana");
			break;
			default:
				System.out.println("Dia inválido");
		}
		
		//2 - Menu de Bebidas
		int bebida ;
		System.out.println("Informe um valor: ");
		bebida = scanner.nextInt();
		
		switch (bebida) {
		case 1:
			System.out.println(" Seu café é R$5,00");
			break;
		case 2:
			System.out.println("Seu chá é R$3,50 ");
			break;
		case 3:
			System.out.println("Seu suco é R$4,00");
			break;
		case 4:
			System.out.println("Seu refrigerante é R$4,50");
			break;
			default:
				System.out.println("Código inválido");
		}
		
		//3 - Tipo de Veículo
		int automovel ;
		System.out.println("Informe o código do veículo ");
		automovel = scanner.nextInt();
		
		switch (automovel) {
		case 1:
			System.out.println("Seu carro é considerado leve");
			break;
		case 2:
			System.out.println("Você tem uma motocicleta");
			break;
		case 3:
			System.out.println("Seu caminhão é considerado pesado");
			break;
			default:
				System.out.println("Veículo inválido");
		}
		System.out.println("\n");
		//4 - Escolha de Plano de Assinatura
		int plano ;
		System.out.println("Informe o codigo para conhecer o plano: \n ");
		plano = scanner.nextInt();
		
		switch (plano) {
		case 1:
			System.out.println("Acesso limitado");
			break;
		case 2:
			System.out.println("Acesso padrão + suporte");
			break;
		case 3:
			System.out.println("Acesso total + suporte prioritário");
			break;
			default:
				System.out.println("Código de plano inválido! Veja os beneficios: \n 1 - Básico = Acesso limitado \n 2 - Intermediário = Acesso padrão + suporte \n 3- 3 Premium = Acesso total + suporte prioritário");
		}
		
		//5 - Seleção de Mês
		int mes ;
		System.out.println("Insira um número de 1 a 12: ");
		mes = scanner.nextInt();
		
		switch (mes) {
		case 12:
		case 1:
		case 2:
			System.out.println("Verão");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;
			default:
				System.out.println("Mês inválido");
		}
		
		//6 - Tipo de Ingresso
		int ingresso ;
		System.out.println("Informe o código da sua categoria: ");
		ingresso = scanner.nextInt();
		
		switch (ingresso) {
		case 1:
			System.out.println("A inteira custa R$50,00");
			break;
		case 2:
			System.out.println("A meia-entrada custa R$25,00");
			break;
		case 3:
			System.out.println("A entrada VIP custa R$100,00");
			break;
			default:
				System.out.println("Ingresso inválido");
		}
		
		//7 - Escolha de Idioma
		int idioma ;
		System.out.println("Informe o código de idioma");
		idioma = scanner.nextInt();
		
		switch (idioma) {
		case 1:
			System.out.println("Olá!");
			break;
		case 2:
			System.out.println("Hello!");
			break;
		case 3:
			System.out.println("Hola!");
			break;
			default:
				System.out.println("Idioma inválido");
		}
		
		
		//8 - Nível de Acesso
		int nivel ;
		System.out.println("Informe o código do seu nivel ");
		nivel = scanner.nextInt();
		
		switch (nivel) {
		case 1:
			System.out.println("Acesso básico");
			break;
		case 2:
			System.out.println("Acesso básico + edição");
			break;
		case 3:
			System.out.println("Acesso total");
			break;
			default:
				System.out.println("Nível inválido");
		}
		
		//9 - Tipo de Pagamento
		
		int pagamento ;
		System.out.println("Como você vai pagar? (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix) ");
		pagamento = scanner.nextInt();
		
		switch (pagamento) {
		case 1:
			System.out.println("Pagamento em dinheiro confirmado");
			break;
		case 2:
			System.out.println("Pagamento com cartão processado");
			break;
		case 3:
			System.out.println("Pagamento via Pix realizado");
			break;
			default:
				System.out.println("Método inválido");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
