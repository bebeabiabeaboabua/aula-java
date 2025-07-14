public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double SalarioLiquido(){
        return salarioBruto - taxa;
    }

    public void Aumento(double porcentagem){
        salarioBruto += salarioBruto * (porcentagem/100.0);
    }
    
    public String toString(){
        return nome + ", $ "+ String.format("%.2f", SalarioLiquido());
    }
}
