import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra (R$): ");
        double valorOriginal = scanner.nextDouble();
        double desconto = valorOriginal * 0.15;
        double valorFinal = valorOriginal - desconto;
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor final a pagar: R$ " + String.format("%.2f", valorFinal));

        scanner.close();
    }
}