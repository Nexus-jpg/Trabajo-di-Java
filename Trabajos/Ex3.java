import java.util.Scanner;
 
 public class Ex3{
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o preço do produto: ");
    double PrecoProduto = leitor.nextDouble();
    System.out.println("Informe a quantidade adquirida: ");
    double QuantidadedoProduto = leitor.nextDouble();
    double TotalaPagar;
    TotalaPagar = PrecoProduto * QuantidadedoProduto;
    System.out.println("O valor total a ser pago é de " + TotalaPagar + " reais");;

    leitor.close();
    }
 }