public class Livro{
    private String titulo;
    private int codigo;
    private String autor;
    private int nrPaginas;
    private int edicao;
    private String editora;


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