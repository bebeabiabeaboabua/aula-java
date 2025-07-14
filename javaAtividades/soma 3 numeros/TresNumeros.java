import java.util.Scanner;

public class TresNumeros
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite o 1 numero");
		int num = scanner.nextInt();
		int maiorNum = num;
		int menorNum = num;
		int soma = num;
        int produto = num;

		
		for(int i = 0; i < 2; i++){
    		System.out.println("Digite o "+(i+2)+" numero");
    		num = scanner.nextInt();
    		soma = soma + num;
            produto *= num;
    		if(num > maiorNum){
    		    maiorNum = num;
    		}else if(num < menorNum){
    		    menorNum = num;
    		}
		}
		
	    double media = soma/3.0;
	    
	    System.out.println("Maior numero: "+maiorNum);
	    System.out.println("Menor numero: "+menorNum);
	    System.out.println("Produto: "+produto);
	    System.out.println("Media: "+media);

	    
		
	}
}
