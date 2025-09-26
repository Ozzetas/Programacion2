/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Artista {
    private String nombre; // Nombre del artista
    private String genero; // Género musical

    // Constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre; // Inicializa el nombre
        this.genero = genero; // Inicializa el género
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para género
    public String getGenero() {
        return genero; // Retorna el género
    }
}