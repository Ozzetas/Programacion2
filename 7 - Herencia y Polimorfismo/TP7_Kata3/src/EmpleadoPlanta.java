/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int antiguedad;

    public EmpleadoPlanta(String nombre, String id, double sueldoBase, int antiguedad) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * 0.05 * antiguedad);
    }
}
