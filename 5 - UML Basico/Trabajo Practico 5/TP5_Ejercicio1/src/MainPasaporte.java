/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainPasaporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un pasaporte con foto y titular
        Pasaporte pasaporte = new Pasaporte("A123456", "2025-09-25", "foto123.jpg", "JPG", "Juan Pérez", "12345678");
        // Mostrar información
        pasaporte.mostrarInfo();
    }
    
}
