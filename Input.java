import java.util.Scanner;

public class Input {
    
    public static void main(String[] args){

        //input
        Scanner scanner = new Scanner(System.in); //instâncvia de uyma classe, transforma ela em objeto (new)
        System.out.print("digite lo noimbre: ");
        String nome = scanner.nextLine();

        System.out.print("Doigite sua endade: ");
        int idade = scanner.nextInt();
        
        System.out.println("seu nome eh:"+nome+" e voce tem "+idade+" anos :)");

        //saida de imformação
        System.out.println("oie xentiih");

    }
}