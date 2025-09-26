/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Proyecto {
    private String nombre; // Nombre del proyecto
    private int duracionMin; // Duración en minutos

    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre; // Inicializa el nombre
        this.duracionMin = duracionMin; // Inicializa la duración
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para duración
    public int getDuracionMin() {
        return duracionMin; // Retorna la duración
    }
}