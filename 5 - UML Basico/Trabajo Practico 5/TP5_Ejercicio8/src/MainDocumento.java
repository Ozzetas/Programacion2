/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainDocumento {
    public static void main(String[] args) {
        // Crear un documento con firma digital y usuario
        Documento documento = new Documento("Contrato", "Texto legal", "HASH123", "2025-09-25", "María López", "maria@email.com");
        // Mostrar información
        documento.mostrarInfo();
    }
}