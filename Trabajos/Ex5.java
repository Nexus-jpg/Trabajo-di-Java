import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = leitor.nextDouble();
        System.out.println("Digite o valor total vendido no mês:");
        double valorVendas = leitor.nextDouble();
        double valorComissao = valorVendas * 0.05;
        double salarioFinal = salarioFixo + valorComissao;  
        System.out.println("--- Resumo do Mês ---");
        System.out.println("Valor da comissão (5%): R$ " + String.format("%.2f", valorComissao));
        System.out.println("Salário final a receber: R$ " + String.format("%.2f", salarioFinal));

        leitor.close();
    }
}