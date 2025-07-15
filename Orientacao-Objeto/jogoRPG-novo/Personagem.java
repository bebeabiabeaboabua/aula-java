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
        if(!estaVivo()){
            System.out.println(nome + " esta morto e nao pode atacar.");
            forca = 0;
            return;
        }
        if(classe.equals("mago") ){
        forca = random.nextInt(40) + forcaNivel;
        System.out.println(nome+" atacou com seu cajado de magia, causando "+forca+" de dano");
        }else if(classe.equals("atirador")){
        forca = random.nextInt(25) + forcaNivel;
        System.out.println(nome+" atacou com seu arco de flechas congelantes, causando "+forca+" de dano");
        }else if(classe.equals("tank")){
        forca = random.nextInt(5) + forcaNivel;
        System.out.println(nome+" atacou com sua armadura de espinhos, causando "+forca+" de dano");       
        }
    }

    public void receberDano(int dano){
        if(!estaVivo()){
            System.out.println(nome + " ja esta morto e nao pode receber dano.");
            return;
        }

        if(classe.equals("tank") && reduzirDanoTank){
            int danoReduzido = (int)(dano*0.25);
            vida -= danoReduzido;
            System.out.println(nome+" sofreu dano reduzido em 75%: "+danoReduzido+" de dano");
            reduzirDanoTank = false;
        }else if (classe.equals("tank")){
                int danoReduzido = (int)(dano*0.75);
                vida -= danoReduzido;
                if (vida < 0) {
                vida = 0;
                }
                System.out.println(nome+" sofreu dano reduzido: "+danoReduzido+" de dano");
        }else{
            vida -= dano;
            if (vida < 0) {
            vida = 0;
}
            System.out.println(nome+" recebeu "+dano+" de dano");
        }
        if (vida <=0){
            System.out.println(nome+" morreu");
        }
        System.out.println("Vida de "+nome+": "+vida);
    }

    public void usarHabilidade(){ //reduz mana
        if (!estaVivo()) {
            System.out.println(nome + " esta morto e nao pode usar habilidades.");
            froca = 0;
            return;
        }
    if (classe.equals("mago")) {
        if (mana >= 25) {
            System.out.println(nome + " usou a habilidade especial Cristais Uivantes! Causou 40 de dano!");
            mana -= 50;
            forca = 40;
        } else {
            System.out.println(nome + " tentou usar a habilidade, mas nao tem mana suficiente!");
            forca = 0;
        }
            System.out.println("Mana atual: "+(mana));
        }else if(classe.equals("atirador")){
            System.out.println(nome+" usou a habilidade especial Arco Infernal! Causou 25 de dano!");
            forca = 25;
        }else if(classe.equals("tank")){
            System.out.println(nome+" usou a habilidade especial Defesa Imbativel. Reduz o dano em 75% do próximo ataque");
            reduzirDanoTank = true;
        }
        
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
