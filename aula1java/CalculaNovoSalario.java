import java.util.Scanner;

public class CalculaNovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o salário atual
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Lê o percentual de aumento
        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        // Calcula o valor do aumento
        double aumento = salarioAtual * (percentualAumento / 100);

        // Calcula o novo salário
        double novoSalario = salarioAtual + aumento;

        // Exibe o novo salário
        System.out.printf("O novo salário do funcionário é: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
