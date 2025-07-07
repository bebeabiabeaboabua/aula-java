import java.util.Scanner;

public class EscolaRural{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] semana = new double[7];
        String[] dias = {"domingo", "segunda", "terca","quarta","quinta", "sexta", "sabado"};
        double maior = 0;
        double menor = 0;
        double soma = 0;
        String diaMaior = "";
        String diaMenor = "";

        System.out.println("X=== Olá informe a temperatura dos dias da semana ===X");
        System.out.println("x------------------------------------x");
        
            for(int i = 0; i < 7; i++){
                System.out.println("Dia "+(i+1)+" - "+dias[i]);
                semana[i] = scanner.nextDouble();
                soma = soma + semana[i];

                if (i==0){
                    maior = semana[0];
                    menor = semana[0];
                    diaMaior = dias[0];
                    diaMenor = dias[0];
                }else{
                    if(semana[i] > maior){
                        maior = semana[i];
                        diaMaior = dias[i];

                    }
                    if(semana[i] < menor){
                        menor = semana[i];
                        diaMenor = dias[i];
                    }
                }

            }
        
        System.out.println("x------------------------------------x");

        double media = soma/7;

        System.out.printf("Temperatura media da semana: %.2f%n", media);
            System.out.println("Dia com maior temperatura: "+diaMaior+" ("+maior+")");
            System.out.println("Dia com a menor temperatura: "+diaMenor+" ("+menor+")");
        }

    }
