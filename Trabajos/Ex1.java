import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String cargo;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu cargo: ");
        cargo = scanner.nextLine();
        System.out.println("Bem-vindo ao sistema comercial," + nome + ". Seu acesso como "+cargo +" foi configurado com sucesso.");

        scanner.close();
    }
}