public class Mago extends Personagem {
    private int mana = 100;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void atacar(){
    forca = random.nextInt(40) + forcaNivel;
    System.out.println(nome+" atacou com seu cajado de magia, causando "+forca+" de dano");
    }

    @Override
    public void receberDano(int dano){
            vida -= dano;
            if (vida < 0) {
            vida = 0;
}
            System.out.println(nome+" recebeu "+dano+" de dano");
    }
    
    @Override
    public void usarHabilidade(){
        if (mana >= 25) {
            System.out.println(nome + " usou a habilidade especial Cristais Uivantes! Causou 40 de dano!");
            mana -= 50;
            forca = 40;
        } else {
            System.out.println(nome + " tentou usar a habilidade, mas nao tem mana suficiente!");
            forca = 0;
        }
    }
}
