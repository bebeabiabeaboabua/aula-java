public class LivroBibli extends Livro{

    String localPrateleira;
    String categoria;
    int prazoDevolver;
    int dataEmprestou;
    String nomeQuemEmprestou;

    public void Alugar(){
        System.out.println("alugando");
    }

    public void Devolver(){
        System.out.println("devolvendo");
    }

}