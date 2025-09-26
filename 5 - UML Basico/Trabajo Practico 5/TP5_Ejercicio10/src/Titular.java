/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Titular {
    private String nombre; // Nombre del titular
    private String dni; // DNI del titular
    private CuentaBancaria cuenta; // Relación bidireccional con CuentaBancaria

    // Constructor
    public Titular(String nombre, String dni, CuentaBancaria cuenta) {
        this.nombre = nombre; // Inicializa el nombre
        this.dni = dni; // Inicializa el DNI
        this.cuenta = cuenta; // Asocia la cuenta
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para DNI
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para cuenta
    public CuentaBancaria getCuenta() {
        return cuenta; // Retorna la cuenta
    }
}