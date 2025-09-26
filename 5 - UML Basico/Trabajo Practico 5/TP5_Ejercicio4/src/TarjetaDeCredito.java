/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class TarjetaDeCredito {
    private String numero; // Número de la tarjeta
    private String fechaVencimiento; // Fecha de vencimiento
    private Cliente cliente; // Relación bidireccional con Cliente
    private Banco banco; // Relación de agregación con Banco

    // Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento, String nombreCliente, String dni, String nombreBanco, String cuit) {
        this.numero = numero; // Inicializa el número
        this.fechaVencimiento = fechaVencimiento; // Inicializa la fecha
        this.banco = new Banco(nombreBanco, cuit); // Crea el banco (agregación)
        this.cliente = new Cliente(nombreCliente, dni, this); // Crea el cliente (asociación)
    }

    // Getter para número
    public String getNumero() {
        return numero; // Retorna el número
    }

    // Getter para fecha de vencimiento
    public String getFechaVencimiento() {
        return fechaVencimiento; // Retorna la fecha
    }

    // Getter para cliente
    public Cliente getCliente() {
        return cliente; // Retorna el cliente
    }

    // Getter para banco
    public Banco getBanco() {
        return banco; // Retorna el banco
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Tarjeta: Número=" + numero + ", Fecha Vencimiento=" + fechaVencimiento);
        System.out.println("Cliente: Nombre=" + cliente.getNombre() + ", DNI=" + cliente.getDni());
        System.out.println("Banco: Nombre=" + banco.getNombre() + ", CUIT=" + banco.getCuit());
    }
}
