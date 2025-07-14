import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem2.nome = "Anthony";
        personagem2.classe = "tank";

        System.out.println("Escolha o nome do seu personagem");
        personagem1.nome = scanner.nextLine();
        System.out.println("Escolha a classe do seu personagem\nmago\natirador\ntank");
        personagem1.classe = scanner.nextLine();

        personagem1.mostrarStatus();
        personagem1.desenharPersonagem(1);
        personagem2.mostrarStatus();
        personagem1.desenharPersonagem(2);

        while(personagem1.vida > 0 && personagem2.vida > 0){

        personagem1.atacar();
        personagem1.subirDeNivel();
        personagem2.receberDano(personagem1.forca);

        personagem2.atacar();
        personagem1.receberDano(personagem2.forca);

        personagem1.usarHabilidade();
        personagem2.receberDano(personagem1.forca);

        personagem2.usarHabilidade();
        personagem2.atacar();
        personagem2.subirDeNivel();
        personagem1.receberDano(personagem2.forca);

        }
        if(personagem1.vida == 0){
            System.out.println("Jogador 2 venceu!");
        }else if(personagem2.vida == 0){
            System.out.println("Jogador 1 venceu!");
        }else{
            System.out.println("Empate");
        }

        personagem1.mostrarStatus();
        personagem2.mostrarStatus();

    }
    
}
