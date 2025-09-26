/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Autor {
    private String nombre; // Nombre del autor
    private String nacionalidad; // Nacionalidad del autor

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre; // Inicializa el nombre
        this.nacionalidad = nacionalidad; // Inicializa la nacionalidad
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para nacionalidad
    public String getNacionalidad() {
        return nacionalidad; // Retorna la nacionalidad
    }
}