import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta2.saldoConta = 6000;
        
        System.out.println("Saldo da conta 1: "+conta1.saldoConta);
        System.out.println("Saldo da conta 2: "+conta2.saldoConta);
            
            
        while(true){
        System.out.println("Digite quanto quer transferir da conta 2 para a conta 1");
        double transferir = scanner.nextDouble();
        
        if(transferir > 0){
        if (conta2.podeTransferir(transferir)) {
                conta2.debito(transferir);
                conta1.adicionarSaldo(transferir);
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Transferência não permitida. Saldo insuficiente ou valor inválido.");
            }
        }else{
            System.out.println("Valor invalido. Digite novamente.");

        }
        System.out.println("Saldo total conta 1: "+conta1.getSaldo());
        System.out.println("Saldo total conta 2: "+conta2.getSaldo());
}

    }
    
}