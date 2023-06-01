package model;

import java.util.ArrayList;

public class Libro {

    // Atributos de la clase
    private String titulo;
    private String autor;
    private String añoPublicacion;

    // Constructor Vacio
    public Libro() {
    }

    // Constructor con parametros
    public Libro(String titulo, String autor, String añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;

    }

    // Metodos Consultores (Getter and Setter)
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

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Libro buscarLibro(ArrayList<Libro> listado, String titulo) {
        // Recorre el listado de los libros
        for (int i = 0; i < listado.size(); i++) {
            // Se crea una libro que sea igual a uno de los que ya se encuentran almacenados dentro de la lista
            Libro libro = listado.get(i);
            // Se pregunta a ese libro si su titulo es igual al que el usuario esta  buscando
            if (libro.getTitulo().equals(titulo)) {
                // Si esa libro tiene el mismo titulo que el usuario esta buscando, mostrarlo
                return libro;
            }

        }
        // Si no es asi, no devolver nada
        return null;
    }

    @Override
    public String toString() {
        return "\nLibro"
                + "\nTitulo: " + titulo
                + "\nAutor: " + autor
                + "\nAño Publicacion: " + añoPublicacion;
    }

}
