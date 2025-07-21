public class Livro{
    private String titulo;
    private int codigo;
    private String autor;
    private int nrPaginas;
    private int edicao;
    private String editora;

    // Método Construtor
    Livro() {
    this.codigo = 0;
    this.titulo = "Sem titulo";
    this.autor = "Sem autor";
    this.editora = "Sem editora";
    this.nrPaginas = 0;
    this.edicao = 0;
}

    Livro(int codigo, String titulo) {
    this.codigo = codigo;
    this.titulo = titulo;
}

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int valor){
        codigo = valor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNrPaginas(){
        return this.nrPaginas;
    }

    public void setNrPaginas(int nrPaginas){
        this.nrPaginas = nrPaginas;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public void Ler(){
        System.out.println("Estou lendo");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando");
    }

    public void Localizar(){
        System.out.println("Estou localizando");
    }

    
}