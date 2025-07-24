public class Guerreiro extends Personagem {
    private boolean danoAumentado = false;
    private int forcaInicial = 0;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        if(!danoAumentado){
        forca = random.nextInt(20) + forcaNivel;
        System.out.println("Guerreiro ataca com a espada! "+forca+" de dano");
        }else{
        forcaInicial = random.nextInt(20) + forcaNivel;
        forca += (int) (forcaInicial * 1.25);
        System.out.println("Guerreiro ataca com dano aumentado! "+forca+" de dano");
        danoAumentado = false;
        }
    }

    @Override
    public void receberDano(int dano){
        System.out.println(nome+" recebeu "+dano+" de dano. Vida restante: "+vida);
        vida -= dano;

    }

    @Override
    public void usarHabilidade(){
        System.out.println(nome+" usou a habilidade especial! Dano aumentado em 25% no proximo ataque");
        danoAumentado = true;
    }

    @Override
    public void subirDeNivel(){
        nivel += 1;
        vida =+ 10;
        forcaNivel =+ 2;
        System.out.println(nome+" subiu de nível");
    }

    @Override
    public void mostrarStatus(){
        System.out.println("X=========================X");

        System.out.println("Status do personagem");
        System.out.println("Nome: "+nome);
        System.out.println("Classe: "+classe);
        System.out.println("Vida: "+vida);
        System.out.println("Nivel: "+nivel);
        System.out.println("Forca: "+(forca+forcaNivel));
        System.out.println("------------------------------");
    }
}
