import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.println("Digite o dia:");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês:");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        // Criando o objeto da data
        Data data = new Data(dia, mes, ano);

        // (a) Imprimindo a data
        data.imprimirData();

        // (b) Calculando dias até o mês informado
        int diasAteMes = data.calcularDiasAteMes(mes);
        System.out.println("Dias até o mês " + mes + ": " + diasAteMes);

        scanner.close();
    }
}
