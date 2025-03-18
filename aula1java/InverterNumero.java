import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro de 4 dígitos
        System.out.print("Digite um número inteiro com quatro dígitos: ");
        int numero = scanner.nextInt();

        // Inverte o número
        int milhar = numero / 1000;
        int centena = (numero / 100) % 10;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int numeroInvertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar;

        // Exibe o número invertido
        System.out.println("O número invertido é: " + numeroInvertido);

        scanner.close();
    }
}
