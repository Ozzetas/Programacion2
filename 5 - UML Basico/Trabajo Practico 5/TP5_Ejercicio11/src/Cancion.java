/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Cancion {
    private String titulo; // Título de la canción
    private Artista artista; // Relación de asociación con Artista

    // Constructor
    public Cancion(String titulo, String nombreArtista, String genero) {
        this.titulo = titulo; // Inicializa el título
        this.artista = new Artista(nombreArtista, genero); // Crea el artista (asociación)
    }

    // Getter para título
    public String getTitulo() {
        return titulo; // Retorna el título
    }

    // Getter para artista
    public Artista getArtista() {
        return artista; // Retorna el artista
    }
}