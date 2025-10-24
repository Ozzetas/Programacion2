/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.printf("Autor: %s (%s) - Nacionalidad: %s%n", nombre, id, nacionalidad);
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}
