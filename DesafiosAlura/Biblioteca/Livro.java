package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;

    public void exibirDetalhes() {
        System.out.println("O titulo é: " + titulo);
        System.out.println("O nome do autor é: " + autor);
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
}
