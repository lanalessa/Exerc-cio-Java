package lista24;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro();
        Filme filme = new Filme();
        
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        livro.setNome(nomeLivro);
        
        System.out.println("Digite o autor do livro: ");
        String autorLivro = sc.nextLine();
        livro.setAutor(autorLivro);
        
        System.out.println("Digite o nome do filme: ");
        String nomeFilme = sc.nextLine();
        filme.setNome(nomeFilme);
        
        System.out.println("Quem é o diretor do filme?");
        String diretorFilme = sc.nextLine();
        filme.setDiretor(diretorFilme);
        
        System.out.println("Digite o preço do livro: ");
        double precoLivro = sc.nextDouble();
        livro.setPreco(precoLivro);
        
      
       
        
        System.out.println("Qual o preço do filme?");
        double precoFilme = sc.nextDouble();
        filme.setPreco(precoFilme);
        
        
        
        System.out.println("\n\n");
        System.out.println("--- Informações ---");
        
        livro.mostrarInfo();
        livro.lerTrecho();
        
        System.out.println();
        filme.mostrarInfo();
        filme.assistir();
        

	}

}




