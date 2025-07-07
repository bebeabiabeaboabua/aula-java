import java.util.Scanner;

public class AreaTriangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] trianguloX = new double[3];
        double[] trianguloY = new double[3];

        System.out.println("X=== Bem vindo ao medidor de area do triangulo! ===X");
        System.out.println("x------------------------------------x");

        System.out.println("Digite as medidas do triangulo x: ");
            for(int i = 0; i < 3; i++){
                trianguloX[i] = scanner.nextDouble();
            }
        
        System.out.println("x------------------------------------x");

        System.out.println("Digite as medidas do triangulo y: ");
            for(int i = 0; i < 3; i++){
                trianguloY[i] = scanner.nextDouble();
            }

        //criar variavel p
        double Xp = (trianguloX[0]+trianguloX[1]+trianguloX[2])/2;
        //criar variavel da formula de heron
        double xArea = Math.sqrt(Xp*(Xp-trianguloX[0])*(Xp-trianguloX[1])*(Xp-trianguloX[2]));
        //criar variavel p
        double Yp = (trianguloY[0]+trianguloY[1]+trianguloY[2])/2;
        //criar variavel da formula de heron
        double yArea = Math.sqrt(Yp*(Yp-trianguloY[0])*(Yp-trianguloY[1])*(Yp-trianguloY[2]));

        System.out.printf("\nArea do triangulo X: %.3f%n", xArea);
        System.out.println("-------------------");
        System.out.printf("Area do triangulo y: %.3f%n", yArea);
        System.out.println("-------------------");

        if(xArea > yArea){
            System.out.println("x==== Area do triangulo X eh maior ====x");
        }else if (yArea > xArea){
            System.out.println("x==== Area do triangulo y eh maior ====x");
        }else{
            System.out.println("x==== As areas sao iguais ====x");
        }

    }
}