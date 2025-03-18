import java.util.Scanner;

public class CalculeDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os coeficientes a, b e c
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Calcula o delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Exibe o resultado
        System.out.println("O valor de delta é: " + delta);

        scanner.close();
    }
}
