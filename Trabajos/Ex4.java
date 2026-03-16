import java.util.Scanner;

public class Ex4 {
       public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Informe o valor do produto em dolares: ");
      Double valor = leia.nextDouble();
      System.out.println("Informe a cotação do dolar para reais hoje: ");
      Double dolarAtual = leia.nextDouble();
      Double valorConvertido = valor * dolarAtual;
      System.out.println("O valor do produto em reais é "+valorConvertido+"$");
      leia.close();
}
}