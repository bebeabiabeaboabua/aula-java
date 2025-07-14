import java.util.Scanner;

public class CodigoASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0); // pega o primeiro caractere digitado

        int codigoASCII = (int) caractere; // converte o char pra int (código ASCII)

        System.out.println("Caractere digitado: " + caractere);
        System.out.println("Código ASCII: " + codigoASCII);
    }
}
