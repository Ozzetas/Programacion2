/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Profesional {
    private String nombre; // Nombre del profesional
    private String especialidad; // Especialidad del profesional

    // Constructor
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre; // Inicializa el nombre
        this.especialidad = especialidad; // Inicializa la especialidad
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para especialidad
    public String getEspecialidad() {
        return especialidad; // Retorna la especialidad
    }
}