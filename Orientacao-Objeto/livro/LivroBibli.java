public class LivroBibli extends Livro{

    private String localPrateleira;
    private String categoria;
    private int prazoDevolver;
    private int dataEmprestou;
    private String nomeQuemEmprestou;

    LivroBibli(){

    }

    LivroBibli( int codigo,
                String titulo,
                int prazoDevolver){
        super(codigo, titulo);
        this.prazoDevolver = prazoDevolver;
    }

    //==================================================================

    public String getLocalPrateleira(){
        return localPrateleira;
    }
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira = localPrateleira;
    }


    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public int getPrazoDevolver(){
        return prazoDevolver;
    }
    public void setPrazoDevolver(int prazoDevolver){
        this.prazoDevolver = prazoDevolver;
    }

    public int getDataEmprestou(){
        return dataEmprestou;
    }
    public void serDataEmprestou(int dataEmprestou){
        this.dataEmprestou = dataEmprestou;
    }

    public String getNomeQuemEmprestou(){
        return nomeQuemEmprestou;
    }

    public void setNomeQuemEmprestou(String nomeQuemEmprestou){
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    public void Alugar(){
        System.out.println("alugando");
    }

    public void Devolver(){
        System.out.println("devolvendo");
    }

    //==================================================================

    @Override
    public void Localizar (){
        System.out.println("localizando livro de biblioteca");
    }

    @Override
    public void Cadastrar (){
        System.out.println("cadastrando livro de biblioteca");
    }

    @Override
    public void Ler (){
        System.out.println("lendo livro de biblioteca");
    }

}