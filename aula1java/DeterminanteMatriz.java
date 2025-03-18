import java.util.Scanner;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os elementos da matriz
        System.out.print("Digite o valor de a11: ");
        int a11 = scanner.nextInt();

        System.out.print("Digite o valor de a12: ");
        int a12 = scanner.nextInt();

        System.out.print("Digite o valor de a21: ");
        int a21 = scanner.nextInt();

        System.out.print("Digite o valor de a22: ");
        int a22 = scanner.nextInt();

        // Calcula o determinante
        int determinante = (a11 * a22) - (a21 * a12);

        // Exibe o resultado
        System.out.println("O determinante da matriz é: " + determinante);

        scanner.close();
    }
}
