/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainVehiculo {
    public static void main(String[] args) {
        // Crear un vehículo con motor y conductor
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", "Gasolina", "MTR456", "Pedro López", "LIC789");
        // Mostrar información
        vehiculo.mostrarInfo();
    }
}