import java.util.Random;

public class Personagem {
    Random random = new Random();
    public String nome;
    public String classe; // atirador, mago, tank
    public int nivel = 1; //inicia em 1
    public int vida; //maximo 100
    public int forca; //varia com a classe
    public int forcaNivel = 0;
    
    public Personagem(String nome) {
        this.nome = nome;
    }
    

    public void atacar(){
        System.out.println("Personagem atacou");

    }

    public void receberDano(int dano){
        System.out.println("Personagem recebeu dano");

    }

    public void usarHabilidade(){
        System.out.println("Personagem usou habilidade");

    }

    public void mostrarStatus(){
        System.out.println("Status do personagem");
    }

    public void subirDeNivel(){
        System.out.println(nome+"Personagem subiu de nível");
    }

    public void desenharPersonagem(int personagem){
        System.out.println("Desenho do personagem");

    }


    
}
