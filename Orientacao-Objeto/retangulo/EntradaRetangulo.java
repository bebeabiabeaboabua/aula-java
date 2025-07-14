import java.util.Scanner;

public class EntradaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();

        System.out.println("Digite a altura do retangulo: ");
        retangulo1.altura = scanner.nextDouble();

        System.out.println("Digite a largura do retangulo: ");
        retangulo1.largura = scanner.nextDouble();

        System.out.println("area: "+retangulo1.area());
        System.out.println("");
        System.out.println("perimetro: "+retangulo1.perimetro());
        System.out.println("");
        System.out.printf("diagonal: %.2f%n", retangulo1.diagonal());


    }
}


