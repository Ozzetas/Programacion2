/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author BAD1110
 */
public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("María González", "maria@email.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Laptop", 120000));
        pedido.agregarProducto(new Producto("Mouse", 2500));
        pedido.agregarProducto(new Producto("Teclado", 5000));

        pedido.mostrarResumen();
        System.out.println();

        // Procesar pago con diferentes métodos
        PagoConDescuento tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pago paypal = new PayPal("maria@paypal.com");

        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(pedido.calcularTotal() * 0.9);

        System.out.println();
        pedido.cambiarEstado("Enviado");
    }
}
