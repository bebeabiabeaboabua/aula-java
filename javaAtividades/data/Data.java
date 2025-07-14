public class Data {
    // Atributos da data
    private int dia;
    private int mes;
    private int ano;

    // Construtor da data
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // (a) Método para imprimir a data no formato dd/mm/aaaa
    public void imprimirData() {
        System.out.printf("Data: %02d/%02d/%04d\n", dia, mes, ano);
    }

    // (b) Método para calcular os dias acumulados até o mês informado
    // Ex: se mês = 3, soma os dias de jan + fev (sem contar março)
    public int calcularDiasAteMes(int mesParametro) {
        int totalDias = 0;

        for (int m = 1; m < mesParametro; m++) {
            if (m % 2 == 1) { // meses ímpares → 31 dias
                totalDias += 31;
            } else { // meses pares → 30 dias
                totalDias += 30;
            }
        }

        return totalDias;
    }
}
