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
    private String telefono; // Teléfono del cliente

    // Constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre; // Inicializa el nombre
        this.telefono = telefono; // Inicializa el teléfono
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para teléfono
    public String getTelefono() {
        return telefono; // Retorna el teléfono
    }
}