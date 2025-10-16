package PrimeiroProjeto;

import java.util.Scanner;

public class lista19 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

		  
		  // 1
	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();
	        num(numero);
	        System.out.println("------------------------");
	        
	        //2
	        
	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();
	        idade(idade);
	        System.out.println("------------------------");
	        
	        //3
	        System.out.print("Qual seu nome? ");
	        String nome = sc.next();
	        saudacao(nome);
	        System.out.println("------------------------");
	        
	        //4
	        System.out.print("Digite um número para ver a tabuada dele: ");
	        int tabuada = sc.nextInt();
	        tabuada(tabuada);
	        System.out.println("------------------------");
	        
	        //5
	        System.out.print("Digite a primeira palavra: ");
	        String palavra1 = sc.next();
	        System.out.print("Digite a segunda palavra: ");
	        String palavra2 = sc.next();
	        juntarPalavras(palavra1, palavra2);
	        System.out.println("------------------------");
	    
	        //6
	        System.out.print("Digite um número inteiro: ");
	        int numero1 = sc.nextInt();

	        verificarParOuImpar(numero1);
	        
	        //7
	        System.out.print("Digite a temperatura: ");
	        double temp = sc.nextDouble();
	        temp(temp);
	        
	        
	        //8
	        System.out.print("Digite o turno (manhã, tarde ou noite): ");
	        String turno = sc.nextLine();
	        saudacaoPorTurno(turno);
	        
	        //9
	        
	        
	        
	        //10
	        
    
		
		
	}
	
	//1 – Classificando valores
	
	public static void num(int numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
	}


	
	//2 – Maioridade
	
	public static void idade(int idade) {
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }  else {
            System.out.println("Você é menor de idade");
        }
	}
	
	
	//3 – Boas Vindas
	
	public static void saudacao (String nome) {
        System.out.println("Olá "+ nome);
}
	
	//4 – Tabuada 
	public static void tabuada(int tabuada) {
        System.out.println("Tabuada do " + tabuada + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
	}
	
	//5 – Juntando palavras
	public static void juntarPalavras(String palavra1, String palavra2) {
        String resultado = palavra1 + palavra2;
        System.out.println("Palavras concatenadas: " + resultado);
    }
	
	
	
	//6 – Verificando par ou ímpar
	 public static void verificarParOuImpar(int numero1) {
	        if (numero1 % 2 == 0) {
	            System.out.println("O número " + numero1 + " é par.");
	        } else {
	            System.out.println("O número " + numero1 + " é ímpar.");
	        }
	 }
	
	//7 – Classificando temperatura
	 public static void temp(double temp) {
	        if (temp < 15) {
	            System.out.println("Frio");
	        } else if (temp <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	        }
	    } 
	
	
	//8 – Saudação por turno
	 public static void saudacaoPorTurno(String turno) {
	        turno = turno.toLowerCase();

	        if (turno.equals("manhã")) {
	            System.out.println("Bom dia!");
	        } else if (turno.equals("tarde")) {
	            System.out.println("Boa tarde!");
	        } else if (turno.equals("noite")) {
	            System.out.println("Boa noite!");
	        } else {
	            System.out.println("Turno inválido.");
	        }
	 }
	
	//9 – Calculando média
	
	
	//10 – Verificando aprovação
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
