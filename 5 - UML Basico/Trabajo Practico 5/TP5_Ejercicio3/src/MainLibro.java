/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainLibro {
    public static void main(String[] args) {
        // Crear un libro con autor y editorial
        Libro libro = new Libro("Cien"
                + " años de soledad", "978-3-16-148410-0", "Gabriel García Márquez", "Colombiana", "Sudamericana", "Buenos Aires");
        // Mostrar información
        libro.mostrarInfo();
    }
}
