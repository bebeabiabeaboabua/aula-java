import java.util.Scanner;

public class JogoRPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        //Mago mago =

        personagem2.nome = "Anthony";
        personagem2.classe = "tank";

        System.out.println("X-----------------------------------------------------------X");
        System.out.println("Bem-vindo ao super simulador de batalha epica!");
        System.out.println("X-------");

        System.out.println("Escolha o nome do seu personagem");
        personagem1.nome = scanner.nextLine();
        System.out.println("Escolha a classe do seu personagem\nmago\natirador\ntank");
        personagem1.classe = scanner.nextLine();

        personagem1.mostrarStatus();
        personagem1.desenharPersonagem(1);
        personagem2.mostrarStatus();
        personagem1.desenharPersonagem(2);

        System.out.println("X-----------------------------------------------------------X");

        nomeClasse(scanner.nextLine());

        batalha(nomeClasse());
    }

    public void batalha(String classe, String classe2){
        classe.atacar();

    }

    public String nomeClasse(Personagem personagem){
        if(personagem.classe.equals("mago")){
            return "mago";
        }
    }
    
}
