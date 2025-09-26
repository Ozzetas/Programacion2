/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Bateria {
    private String modelo; // Modelo de la batería
    private int capacidad; // Capacidad en mAh

    // Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo; // Inicializa el modelo
        this.capacidad = capacidad; // Inicializa la capacidad
    }

    // Getter para modelo
    public String getModelo() {
        return modelo; // Retorna el modelo
    }

    // Getter para capacidad
    public int getCapacidad() {
        return capacidad; // Retorna la capacidad
    }
}