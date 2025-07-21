public class LivrosMain {
    public static void main(String[] args) {
        // ===== LIVRO GERAL =====
        Livro livro = new Livro();
        livro.setCodigo(11);
        livro.setTitulo("Livro Mágico de Feitiços");
        livro.setAutor("Daron Nefcy");
        livro.setEditora("Editora Abril");
        livro.setNrPaginas(500);
        livro.setEdicao(2);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        // ===== LIVRO DA BIBLIOTECA =====
        LivroBibli livrobiblioteca = new LivroBibli();
        livrobiblioteca.setCodigo(22);
        livrobiblioteca.setTitulo("Manual do Pato Mágico");
        livrobiblioteca.setAutor("Bea Quack");
        livrobiblioteca.setEditora("Biblioteca dos Sonhos");
        livrobiblioteca.setNrPaginas(150);
        livrobiblioteca.setEdicao(1);
        livrobiblioteca.setCategoria("Fantasia");
        livrobiblioteca.setPrazoDevolver(10);
        livrobiblioteca.setNomeQuemEmprestou("Eu, Bea");
        livrobiblioteca.setLocalPrateleira("Estante B - Prateleira 3");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devolver();

        // ===== LIVRO DA LIVRARIA =====
        LivroLivraria livrolivraria = new LivroLivraria();
        livrolivraria.setCodigo(33);
        livrolivraria.setTitulo("Romance Intergaláctico");
        livrolivraria.setAutor("Lua Coração");
        livrolivraria.setEditora("Livros do Espaço");
        livrolivraria.setNrPaginas(320);
        livrolivraria.setEdicao(1);
        livrolivraria.setCategoria("Romance");
        livrolivraria.setPreco(89);
        livrolivraria.setNovoUsado("Usado");
        livrolivraria.setLocalPrateleira("Estante A - Prateleira 1");
        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();

        // ===== IMPRESSÃO DAS INFORMAÇÕES =====
        System.out.println("\n=== INFORMAÇÕES DO LIVRO GERAL ===");
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Número de páginas: " + livro.getNrPaginas());
        System.out.println("Edição: " + livro.getEdicao());

        System.out.println("\n=== INFORMAÇÕES DO LIVRO DA BIBLIOTECA ===");
        System.out.println("Código: " + livrobiblioteca.getCodigo());
        System.out.println("Título: " + livrobiblioteca.getTitulo());
        System.out.println("Autor: " + livrobiblioteca.getAutor());
        System.out.println("Editora: " + livrobiblioteca.getEditora());
        System.out.println("Número de páginas: " + livrobiblioteca.getNrPaginas());
        System.out.println("Edição: " + livrobiblioteca.getEdicao());
        System.out.println("Categoria: " + livrobiblioteca.getCategoria());
        System.out.println("Prazo para devolver: " + livrobiblioteca.getPrazoDevolver() + " dias");
        System.out.println("Nome de quem emprestou: " + livrobiblioteca.getNomeQuemEmprestou());
        System.out.println("Local na prateleira: " + livrobiblioteca.getLocalPrateleira());

        System.out.println("\n=== INFORMAÇÕES DO LIVRO DA LIVRARIA ===");
        System.out.println("Código: " + livrolivraria.getCodigo());
        System.out.println("Título: " + livrolivraria.getTitulo());
        System.out.println("Autor: " + livrolivraria.getAutor());
        System.out.println("Editora: " + livrolivraria.getEditora());
        System.out.println("Número de páginas: " + livrolivraria.getNrPaginas());
        System.out.println("Edição: " + livrolivraria.getEdicao());
        System.out.println("Categoria: " + livrolivraria.getCategoria());
        System.out.println("Preço: R$" + livrolivraria.getPreco());
        System.out.println("Estado (novo/usado): " + livrolivraria.getNovoUsado());
        System.out.println("Local na prateleira: " + livrolivraria.getLocalPrateleira());

        Livro novoLivro = new Livro();
        System.out.println("novo livro: "+novoLivro.getTitulo());

        Livro livro2 = new Livro(90, "blablabla");
        System.out.println("Livro 2: "+livro2.getTitulo());

        LivroBibli livrobiblioteca2 = new LivroBibli(8, "cactus", 7); 
        System.out.println("Livro bilbioteca 2: "+livrobiblioteca2.getTitulo());
        System.out.println("Livro bilbioteca 2 prazo: "+livrobiblioteca2.getPrazoDevolver());

        LivroLivraria livrolivraria2 = new LivroLivraria(8, "cactus", 78); 
        System.out.println("Livro livraria 2: "+livrolivraria2.getTitulo());
        System.out.println("Livro livraria 2 preco: "+livrolivraria2.getPreco());


    }
}
