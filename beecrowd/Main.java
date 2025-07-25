import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeira peça
        int cod1 = scanner.nextInt();
        int qtd1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        // Segunda peça
        int cod2 = scanner.nextInt();
        int qtd2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        // Cálculo do valor total
        double total = (qtd1 * valor1) + (qtd2 * valor2);

        // Saída formatada
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
