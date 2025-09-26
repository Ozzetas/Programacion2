/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainReserva {
    public static void main(String[] args) {
        // Crear una reserva con cliente y mesa
        Reserva reserva = new Reserva("2025-09-25", "20:00", "Sofía Ramírez", "123456789", 5, 4);
        // Mostrar información
        reserva.mostrarInfo();
    }
}