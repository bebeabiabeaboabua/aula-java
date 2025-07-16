public class LivrosMain{
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "Livro magico de feiticos";
        livro.autor = "Daron Nefcy";
        livro.editora = "editora abril";
        livro.nrPaginas = 500;
        livro.edicao = 2;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        LivroBibli livrobiblioteca = new LivroBibli();
        livrobiblioteca.codigo = 11;
        livrobiblioteca.titulo = "pato";
        livrobiblioteca.autor = "bia";
        livrobiblioteca.nrPaginas = 10;
        livrobiblioteca.edicao = 1;
        livrobiblioteca.categoria = "jogos";
        livrobiblioteca.prazoDevolver = 10;
        livrobiblioteca.nomeQuemEmprestou = "eu bia";
        livrobiblioteca.localPrateleira = "fonfon";
        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();

        LivroLivraria livrolivraria = new LivroLivraria();
        livrolivraria.codigo = 11;
        livrolivraria.titulo = "pato";
        livrolivraria.autor = "bia";
        livrolivraria.nrPaginas = 10;
        livrolivraria.edicao = 1;
        livrolivraria.categoria = "romace";
        livrolivraria.preco = 900;
        livrolivraria.novoUsado = "usado";
        livrolivraria.localPrateleira = "fonfon";
        livrolivraria.Vender();




    }
}