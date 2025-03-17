import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o ano em que você nasceu");
        int anoNascimento = scanner.nextInt();

        System.out.println("digite o ano atual");
        int anoAtual = scanner.nextInt();

        int idade = anoNascimento - anoAtual;

        System.out.println("Sua idade é" + idade + "anos");

        scanner.close();
    }
}