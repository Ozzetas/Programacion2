/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author BAD1110
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago de $%.2f con Tarjeta ****%s%n", monto, numero.substring(numero.length() - 4));
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.printf("Descuento del %.0f%% aplicado con Tarjeta%n", porcentaje);
    }
}
