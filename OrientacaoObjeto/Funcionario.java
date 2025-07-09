package OrientacaoObjeto;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double SalarioLiquido(){
        return salarioBruto - taxa;
    }

    public double Aumento(){
        salarioBruto += salarioBruto * (pedir percentual)/100;
    }
    
}
