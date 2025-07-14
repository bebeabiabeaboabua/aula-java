public class MainNota {
    public static void main(String[] args) {
        // Criando um vetor com 3 notas
        NotaFiscal[] notas = new NotaFiscal[3];

        // Preenchendo com dados
        notas[0] = new NotaFiscal("001", "Parafuso", 10, 0.50);
        notas[1] = new NotaFiscal("002", "Porca", 5, 1.20);
        notas[2] = new NotaFiscal("003", "Arruela", 20, 0.30);

        // Exibindo total de cada nota
        for (NotaFiscal nota : notas) {
System.out.printf("Nota da peça %s - Total: R$ %.2f\n", nota.getNumeroPeca(), nota.getTotal());
        }

        // Exibindo total geral
        double totalGeral = NotaFiscal.getTotalNota(notas);
        System.out.printf("Total geral das notas: R$ %.2f\n", totalGeral);
    }
}
