public class livros {
    private String titulo;
    private String autor;
    private int ano;

    public livros(String titulo, String autor, int ano, String autor1, int ano1) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.autor = autor1;
        this.ano = ano1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}


