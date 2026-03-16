import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço de custo do produto: ");
        double PrecodoCusto = leitor.nextDouble();
        double PrecoVenda = PrecodoCusto * 1.25;
        System.out.println("O preço final de venda é: R$ " + String.format("%.2f", PrecoVenda));

        leitor.close();
    }
}