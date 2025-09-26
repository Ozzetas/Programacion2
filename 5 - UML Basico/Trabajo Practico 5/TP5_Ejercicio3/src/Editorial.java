/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Editorial {
    private String nombre; // Nombre de la editorial
    private String direccion; // Dirección de la editorial

    // Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre; // Inicializa el nombre
        this.direccion = direccion; // Inicializa la dirección
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para dirección
    public String getDireccion() {
        return direccion; // Retorna la dirección
    }
}
