/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class EmpleadoTemporal extends Empleado {
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, double valorHora, int horasTrabajadas) {
        super(nombre, id);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
