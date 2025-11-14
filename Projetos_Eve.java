package PrimeiroProjeto;

import java.util.Scanner;

public class Projetos_Eve {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opc = "sim";

        while (opc.equalsIgnoreCase("sim")) {

            String[] cidades = new String[5];
            double[] temp = new double[5];

            System.out.println("REGISTRO DE CIDADES E TEMPERATURAS:");

            // Cadastro das cidades e temperaturas
            for (int i = 0; i < 5; i++) {

                System.out.println("Digite o nome da cidade " + (i + 1) + ": ");
                cidades[i] = sc.nextLine();

                // Temperatura com validação
                while (true) {
                    System.out.println("Digite a temperatura de " + cidades[i] + ": ");
                    double t = sc.nextDouble();

                    if (t < -50 || t > 60) {
                        System.out.println("Temperatura invalida. Digite entre -50 e 60.");
                    } else {
                        temp[i] = t;
                        break;
                    }
                }

                sc.nextLine(); // limpar o enter
            }

            // Média
            double soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += temp[i];
            }
            double media = soma / 5;

            // Maior e menor temperatura
            double maior = temp[0];
            double menor = temp[0];
            String cidMaior = cidades[0];
            String cidMenor = cidades[0];

            for (int i = 1; i < 5; i++) {

                if (temp[i] > maior) {
                    maior = temp[i];
                    cidMaior = cidades[i];
                }

                if (temp[i] < menor) {
                    menor = temp[i];
                    cidMenor = cidades[i];
                }
            }

            // Resultados
            System.out.println("\nRESULTADOS:");
            System.out.println("Media das temperaturas: " + media);
            System.out.println("Cidade mais quente: " + cidMaior + " (" + maior + ")");
            System.out.println("Cidade mais fria: " + cidMenor + " (" + menor + ")");

            // Classificação
            System.out.println("\nCLASSIFICACAO:");
            for (int i = 0; i < 5; i++) {

                String classif;

                if (temp[i] < 15) {
                    classif = "Frio";
                } else if (temp[i] <= 25) {
                    classif = "Ameno";
                } else {
                    classif = "Quente";
                }

                System.out.println(cidades[i] + ": " + temp[i] + " - " + classif);
            }

            // Repetição
            System.out.println("\nDeseja registrar novamente? (sim/nao): ");
            opc = sc.nextLine();
        }

        System.out.println("Sistema finalizado.");
        sc.close();
    }
}