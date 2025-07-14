public class NotaFiscal {
    private String numeroPeca;
    private String descricaoPeca;
    private int quantidadeComprada;
    private double preco;

    public NotaFiscal(String numeroPeca, String descricaoPeca, int quantidadeComprada, double preco) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }

    public double getTotal() {
        return quantidadeComprada * preco;
    }

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
