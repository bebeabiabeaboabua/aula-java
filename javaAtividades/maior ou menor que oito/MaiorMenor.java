import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[12];
        int maiorOito = 0;
        int menorOito = 0;
        
        for(int i = 0; i < 12; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();
            if(numeros[i] < 8){
                menorOito++;
            } else if(numeros[i] > 8){
                maiorOito++;
            }
        }
        
        double porcentagemMaior = (maiorOito * 100.0) / 12;
        double porcentagemMenor = (menorOito * 100.0) / 12;
        
        System.out.printf("Porcentagem de números maiores que 8: %.2f%%\n", porcentagemMaior);
        System.out.printf("Porcentagem de números menores que 8: %.2f%%\n", porcentagemMenor);
    }
}
