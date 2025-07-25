import java.util.Scanner;

public class soma {
        public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("SOMA = "+soma);
}
}
