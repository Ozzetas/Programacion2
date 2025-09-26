/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Conductor {
    private String nombre; // Nombre del conductor
    private String licencia; // Licencia del conductor
    private Vehiculo vehiculo; // Relación bidireccional con Vehiculo

    // Constructor
    public Conductor(String nombre, String licencia, Vehiculo vehiculo) {
        this.nombre = nombre; // Inicializa el nombre
        this.licencia = licencia; // Inicializa la licencia
        this.vehiculo = vehiculo; // Asocia el vehículo
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para licencia
    public String getLicencia() {
        return licencia; // Retorna la licencia
    }

    // Getter para vehículo
    public Vehiculo getVehiculo() {
        return vehiculo; // Retorna el vehículo
    }
}
