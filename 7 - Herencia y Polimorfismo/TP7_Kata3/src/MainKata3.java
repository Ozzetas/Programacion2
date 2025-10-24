/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
import java.util.ArrayList;
import java.util.List;

public class MainKata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Pérez", "E001", 50000, 5));
        empleados.add(new EmpleadoTemporal("Ana Gómez", "E002", 300, 120));
        empleados.add(new EmpleadoPlanta("Luis Martínez", "E003", 45000, 2));
        empleados.add(new EmpleadoTemporal("María López", "E004", 250, 160));

        System.out.println("=== NÓMINA DE EMPLEADOS ===");
        for (Empleado e : empleados) {
            e.mostrarInfo(); // Polimorfismo
            if (e instanceof EmpleadoPlanta) {
                System.out.println("   → Tipo: Planta Permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("   → Tipo: Temporal");
            }
        }
    }
}
