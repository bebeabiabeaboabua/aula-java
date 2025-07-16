import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();

        System.out.println("nome: ");
        funcionario1.nome = scanner.nextLine();
    
        System.out.println("salario bruto: ");
        funcionario1.salarioBruto = scanner.nextDouble();

        System.out.println("taxa: ");
        funcionario1.taxa = scanner.nextDouble();

        System.out.println("\nFuncionario: "+funcionario1.nome);
        System.out.println("Digite o valor percentual do aumento: ");
        double percentual = scanner.nextDouble();
        funcionario1.Aumento(percentual);

        System.out.println("\nDados atualizados: "+funcionario1);

        scanner.close();

    }
    
}
