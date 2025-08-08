package PrimeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Olá Mundo!");

//Declaração de variável
int idade = 24;
double salario = 2000.50;
char letra = 'J';
String nome ="Juliana";
boolean chuva = false;
System.out.println(idade);
System.out.println("O salário é "+ salario + " reais");
System.out.println("Letra: " + letra);
System.out.println("O nome é " + nome);
System.out.println(chuva);

//Operadores
int num1 = 10;
int num2 = 3;
double soma = num1 + num2;
double sub = num1 - num2;
double div = num1 / num2;
double mult = num1 * num2;
double resto = num1 % num2; //Modulo - Resto da divisão

System.out.println("soma: " + soma);
System.out.println("Subtração: " + sub);
System.out.println("Divisão: " + div);
System.out.println("Multiplicação: " +mult);
System.out.println("Resto: " + resto);

// Entrada de Dados
Scanner scanner = new Scanner(System.in);
System.out.println("Qual o seu nome? ");
String nome1 = scanner.nextLine();
System.out.println("Olá " + nome1);

//soma de dois número
int numero1;
int numero2;
System.out.println("Informe um número: ");
numero1 = scanner.nextInt();
System.out.println("Informe outro número: ");
numero2 = scanner.nextInt();
int soma1 = numero1 + numero2;
System.out.println("O resultado é: " + soma1);

// Peça o ano de nascimento do usuário e mostre quantos anos vc tem

int anoNascimento;
int anoAtual = 2025;
System.out.println("Informe o ano de nascimento: ");
anoNascimento = scanner.nextInt();

int vida = anoAtual - anoNascimento;
System.out.println("Você tem: " + vida + " anos de idade");

// Calcular desconto
double preco;
double desconto;
System.out.println("Qual o valor da compra? ");
preco = scanner.nextDouble();
System.out.println("Qual o valor do desconto? ");
desconto = scanner.nextDouble();
double pagar = preco - desconto;
System.out.println("O resultado é: " + soma1);
System.out.println("Pague: " + pagar);

//Peça duas notas decimais para o usuário, calcule média e mostre
double nota1;
double nota2;
System.out.println("Informe sua nota em decimal: ");
nota1 = scanner.nextDouble();
System.out.println("Informe outra nota também em decimal: ");
nota2 = scanner.nextDouble();
double media = (nota1 + nota2) /2;
System.out.println("Sua média é: " + media);


	}

}
