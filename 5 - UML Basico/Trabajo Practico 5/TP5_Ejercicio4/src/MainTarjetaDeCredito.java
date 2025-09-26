/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainTarjetaDeCredito {
    public static void main(String[] args) {
        // Crear una tarjeta con cliente y banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "2027-12", "Laura Martínez", "98765432", "Banco Nación", "30-12345678-9");
        // Mostrar información
        tarjeta.mostrarInfo();
    }
}
