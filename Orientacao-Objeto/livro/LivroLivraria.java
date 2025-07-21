public class LivroLivraria extends Livro{

    private String localPrateleira;
    private String categoria;
    private int preco;
    private String novoUsado;

    LivroLivraria(){

    }


        LivroLivraria(int codigo, String titulo, int preco){
        super(codigo, titulo);
        this.preco = preco;
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

        public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public String getNovoUsado(){
        return novoUsado;
    }

    public void setNovoUsado(String novoUsado){
        this.novoUsado = novoUsado;
    }

    //=====================================================
    
    public void Vender(){
        System.out.println("vendendo");
    }

    @Override
    public void Localizar(){
        System.out.println("localizando livro livraria");
    }

    @Override
    public void Cadastrar (){
        System.out.println("cadastrando livro de livraria");
    }

    @Override
    public void Ler (){
        System.out.println("lendo livro de livraria");
    }
}