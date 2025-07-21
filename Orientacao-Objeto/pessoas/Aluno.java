public class Aluno extends Pessoa {
    private int nota;
    private String comportamento;
    private String corFavorita;

    public Aluno(){
        
    }

    public Aluno(String nome, int idade, String corCabelo, double altura, String estilo, boolean usaOculos,
                 int nota, String comportamento, String corFavorita) {
        super(nome, idade, corCabelo, altura, estilo, usaOculos); // chama o construtor da superclasse
        this.nota = nota;
        this.comportamento = comportamento;
        this.corFavorita = corFavorita;
    }

    // Getter e Setter para nota
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    // Getter e Setter para comportamento
    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

@Override
public void exibirInformacoes() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Cor do Cabelo: " + getCorCabelo());
    System.out.println("Altura: " + getAltura());
    System.out.println("Estilo: " + getEstilo());
    System.out.println("Usa oculos: " + (getUsaOculos() ? "Sim" : "Nao"));
    System.out.println("Nota: " + getNota());
    System.out.println("Comportamento: " + getComportamento());
    System.out.println("Cor favorita: " + getCorFavorita());

}

}
