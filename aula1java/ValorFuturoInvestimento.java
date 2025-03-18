import java.util.Scanner;

public class ValorFuturoInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor presente
        System.out.print("Digite o valor presente (capital): ");
        double capital = scanner.nextDouble();

        // Lê a taxa de juros mensal (em decimal)
        System.out.print("Digite a taxa de juros mensal (ex: para 5% digite 0.05): ");
        double taxa = scanner.nextDouble();

        // Lê o número de meses
        System.out.print("Digite o número de meses: ");
        int meses = scanner.nextInt();

        // Calcula o montante
        double montante = capital * Math.pow((1 + taxa), meses);

        // Exibe o montante
        System.out.printf("O valor futuro do investimento é: R$ %.2f%n", montante);

        scanner.close();
    }
}
