/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author BAD1110
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("Tu pedido ha cambiado a: " + nuevoEstado);
        }
    }

    public void mostrarResumen() {
        System.out.println("=== RESUMEN DEL PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Estado: " + estado);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
        System.out.printf("TOTAL: $%.2f%n", calcularTotal());
    }

    public List<Producto> getProductos() { return productos; }
}
