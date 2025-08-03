public class MyClass {
  public static void main(String args[]) {
   
     //1 - Cálculo para empresa 
     double instalacao = 300.00;
     double limpeza = 150.00;
     double manutencao = 499.99;
     double pagar = instalacao + limpeza + manutencao;
     System.out.println ("O cliente deverá pagar: " + pagar );
     
     //2 - Cálculo de salário
     double valor = 35.00;
     double hora = 8;
     double salario = valor * hora;
     System.out.println ("O salário do Joaquim é " + salario + " reais por dia");
     
     //3 - Caixas de bombons
     int bombom = 27;
     int caixas = 16;
     int totalDoces = bombom * caixas;
      System.out.println ("Pamela ficou com " + totalDoces + " bombons");
     
     //4 - Garrafas de água
     int garrafas = 300;
     int caixa = 20;
     int usaram = garrafas / caixa;
     System.out.println ("Eles usaram " + usaram + " caixas");
     
     //5 - Cálculo para camisetas 
     double comprou = 120;
     double vendeu = 80;
     double comprouMais = 50;
     double camiseta = 30.00;
     double restou = (comprou - vendeu) + comprouMais;
     double faturamento = vendeu * camiseta;
     System.out.println ("O faturamento foi de " + faturamento + " reais, e sobrou " + restou + " camisetas");
      
     //6 - Dobro e Metade
     double x = 10;
     double dobro = x * 2;
     double metade = x / 2;
     System.out.println ("A variável é 10, seu dobro é " + dobro + " e sua metade é " + metade);
     
     
  }
}