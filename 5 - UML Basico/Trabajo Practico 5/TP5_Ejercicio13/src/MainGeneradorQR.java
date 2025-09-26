/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainGeneradorQR {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Ana López", "ana@email.com");
        // Crear un generador QR
        GeneradorQR generador = new GeneradorQR();
        // Generar un código QR (dependencia de creación)
        generador.generar("QR123", usuario);
    }
}