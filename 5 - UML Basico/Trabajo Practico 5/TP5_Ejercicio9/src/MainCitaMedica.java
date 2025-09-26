/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainCitaMedica {
    public static void main(String[] args) {
        // Crear una cita médica con paciente y profesional
        CitaMedica cita = new CitaMedica("2025-09-26", "10:00", "Juan García", "OSDE", "Dr. Fernández", "Cardiología");
        // Mostrar información
        cita.mostrarInfo();
    }
}