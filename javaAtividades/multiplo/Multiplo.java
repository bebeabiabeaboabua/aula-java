import java.util.Scanner;

public class Multiplo
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o segundo numero");
		int numero2 = scanner.nextInt();
		
		if(numero1 % numero2 == 0){
		System.out.println("eh multiplo");

		}else{
		System.out.println("nao eh multiplo");

		}
		
	}
}
