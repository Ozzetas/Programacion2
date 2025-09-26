/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Reserva {
    private String fecha; // Fecha de la reserva
    private String hora; // Hora de la reserva
    private Cliente cliente; // Relación de asociación con Cliente
    private Mesa mesa; // Relación de agregación con Mesa

    // Constructor
    public Reserva(String fecha, String hora, String nombreCliente, String telefono, int numeroMesa, int capacidad) {
        this.fecha = fecha; // Inicializa la fecha
        this.hora = hora; // Inicializa la hora
        this.cliente = new Cliente(nombreCliente, telefono); // Crea el cliente (asociación)
        this.mesa = new Mesa(numeroMesa, capacidad); // Crea la mesa (agregación)
    }

    // Getter para fecha
    public String getFecha() {
        return fecha; // Retorna la fecha
    }

    // Getter para hora
    public String getHora() {
        return hora; // Retorna la hora
    }

    // Getter para cliente
    public Cliente getCliente() {
        return cliente; // Retorna el cliente
    }

    // Getter para mesa
    public Mesa getMesa() {
        return mesa; // Retorna la mesa
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Reserva: Fecha=" + fecha + ", Hora=" + hora);
        System.out.println("Cliente: Nombre=" + cliente.getNombre() + ", Teléfono=" + cliente.getTelefono());
        System.out.println("Mesa: Número=" + mesa.getNumero() + ", Capacidad=" + mesa.getCapacidad());
    }
}