import java.util.Scanner;

public class Jogo  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Numero aleatorio
        int numRDM = (int)(Math.random()*101);

        int digiteOnumero;
        int tentativas = 0;
        
        System.out.println("x------------------------------x");
        System.out.println("\nBem-vindo ao jogo de adivinhacao!\n");
        System.out.println("x------------------------------x");

        do {

            System.out.println("-------------------------------");
            System.out.print("Adivinhe o numero de 0 a 100: ");

            digiteOnumero = scanner.nextInt();

            tentativas = tentativas + 1;
          
                if(digiteOnumero < numRDM){ //aqui ele compara se o numero digitado está abaixo do valor para adivinhar
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Errou! Seu chute esta muito baixo");


                } else if (digiteOnumero > numRDM){ //aqui ele compara se o numero digitado está acima do valor para adivinhar

                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Errou! Seu chute esta muito alto");

            }

        } while (digiteOnumero != numRDM);

        System.out.println("\n////////////////////////////////\n");
        System.out.println("Acertou! O numero era "+numRDM);
        System.out.println("-------------------------------");
        System.out.println("Tentativas: "+tentativas);

    
        scanner.close();
    
    }
}
