
import java.util.Scanner;

public class Calculator{

    public static boolean continuar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDeseja fazer outro cálculo?");
        System.out.println("1 - Sim (voltar ao menu)");
        System.out.println("2 - Não (sair)");
        int opcao = scanner.nextInt();

        return opcao == 1; // se for 1, volta pro menu
    }

    public static double[] pegarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    public static void soma(){
        double[] numeros = pegarNumeros();
        double soma = numeros[0] + numeros[1];
        System.out.println("soma: "+soma);
    }


    public static void subtracao(){
        double[] numeros = pegarNumeros();
        double subtracao = numeros[0] - numeros[1];
        System.out.println("subtracao: "+subtracao);
    }

    public static void divisao(){
        double[] numeros = pegarNumeros();
        double divisao = numeros[0] / numeros[1];
        System.out.println("divisao: "+divisao);
    }

    public static void restoDaDivisao(){
        double[] numeros = pegarNumeros();
        double restoDaDivisao = numeros[0] % numeros[1];
        System.out.println("Resto da divisao: "+restoDaDivisao);
    }


    public static void multiplicar(){
        double[] numeros = pegarNumeros();
        double multiplicar = numeros[0] * numeros[1];
        System.out.println("multiplicacao: "+multiplicar);
    }

    public static void menuCalculadora(){
        Scanner scanner = new Scanner(System.in); 
        boolean repetir = true;

        while (repetir){
            System.out.println("Escolha uma operacao");
            System.out.println("x-----------------------");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Resto da Divisao");
            System.out.println("6 - sair");
            System.out.println("x-----------------------");

            int operacao = scanner.nextInt();

            switch (operacao){
                case 1:
                    soma();
                    repetir = continuar();
                    break;
                case 2:
                    subtracao();
                    repetir = continuar();
                    break;
                case 3:
                    multiplicar();
                    repetir = continuar();
                    break;
                case 4:
                    divisao();
                    repetir = continuar();
                    break;
                case 5:
                    restoDaDivisao();
                    repetir = continuar();
                    break;
                case 6:
                    System.out.println("Encerrando o programa... Obrigada por usar! 🧡");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
    }

    public static void main(String[] args){
        menuCalculadora();
    }
    }