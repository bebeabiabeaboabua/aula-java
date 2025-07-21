import java.util.Random;

public class Personagem {
    Random random = new Random();
    public String nome;
    public String classe; // atirador, mago, tank
    public int nivel = 1; //inicia em 1
    public int vida = 100; //maximo 100
    public int mana = 100; //somente para mago
    public int forca; //varia com a classe
    public int forcaNivel = 0;
    public boolean reduzirDanoTank = false;

    

    public boolean estaVivo(){
        return vida > 0;
    }
    public void atacar(){

    }

    public void receberDano(int dano){

    }

    public void usarHabilidade(){ //reduz mana
    
        
    }

    public void mostrarStatus(){
        System.out.println("X=========================X");

        System.out.println("Status do personagem");
        System.out.println("Nome: "+nome);
        System.out.println("Classe: "+classe);
        System.out.println("Vida: "+vida);
        if(classe.equals("mago")){
        System.out.println("Mana: "+mana);
        }
        System.out.println("Nivel: "+nivel);
        if(classe.equals("mago")){
            System.out.println("Forca: "+(40+forcaNivel));
        }else if(classe.equals("atirador")){
            System.out.println("Forca: "+(25+forcaNivel));
        }else if(classe.equals("tank")){
            System.out.println("Forca: "+(5+forcaNivel));
        }
        System.out.println("------------------------------");

    }

    public void subirDeNivel(){
        nivel += 1;
        System.out.println(nome+"  subiu de nivel!");
        System.out.println("Nivel atual de "+nome+": "+nivel);
        forcaNivel += 5;
        if(vida < 100){
            vida = vida + 10;
        }
        if (vida > 100){
            vida = 100;
        }
    }

    public void desenharPersonagem(int personagem){
        switch (personagem) {
            case 1:
                System.out.println(" /\\_/\\");
                System.out.println("( o.o )");
                System.out.println(" > ^ <");
                break;
            case 2:
                System.out.println("  O ");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
            default:
                System.out.println("Personagem desconhecido!");
                break;
        }
    }


    
}
