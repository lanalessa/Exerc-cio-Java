public class MyClass {
  public static void main(String args[]) {
      
      System.out.println("Olá Mundo!");
      
      // Variáveis
      int idade = 24; //Números Inteiros
      double salario = 1.75; //Números quebrados
      char letra ='J' ; // letra ou simbolo - uma aspas é p caracter
      boolean estudante = true; //verdadeiro ou falso 
      //true or false
      String nome = "Juliana"; // texto
     
      
      System.out.println(idade);
      System.out.println("Minha idade é " + idade);
      System.out.println("O salário é " + salario);
      System.out.println ("A letra é " + letra);
      System.out.println ("Estuda? " + estudante);
      System.out.println ("Meu nome é " + nome);
      
      //Operadores aritmeticos
      int num1 = 5;
      int num2 = 3;
      int soma = num1 + num2;
      int sub = num1 - num2;
      int mult = num1 * num2;
      double div = num1 / num2;
      
      System.out.println("soma " + soma);
      System.out.println("subtração " + sub);
      System.out.println ("divisão " + div);
      System.out.println("multiplicação " + mult);
      
      //calculo da área de um retângulo
      // largura * comprimento
      
     double largura = 7.5;
     double comprimento = 3.0;
     double area = largura * comprimento;
     System.out.println ("Área: " + area);
     
     //calculo do desconto
     double valor = 100;
     double desconto = 15; //15%
     double valorDesc = valor * (desconto / 100);
     double valorFinal = valor * valorDesc;
     System.out.println ("A pagar: " + valorFinal);
  }
}