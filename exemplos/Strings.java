import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Crie uma senha de 4 digitos: ");
        String senha = scanner.nextLine();

        // Verifica se a senha tem 4 dígitos
        while (senha.length() != 4) {
            System.out.print("A senha deve ter exatamente 4 digitos. Tente novamente: ");
            senha = scanner.nextLine();
        }

        String digiteAsenha;

        do {
            System.out.print("Digite a senha: ");
            digiteAsenha = scanner.nextLine();

            if (!digiteAsenha.equals(senha)) {
                System.out.println("Senha invalida!!");
            }

        } while (!digiteAsenha.equals(senha));

        System.out.println("Obrigada!");
        
    //localizatr caracteres
    String texto = "bilu blilu \"bilu\" bolo";
    System.out.println(texto.indexOf("blilu"));
    System.out.println(texto.toUpperCase());

    //concatenar

    System.out.println(senha+" "+texto);


        scanner.close();
    }
}
