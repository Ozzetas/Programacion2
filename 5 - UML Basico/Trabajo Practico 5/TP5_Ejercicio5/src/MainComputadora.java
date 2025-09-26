/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainComputadora {
    public static void main(String[] args) {
        // Crear una computadora con placa madre y propietario
        Computadora computadora = new Computadora("Dell", "XYZ123", "ASUS ROG", "Z490", "Carlos Sánchez", "23456789");
        // Mostrar información
        computadora.mostrarInfo();
    }
}