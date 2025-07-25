
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		double raio = scanner.nextDouble();
		
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
        System.out.printf("A=%.4f%n", area);

	}
}

