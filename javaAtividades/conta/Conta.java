import java.util.Scanner;

public class Conta {
    double saldoConta = 1800;
    Scanner scanner = new Scanner(System.in);

    // Adiciona saldo se a transferência for válida
    public void adicionarSaldo(double adicao) {
        saldoConta += adicao;
    }

    // Realiza débito se possível, senão mostra mensagem de erro
    public void debito(double subtracao) {
        if (subtracao <= saldoConta) {
            if (saldoConta > 0) {
                saldoConta -= subtracao;
            } else {
                System.out.println("Impossível realizar débito. Seu saldo está 0.");
                System.out.println("Aperte Enter para continuar.");
                scanner.nextLine();
            }
        } else {
            System.out.println("Impossível realizar débito. Valor maior que o saldo disponível.");
            System.out.println("Aperte Enter para continuar.");
            scanner.nextLine();
        }
    }

    // Retorna o saldo atual
    public double getSaldo() {
        return saldoConta;
    }

    // Verifica se a conta pode fazer uma transação (transferir um valor)
    public boolean podeTransferir(double valor) {
        return saldoConta > 0 && valor <= saldoConta;
    }
}
