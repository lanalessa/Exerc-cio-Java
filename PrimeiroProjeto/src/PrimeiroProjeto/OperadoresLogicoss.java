package PrimeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicoss {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingressos? (true/false): ");
		boolean ingresso = scanner.nextBoolean();
		
		if (idade >= 18 && ingresso) {
			System.out.println("Entrada Permitida");
		}else {
			System.out.println("Entrada Negada");
		}
		
		
		System.out.println("---------------------------");
		
		System.out.println("Qual sua nota? (0 a 10)");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100)");
		int frequencia = scanner.nextInt();

		if(nota >= 7 || frequencia >= 75) {
		System.out.println("Aprovado");
		} else {
		System.out.println("Reprovado");
		}
		
		
		//Para logar o usuario precisa respoder uma serie de perguntas, se ele é administrador e se está logado
		System.out.println("É admin? (true/false)");
		boolean admin = scanner.nextBoolean();
		System.out.println("Está logado? (true/false)");
		boolean logado = scanner.nextBoolean();
		if (admin && logado) {
			System.out.println("Acesso Permitido");
		}else {
			System.out.println("Acesso Negado");
		}
		
		
		System.out.println("--------------------------------------------");
		
		
		// Peça uma letra para o usuario, se ela for A , E, I, O, U mostre "vogal", senão, mostre "consoante"
		
		System.out.println("Informe uma letra; ");
		String vogal = scanner.next();
		
		if (vogal.equalsIgnoreCase("A") || vogal.equalsIgnoreCase ("E") || vogal.equalsIgnoreCase("I") || vogal.equalsIgnoreCase("O") || vogal.equalsIgnoreCase("U" )){
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		}
		
	   // Operadores Logicos 2 --------------------------------------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
