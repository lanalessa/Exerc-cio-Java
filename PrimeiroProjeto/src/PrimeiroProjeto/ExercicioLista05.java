package PrimeiroProjeto;

import java.util.Scanner;

public class ExercicioLista05 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new  Scanner(System.in);
		
		//1 - Classificação de idade
		int idade;
		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt();
		
		if (idade < 12) {
			System.out.println("Criança");
		}else if (idade < 17) {
			System.out.println("Adolescente");
		}else if (idade < 59){
			System.out.println("Adulto");
		} else if (idade >= 60){
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida");
		}
		
		
		
		//2 - Avaliação de Temperatura
		int temp;
		System.out.println("Qual a temperatura? ");
		temp = scanner.nextInt();
		
		if (temp < 10) {
			System.out.println("Muito Frio");
		}else if (temp < 20) {
			System.out.println("Frio");
		}else if (temp < 30){
			System.out.println("Agradável");
		} else if (temp >= 30){
			System.out.println("Muito Quente");
		} else {
			System.out.println("Temperatura inválida");
		}
		
		
		//3 - Sistema de Notas Escolares
		int nota;
		System.out.println("Qual sua nota? ");
		nota = scanner.nextInt();
		
		if (nota > 90) {
			System.out.println("A");
		}else if (nota > 80) {
			System.out.println("B");
		}else if (nota > 70){
			System.out.println("C");
		} else if (nota > 60){
			System.out.println("D");
		}else if (nota < 60){
			System.out.println("F");
		} else {
			System.out.println("Nota inválida");
		}
		
		
		//4 - Verificação de senha
		String senha;
		System.out.println("Qual a senha? ");
		senha = scanner.next();
		
		if (senha.equals("admin")) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso Negado");
		}
		
		//5 - Comparação de nomes
		
		String nome1;
		System.out.println("Insira um nome: ");
		nome1 = scanner.next();
		
        String nome2;
        System.out.println("Insira outro nome: ");
		nome2 = scanner.next();
		
		if (nome1.equalsIgnoreCase(nome2)){ 
			System.out.println("Os nomes são iguais");
		    } else {
			System.out.println("Os nomes são diferentes");
		    }
		
		//6 - Jogo da cor favorita
		String cor;
		System.out.println("Informe uma cor: ");
		cor = scanner.next();
		
		if (cor.equalsIgnoreCase("Azul")) {
			System.out.println("Boa escolha!");
		} else if (cor.equalsIgnoreCase("Vermelho")) {
			System.out.println("Cor vibrante!");
		} else if (cor.equalsIgnoreCase("Verde")) {
			System.out.println("Cor da natureza!");
	    } else {
		System.out.println("Cor não cadastrada.");
	    }
		
		//7 - Verificação de vogal
		
		String vogal;
		System.out.println("Qual sua letra? ");
		vogal = scanner.next();
		
		if (vogal.equalsIgnoreCase("A")) {
			System.out.println("É uma vogal.");
		}else if (vogal.equalsIgnoreCase("E")) {
			System.out.println("É uma vogal.");
		}else if (vogal.equalsIgnoreCase("I")){
			System.out.println("É uma vogal.");
		} else if (vogal.equalsIgnoreCase("O")){
			System.out.println("É uma vogal.");
		}else if (vogal.equalsIgnoreCase("U")){
			System.out.println("É uma vogal.");
		} else {
			System.out.println("Não é vogal.");
		}




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
