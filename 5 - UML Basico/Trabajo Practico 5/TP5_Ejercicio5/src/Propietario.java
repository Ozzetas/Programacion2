/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Propietario {
    private String nombre; // Nombre del propietario
    private String dni; // DNI del propietario
    private Computadora computadora; // Relación bidireccional con Computadora

    // Constructor
    public Propietario(String nombre, String dni, Computadora computadora) {
        this.nombre = nombre; // Inicializa el nombre
        this.dni = dni; // Inicializa el DNI
        this.computadora = computadora; // Asocia la computadora
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para DNI
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para computadora
    public Computadora getComputadora() {
        return computadora; // Retorna la computadora
    }
}