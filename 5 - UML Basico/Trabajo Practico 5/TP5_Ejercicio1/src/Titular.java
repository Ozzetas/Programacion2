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
    private Pasaporte pasaporte; // Relación bidireccional con Pasaporte

    // Constructor
    public Titular(String nombre, String dni, Pasaporte pasaporte) {
        this.nombre = nombre; // Inicializa el nombre
        this.dni = dni; // Inicializa el DNI
        this.pasaporte = pasaporte; // Asocia el pasaporte
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para DNI
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para pasaporte
    public Pasaporte getPasaporte() {
        return pasaporte; // Retorna el pasaporte
    }
}
