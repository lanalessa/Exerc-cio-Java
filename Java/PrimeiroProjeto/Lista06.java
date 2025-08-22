package PrimeiroProjeto;

import java.util.Scanner;

public class Lista06 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new  Scanner(System.in);
		
		// 1 - Intervalo numérico
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        if (numero >= 10 && numero <= 20) {
            System.out.println("Número dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        System.out.println("---------------------------");

        // 2 - Acesso à festa
        System.out.println(" Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Você possui convite? (true/false)");
        boolean convite = scanner.nextBoolean();
        if (idade >= 18 && convite) {
            System.out.println("Entrada permitida.");
        } else {
            System.out.println("Entrada não permitida.");
        }

        System.out.println("---------------------------");

        // 3 - Categoria de esporte
        System.out.println(" Qual sua idade?");
        idade = scanner.nextInt();
        if (idade < 12 || idade > 60) {
            System.out.println("Categoria especial");
        } else {
            System.out.println("Categoria normal");
        }

        System.out.println("---------------------------");

        // 4 - Desconto no produto
        System.out.println(" Qual o valor do produto?");
        double valor = scanner.nextDouble();
        System.out.println("Forma de pagamento (true = à vista / false = cartão):");
        boolean pagamentoAvista = scanner.nextBoolean();
        if (valor > 100 && pagamentoAvista) {
            double desconto = valor * 0.9;
            System.out.println("Valor com desconto: " + desconto);
        } else {
            System.out.println("Valor sem desconto: " + valor);
        }

        System.out.println("---------------------------");

        // 5 - Triagem médica
        System.out.println("Qual sua temperatura corporal?");
        double temperatura = scanner.nextDouble();
        System.out.println("Você tem sintomas? (true/false)");
        boolean sintomas = scanner.nextBoolean();
        if (temperatura >= 38 || sintomas) {
            System.out.println("Recomenda-se procurar um médico.");
        } else {
            System.out.println("Sem sinais preocupantes.");
        }

        System.out.println("---------------------------");

        // 6 - Votação
        System.out.println(" Qual sua idade?");
        idade = scanner.nextInt();
        System.out.println("Você é brasileiro? (true/false)");
        boolean brasileiro = scanner.nextBoolean();
        if (idade >= 16 && brasileiro) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }

        System.out.println("---------------------------");

        // 7 - Bônus de funcionário
        System.out.println(" Quantidade de horas extras:");
        int horasExtras = scanner.nextInt();
        System.out.println("Número de faltas:");
        int faltas = scanner.nextInt();
        if (horasExtras > 20 && faltas < 5) {
            System.out.println("Ganha bônus.");
        } else {
            System.out.println("Não ganha bônus.");
        }

        System.out.println("---------------------------");

        // 8 - Autorização para dirigir
        System.out.println(" Qual sua idade?");
        idade = scanner.nextInt();
        System.out.println("Você possui carteira de motorista? (true/false)");
        boolean carteira = scanner.nextBoolean();
        if (idade >= 18 && carteira) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        System.out.println("---------------------------");

        // 9 - Elegibilidade para Bolsa de Estudos
        System.out.println("Qual sua nota média? (0 a 10)");
        double nota = scanner.nextDouble();
        System.out.println("Qual sua frequência? (0 a 100)");
        int frequencia = scanner.nextInt();
        if (nota >= 8 && frequencia >= 80) {
            System.out.println("Bolsa concedida");
        } else {
            System.out.println("Bolsa não concedida");
        }

        System.out.println("---------------------------");

        // 10 - Verificação de Temperatura Ambiente
        System.out.println(" Qual a temperatura ambiente (°C)?");
        double tempAmbiente = scanner.nextDouble();
        System.out.println("Qual a umidade (%)?");
        int umidade = scanner.nextInt();
        if ((tempAmbiente < 18 || tempAmbiente > 26) && umidade > 60) {
            System.out.println("Ajustar climatização");
        } else {
            System.out.println("Climatização não necessária");
        }
		

	}

}
