/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Cliente {
    private String nombre; // Nombre del cliente
    private String dni; // DNI del cliente
    private TarjetaDeCredito tarjeta; // Relación bidireccional con TarjetaDeCredito

    // Constructor
    public Cliente(String nombre, String dni, TarjetaDeCredito tarjeta) {
        this.nombre = nombre; // Inicializa el nombre
        this.dni = dni; // Inicializa el DNI
        this.tarjeta = tarjeta; // Asocia la tarjeta
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para DNI
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para tarjeta
    public TarjetaDeCredito getTarjeta() {
        return tarjeta; // Retorna la tarjeta
    }
}