package PrimeiroProjeto;

import java.util.Scanner;

public class Lista06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1 - Intervalo numérico
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		if (numero >= 10 && numero <= 20) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}
		System.out.println("\n");

		// 2 - Acesso à festa
		System.out.println("Informe a idade:");
		int idade = scanner.nextInt();
		System.out.println("Você possui convite?");
		String convite = scanner.next();
		if (idade >= 18 && convite.equalsIgnoreCase("Sim")) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		System.out.println("\n");

		// 3 - Categoria de esporte
		int idadeS;
		System.out.println("Informe a idade:");
		idadeS = scanner.nextInt();
		if (idadeS < 12 || idadeS > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}
		System.out.println("\n");

		// 4 - Desconto no produto
		System.out.println("Qual o valor do produto?");
		double valor = scanner.nextDouble();
		System.out.println("Qual a forma de pagamento (avista ou cartão)?");
		String pagamento = scanner.next();

		if (valor > 100 && pagamento.equalsIgnoreCase("avista")) {
			double desconto = valor * 0.10;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		} else {
			System.out.println("Não tem desconto: R$" + valor);
		}

		// 5 - Triagem médica
		System.out.println("\n");
		System.out.println("Informe a temperatura: ");
		double temp = scanner.nextDouble();
		System.out.println("Possui sintomas?");
		String sintomas = scanner.next();

		if (temp >= 38 || sintomas.equalsIgnoreCase("SIM")) {
			System.out.printf("Recomenda-se procurar um médico");
		} else {
			System.out.println("Sem sinais preocupantes");
		}

		// 6 - Votação
		System.out.println("\n");
		int idade1;
		String brasileiro;
		System.out.println("Informe a idade: ");
		idade1 = scanner.nextInt();
		System.out.println("Você é brasileiro (sim/não)?");
		brasileiro = scanner.next();
		if (idade1 >= 16 && brasileiro.equalsIgnoreCase("Sim")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}

		// 7 - Bônus de funcionário
		System.out.println("\n");
		int horasExtras;
		int numeroDeFaltas;
		System.out.println("Informe a quantidade de horas extras: ");
		horasExtras = scanner.nextInt();
		System.out.println("Informe o número de faltas:");
		numeroDeFaltas = scanner.nextInt();
		if (horasExtras > 20 && numeroDeFaltas < 5) {
			System.out.println("Ganha Bônus");
		} else {
			System.out.println("Não ganha bônus");
		}

		// 8 - Autorização para dirigir
		System.out.println("\n");
		int idade2;
		String carteira;
		System.out.println("Informe a idade: ");
		idade2 = scanner.nextInt();
		System.out.println("Possui carteira de motorista (sim/não)?");
		carteira = scanner.next();
		if (idade2 >= 18 && carteira.equalsIgnoreCase("Sim")) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}

		// 9 - Elegibilidade para Bolsa de Estudos
		System.out.println("\n");
		int media;
		int freq;
		System.out.println("Informe a nota média (0 a 10): ");
		media = scanner.nextInt();
		System.out.println("Informe a frequência (0 a 100):");
		freq = scanner.nextInt();
		if (media >= 8 && freq >= 80) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
		}

		// 10 - Verificação de Temperatura Ambiente
		System.out.println("\n");
		double umidadeDoSolo;
		double temperatura;
		System.out.println("Informe a temperatura (°C): ");
		temperatura = scanner.nextDouble();
		System.out.println("Informe a umidade do solo (%):");
		umidadeDoSolo = scanner.nextDouble();
		if (temperatura < 18 || temperatura > 26 && umidadeDoSolo > 60) {
			System.out.println("Ajustar climatização");
		} else {
			System.out.println("Climatização não necessária");
		}

	}

}
