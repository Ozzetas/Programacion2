/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Mesa {
    private int numero; // Número de la mesa
    private int capacidad; // Capacidad de la mesa

    // Constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero; // Inicializa el número
        this.capacidad = capacidad; // Inicializa la capacidad
    }

    // Getter para número
    public int getNumero() {
        return numero; // Retorna el número
    }

    // Getter para capacidad
    public int getCapacidad() {
        return capacidad; // Retorna la capacidad
    }
}