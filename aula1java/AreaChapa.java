import java.util.Scanner;

public class AreaChapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o comprimento da chapa
        System.out.print("Digite o comprimento da chapa (em metros): ");
        double comprimento = scanner.nextDouble();

        // Lê a largura da chapa
        System.out.print("Digite a largura da chapa (em metros): ");
        double largura = scanner.nextDouble();

        // Calcula a área
        double area = comprimento * largura;

        // Exibe o resultado
        System.out.println("A área da chapa de aço é: " + area + " metros quadrados.");

        scanner.close();
    }
}
