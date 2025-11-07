package lista24;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 Carro c1 = new Carro();
		 
		
		 
		 System.out.println("Qual a marca do carro?");
		 String marca = sc.next();
		 
		 System.out.print("Digite o ano do carro: ");
		 int ano = sc.nextInt();
		 c1.setMarca(marca);
			c1.setAno(ano);
			
		 c1.exibirInfo();
		 
		 c1.abrirPortaMalas();
		 
		  
	      
	}

}