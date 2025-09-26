/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainCuentaBancaria {
    public static void main(String[] args) {
        // Crear una cuenta bancaria con clave de seguridad y titular
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 10000.0, "SEC789", "2025-09-25", "Lucía Fernández", "34567890");
        // Mostrar información
        cuenta.mostrarInfo();
    }
}