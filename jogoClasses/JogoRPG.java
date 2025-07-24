import java.util.Scanner;

public class JogoRPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1, digite seu nome:");
        String nome1 = scanner.nextLine();
        System.out.println(nome1 + ", escolha sua classe (mago ou guerreiro):");
        String classe1 = scanner.nextLine();
        Personagem jogador1 = criarPersonagem(classe1, nome1);

        System.out.println("\nJogador 2, digite seu nome:");
        String nome2 = scanner.nextLine();
        System.out.println(nome2 + ", escolha sua classe (mago ou guerreiro):");
        String classe2 = scanner.nextLine();
        Personagem jogador2 = criarPersonagem(classe2, nome2);

        if (jogador1 != null && jogador2 != null) {
            System.out.println("\n--- Batalha começa! ---\n");

            jogador1.atacar();
            jogador2.receberDano(jogador1.forca);

            jogador2.atacar();
            jogador1.receberDano(jogador2.forca);

        } else {
            System.out.println("Um dos jogadores escolheu uma classe inválida.");
        }

        scanner.close();
    }

    public static Personagem criarPersonagem(String classe, String nome) {
        switch (classe.toLowerCase()) {
            case "mago":
                return new Mago(nome);
            case "guerreiro":
                return new Guerreiro(nome);
            default:
                System.out.println("Classe desconhecida.");
                return null;
        }
    }
}
