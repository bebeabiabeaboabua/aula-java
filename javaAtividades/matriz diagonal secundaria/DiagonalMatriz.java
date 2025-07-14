import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[10][10];

        System.out.println("Digite os caracteres da matriz 10x10:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.println("\nMatriz sem a diagonal secundária:\n");
        imprimirSemDiagonalSecundaria(matriz);
    }

    // Método estático que imprime a matriz sem a diagonal secundária
    public static void imprimirSemDiagonalSecundaria(char[][] matriz) {
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j != tamanho - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  "); // espaço no lugar da diagonal
                }
            }
            System.out.println();
        }
    }
}
