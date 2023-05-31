import java.util.Scanner;

public class Exemplo_Thorw_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int dividendo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite outro número inteiro: ");
        int divisor = Integer.parseInt(scanner.nextLine());

        if (divisor == 0) {
            throw new ArithmeticException("Divisor não pode ser igual a zero");
        }

        int resultado = dividendo / divisor;
        System.out.println("O resultado é: " + resultado);
    }
}
