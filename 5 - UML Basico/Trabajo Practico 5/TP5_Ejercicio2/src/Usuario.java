/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Usuario {
    private String nombre; // Nombre del usuario
    private String dni; // DNI del usuario
    private Celular celular; // Relación bidireccional con Celular

    // Constructor
    public Usuario(String nombre, String dni, Celular celular) {
        this.nombre = nombre; // Inicializa el nombre
        this.dni = dni; // Inicializa el DNI
        this.celular = celular; // Asocia el celular
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para DNI
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para celular
    public Celular getCelular() {
        return celular; // Retorna el celular
    }
}