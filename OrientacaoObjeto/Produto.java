public class Produto {

    String name;
    double price;
    int quantidade;
 

// X======= essa sessão aqui é só de comportamentos, entao la no principal ele vai receber os valores e chamar essas funçõe aqui, mas elas só vão fazer a conta, elas não recebem valores    
    public double totalValorProdutos(){
        return price*quantidade;
    }

    public void adicionarProdutos(int qnt){
        this.quantidade += qnt;
    } 

    public void removerProdutos(int qnt){
        this.quantidade -= qnt;
    }

    public String mensagem(){
        String mensagem = "Produtos: "+name+", R$"+price+", "+quantidade+" unidades, Total: R$"+totalValorProdutos();
        return mensagem;
    }
}
