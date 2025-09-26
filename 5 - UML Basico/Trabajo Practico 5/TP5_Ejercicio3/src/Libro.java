/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Libro {
    private String titulo; // Título del libro
    private String isbn; // ISBN del libro
    private Autor autor; // Relación de asociación con Autor
    private Editorial editorial; // Relación de agregación con Editorial

    // Constructor
    public Libro(String titulo, String isbn, String nombreAutor, String nacionalidad, String nombreEditorial, String direccion) {
        this.titulo = titulo; // Inicializa el título
        this.isbn = isbn; // Inicializa el ISBN
        this.autor = new Autor(nombreAutor, nacionalidad); // Crea el autor (asociación)
        this.editorial = new Editorial(nombreEditorial, direccion); // Crea la editorial (agregación)
    }

    // Getter para título
    public String getTitulo() {
        return titulo; // Retorna el título
    }

    // Getter para ISBN
    public String getIsbn() {
        return isbn; // Retorna el ISBN
    }

    // Getter para autor
    public Autor getAutor() {
        return autor; // Retorna el autor
    }

    // Getter para editorial
    public Editorial getEditorial() {
        return editorial; // Retorna la editorial
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Libro: Título=" + titulo + ", ISBN=" + isbn);
        System.out.println("Autor: Nombre=" + autor.getNombre() + ", Nacionalidad=" + autor.getNacionalidad());
        System.out.println("Editorial: Nombre=" + editorial.getNombre() + ", Dirección=" + editorial.getDireccion());
    }
}