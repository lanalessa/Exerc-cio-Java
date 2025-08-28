package PrimeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new  Scanner(System.in);
		
		
		//1 - Classificação de Filme

		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		
		if ( idade <= 16 || idade > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		//2 - Promoção de Produto
		
		System.out.println("Qual o valor do produto? ");
		double valor = scanner.nextDouble();
		System.out.println("Quantos você vai comprar? ");
		double quant = scanner.nextDouble();
		
		
		if(valor > 200 && quant > 5) {
			 double desconto = valor * 0.15;
			 double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		}else {
			System.out.println("Não tem desconto ");
		}
		
		
		//3 - Alerta de Saúde
		
		System.out.println(" \nQual sua frequência cardíaca (em bpm)? ");
		int frequencia = scanner.nextInt();
		
		System.out.println("Você possui algum sintoma como tontura?  ");
		String sintoma =scanner.next();
		
		if ( frequencia >= 100 || sintoma.equalsIgnoreCase("sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}
		
		//4 - Participação em Concurso
		System.out.println("Qual sua idade? ");
		int idade1 = scanner.nextInt();
		
		System.out.println("Você é residente do estado?  ");
		String resposta1 =scanner.next();
		
		if ( idade1 >= 18 && idade1 <= 30 && resposta1.equalsIgnoreCase("sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}
		
		
		//5 - Recompensa por Desempenho
		
		System.out.println("Digite o número de projetos concluídos: ");
		int projetos = scanner.nextInt();
		
		System.out.println("Quantos erros tem? ");
		double erros = scanner.nextDouble();
		
		if ( projetos > 10 && erros < 3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}

		//6 - Autorização para Viagem
		
		System.out.println("Qual sua idade? ");
		int idade2 = scanner.nextInt();
		
		System.out.println("Você possui passaporte válido?  ");
		String passaporte =scanner.next();
		
		if ( idade2 >=18 && passaporte.equalsIgnoreCase("sim")) {
			System.out.println("Viagem autorizada");
		} else {
			System.out.println("Viagem não autorizada");
		}
		
		//7 - Aprovação em Curso Online
		
		System.out.println("Digite sua nota final (0 a 100): ");
		int nota = scanner.nextInt();
		
		System.out.println("Quantas aulas assistiu? (0 a 50) ");
		double aulas = scanner.nextDouble();
		
		if ( nota >= 70 && aulas >= 40) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		//8 - Controle de Irrigação

		System.out.println("Digite a umidade do solo (em %): ");
		int umidade = scanner.nextInt();
		
		System.out.println("Qual temperatura? (0 a 50) ");
		double temperatura = scanner.nextDouble();
		
		if ( umidade < 30 || temperatura > 30) {
			System.out.println("Irrigação necessária");
		} else {
			System.out.println("Irrigação não necessária");
		}
		
		//9 - Inscrição em Feira Profissional

		System.out.println("Qual sua idade? ");
		int idade3 = scanner.nextInt();
		
		System.out.println("Você possui experiência?  ");
		String exp =scanner.next();
		
		if ( idade3 >= 20 && idade3 <= 40 && exp.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição Aceita");
		} else {
			System.out.println("Inscrição não permitida");
		}
		
		
		
		
		
		

	}

}
