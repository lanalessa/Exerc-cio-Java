package PrimeiroProjeto;

public class lista21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        // 1 - Somar
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Resultado: " + somar(n1, n2) + "\n");

        // 2 - Subtrair
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Resultado: " + subtrair(n1, n2) + "\n");

        // 3 - Multiplicar
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Resultado: " + multiplicar(n1, n2) + "\n");

        // 4 - Dividir
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Resultado: " + dividir(n1, n2) + "\n");

        // 5 - Calcular média
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Média: " + calcularMedia(nota1, nota2) + "\n");

        // 6 - Verificar aprovação
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Situação: " + verificarAprovacao(nota1, nota2) + "\n");

        // 7 - Maior número
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println(maiorNumero(n1, n2) + "\n");

        // 8 - Converter Celsius para Fahrenheit
        System.out.print("Digite a temperatura em °C: ");
        double c = sc.nextDouble();
        System.out.println("Em Fahrenheit: " + converterCelsiusParaFahrenheit(c) + "°F\n");

        // 9 - Calcular área do retângulo
        System.out.print("Digite a base: ");
        double b = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double h = sc.nextDouble();
        System.out.println("Área: " + calcularAreaRetangulo(b, h) + "\n");

        // 10 - Gerar mensagem
        System.out.print("Digite o nome: ");
        sc.nextLine(); // limpar buffer
        String nome = sc.nextLine();
        System.out.println(gerarMensagem(nome) + "\n");

        // 11 - Juntar nomes
        System.out.print("Digite o primeiro nome: ");
        String nA = sc.nextLine();
        System.out.print("Digite o segundo nome: ");
        String nB = sc.nextLine();
        System.out.println("Resultado: " + juntarNomes(nA, nB) + "\n");

        // 12 - Avaliar idade
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Classificação: " + avaliarIdade(idade));

        sc.close();
    }

    // 1
    public static int somar(int a, int b) {
        return a + b;
    }

    // 2
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // 3
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // 4
    public static String dividir(int a, int b) {
        if (b == 0) {
            return "Não é possível dividir por 0";
        } else {
            return String.valueOf((double) a / b);
        }
    }

    // 5
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // 6
    public static String verificarAprovacao(double n1, double n2) {
        double m = calcularMedia(n1, n2);
        if (m >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7
    public static String maiorNumero(int a, int b) {
        if (a > b) {
            return "O maior é: " + a;
        } else if (b > a) {
            return "O maior é: " + b;
        } else {
            return "Eles são iguais";
        }
    }

    // 8
    public static double converterCelsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // 9
    public static double calcularAreaRetangulo(double b, double h) {
        return b * h;
    }

    // 10
    public static String gerarMensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11
    public static String juntarNomes(String n1, String n2) {
        return n1 + " " + n2;
    }

    // 12
    public static String avaliarIdade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
