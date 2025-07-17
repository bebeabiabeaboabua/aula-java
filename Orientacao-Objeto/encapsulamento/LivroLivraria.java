public class LivroLivraria extends Livro{

    private String localPrateleira;
    private String categoria;
    private int preco;
    private int dataEmprestou;
    private String novoUsado;


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

        public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public int getDataEmprestou(){
        return dataEmprestou;
    }

    public void setDataEmprestou(int dataEmprestou){
        this.dataEmprestou = dataEmprestou;
    }

    public String getNovoUsado(){
        return novoUsado;
    }

    public void setNovoUsado(String novoUsado){
        this.novoUsado = novoUsado;
    }

    
    public void Vender(){
        System.out.println("vendendo");
    }

}