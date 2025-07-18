public class Professor extends Pessoa {
    private int anosExperiencia;
    

    public Professor(String nome, int idade, String corCabelo, double altura, String estilo, boolean usaOculos,
                 int anosExperiencia) {
        super(nome, idade, corCabelo, altura, estilo, usaOculos); // chama o construtor da superclasse
        this.anosExperiencia = anosExperiencia;
    }

    // Getter e Setter para nota
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int nota) {
        this.anosExperiencia = anosExperiencia;
    }

@Override
public void exibirInformacoes() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Cor do Cabelo: " + getCorCabelo());
    System.out.println("Altura: " + getAltura());
    System.out.println("Estilo: " + getEstilo());
    System.out.println("Usa oculos: " + (isUsaOculos() ? "Sim" : "Não"));
    System.out.println("anos de experiencia: " + getAnosExperiencia());
}

}
