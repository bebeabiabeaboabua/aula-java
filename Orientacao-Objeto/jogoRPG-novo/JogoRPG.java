import java.util.Scanner;

public class JogoRPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

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
        System.out.println("Aperte enter para iniciar a batalha");
        scanner.nextLine(); // Primeiro limpa o Enter que sobrou do nextInt()
        String enter = scanner.nextLine();

        int round = 0;
        while(personagem1.vida > 0 && personagem2.vida > 0){
        
            round ++;
            System.out.println("X-----------------------------------------------------------X");
            System.out.println("Round "+round);

            personagem1.atacar();
            personagem1.subirDeNivel();

            personagem2.receberDano(personagem1.forca);

            personagem2.atacar();

            personagem1.receberDano(personagem2.forca);

            personagem1.usarHabilidade();

            personagem2.receberDano(personagem1.forca);

            personagem2.usarHabilidade();

            personagem2.subirDeNivel();


        }
        if(personagem1.vida == 0){
            System.out.println(personagem2.nome+" venceu!");
        }else if(personagem2.vida == 0){
            System.out.println(personagem1.nome+" venceu!");
        }else{
            System.out.println("Empate");
        }

        personagem1.mostrarStatus();
        personagem1.desenharPersonagem(1);
        personagem2.mostrarStatus();
        personagem1.desenharPersonagem(2);

    }
    
}
