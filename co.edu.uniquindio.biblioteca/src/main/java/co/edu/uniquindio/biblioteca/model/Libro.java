package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int aniopublicacion;
    private String editorial;

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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAniopublicacion() {
        return aniopublicacion;
    }
    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    private int numeropaginas;


}
