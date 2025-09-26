/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Paciente {
    private String nombre; // Nombre del paciente
    private String obraSocial; // Obra social del paciente

    // Constructor
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre; // Inicializa el nombre
        this.obraSocial = obraSocial; // Inicializa la obra social
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para obra social
    public String getObraSocial() {
        return obraSocial; // Retorna la obra social
    }
}