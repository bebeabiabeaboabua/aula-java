import java.util.Scanner;

public class Circulo
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o raio do seu circulo :)");
		double raio = scanner.nextDouble();
		
		double pi = Math.PI;
		double area = pi * Math.pow(raio, 2);
		double diametro = raio*2;
		double circunferencia = 2 * pi * raio;
		
		System.out.println("area: "+area);
		System.out.println("diametro: "+diametro);
		System.out.println("circunferencia: "+circunferencia);


	}
}
