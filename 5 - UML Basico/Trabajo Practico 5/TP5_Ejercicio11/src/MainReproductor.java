/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainReproductor {
    public static void main(String[] args) {
        // Crear una canción con artista
        Cancion cancion = new Cancion("Bohemian Rhapsody", "Queen", "Rock");
        // Crear un reproductor
        Reproductor reproductor = new Reproductor();
        // Reproducir la canción (dependencia de uso)
        reproductor.reproducir(cancion);
    }
}