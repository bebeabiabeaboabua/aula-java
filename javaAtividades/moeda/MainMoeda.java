
import java.util.Scanner;

public class MainMoeda
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    MoedaViciada escolha1 = new MoedaViciada();
	    
	    while(true){
		System.out.println("Escolha cara ou coroa");
		String escolha = scanner.nextLine();
		String resultado = escolha1.CaraOuCoroa(escolha);
		
		System.out.println("O resultado eh...");
		System.out.println("Plim!");
		System.out.println(resultado);

}
	}
}
