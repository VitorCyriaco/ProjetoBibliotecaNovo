package model;

public class LivroCad {

    private String titulo, autor, isbn, publi;

    public LivroCad(String titulo, String autor, String isbn, String publi) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.publi = publi;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPubli() {
        return publi;
    }

    public void setPubli(String publi) {
        this.publi = publi;
    }

}
