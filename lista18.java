package PrimeiroProjeto;

public class lista18 {

	public static void main(String[] args) {
		nome();nome();nome();nome();nome();
		separador();
		
		frase();
		separador();
		
		contagem();
		separador();
		
		vogais();
		separador();
		
		estrela();
		separador();
		
		contagem1();
		separador();
		
		contagem2();
		separador();
		
		triangulo();
		separador();
		
		semana();
		separador();

	}

	//1 – Apresentação
	public static void nome() {
		System.out.println("Lana");
	}
	
	
	
	//2 – Exibindo uma frase
	public static void frase() {
		System.out.println("Que o esforço para ganhar a vida, não nos roube a vida que temos.");
	}
	
	
	
	//3 – Imprimindo valores
	public static void contagem() {
		for (int i = 1; i <= 10; i++)
		System.out.println(i);
	}
	
	
	
	//4 – Mostrando as vogais
	public static void vogais() {
		System.out.println("A - E - I - O - U");
	}
	
	
	
	//5 – Desenhando um quadrado
	public static void estrela() {
		System.out.println("* * *");
		System.out.println("*   *");
		System.out.println("* * *");
		
	}
	
	//6 – Imprimindo números pares
	public static void contagem1() {
		for (int i = 2; i <= 20; i++)
			if (i % 2 == 0)
		System.out.println(i);
	}
	
	//7 – Exibindo uma contagem regressiva
	public static void contagem2() {
		for (int i = 10; i >= 1; i--) {
		System.out.println(i);
		}
		System.out.println("Fim!");
	}
	
	//8 – Desenhando um triângulo
	public static void triangulo() {
	        System.out.println("     *");
	        System.out.println("   * * *");
	        System.out.println("  * * * * ");
	        System.out.println(" * * * * * ");
	        System.out.println("* * * * * * ");
	}

	
	//9 – Mostrando os dias da semana
	
	public static void semana() {
        System.out.println("Segunda - Feira");
        System.out.println("Terça - Feira");
        System.out.println("Quarta - Feira");
        System.out.println("Quinta - Feira");
        System.out.println("Sexta - Feira");
        System.out.println("Sábado");
        System.out.println("Domingo");
}
	
	
	
	
	// SEPARADOR 
	public static void separador() {
		System.out.println("----------------");
	}
}
