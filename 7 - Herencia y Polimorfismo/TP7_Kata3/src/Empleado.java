/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public abstract class Empleado {
    protected String nombre;
    protected String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.printf("Empleado: %s (%s) - Sueldo: $%.2f%n", nombre, id, calcularSueldo());
    }
}
