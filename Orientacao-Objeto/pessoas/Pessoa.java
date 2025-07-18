public class Pessoa{
    private int idade;
    private String nome;
    private String corCabelo;
    private double altura;
    private String estilo;
    private boolean usaOculos;

    public Pessoa(String nome, int idade, String corCabelo, double altura, String estilo, boolean usaOculos) {
        this.nome = nome;
        this.idade = idade;
        this.corCabelo = corCabelo;
        this.altura = altura;
        this.estilo = estilo;
        this.usaOculos = usaOculos;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para corCabelo
    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    // Getter e Setter para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getter e Setter para estilo
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // Getter e Setter para usaOculos
    public boolean isUsaOculos() {
        return usaOculos;
    }

    public void setUsaOculos(boolean usaOculos) {
        this.usaOculos = usaOculos;
    }

    public void exibirInformacoes(){
        System.out.println("informacoes");
    }
}
