public class NotaFiscal {
    // Atributos
    private String numeroPeca;
    private String descricaoPeca;
    private int quantidadeComprada;
    private double preco;

    // Construtor
    public NotaFiscal(String numeroPeca, String descricaoPeca, int quantidadeComprada, double preco) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }

    // Método que retorna o total dessa nota (quantidade × preço)
    public double getTotal() {
        return quantidadeComprada * preco;
    }

    // Método estático que recebe um vetor de notas e soma todos os totais
    public static double getTotalNota(NotaFiscal[] notas) {
        double totalGeral = 0;

        for (int i = 0; i < notas.length; i++) {
            totalGeral += notas[i].getTotal();
        }

        return totalGeral;
    }
    
    public String getNumeroPeca() {
    return numeroPeca;
}

}
