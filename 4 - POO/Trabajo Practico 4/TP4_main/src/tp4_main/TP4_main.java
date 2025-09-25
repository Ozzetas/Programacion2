/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_main;

/**
 *
 * @author BAD1110
 */
public class TP4_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar el total de empleados inicial (debe ser 0)
        System.out.println("Total de empleados inicial: " + Empleado.mostrarTotalEmpleados());

        // Crear empleados usando el constructor completo
        Empleado emp1 = new Empleado(1, "Ana López", "Desarrolladora", 50000.0);
        Empleado emp2 = new Empleado(2, "Carlos Gómez", "Analista", 60000.0);

        // Crear empleados usando el constructor con valores por defecto
        Empleado emp3 = new Empleado("María Pérez", "Diseñadora");
        Empleado emp4 = new Empleado("Juan Rodríguez", "Gerente");

        // Mostrar información de cada empleado
        System.out.println("\nInformación de los empleados:");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

        // Aplicar métodos actualizarSalario en distintos empleados
        emp1.actualizarSalario(10.0f); // Aumentar salario de emp1 en un 10%
        emp2.actualizarSalario(5000.0); // Aumentar salario de emp2 en 5000
        emp3.actualizarSalario(15.0f); // Aumentar salario de emp3 en un 15%
        emp4.actualizarSalario(10000.0); // Aumentar salario de emp4 en 10000

        // Mostrar información actualizada de cada empleado
        System.out.println("\nInformación después de actualizar salarios:");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

        // Mostrar el total de empleados creados
        System.out.println("\nTotal de empleados final: " + Empleado.mostrarTotalEmpleados());
    }
}

// Clase Empleado que implementa los requerimientos del trabajo práctico
class Empleado {
    // Atributos privados (encapsulamiento)
    private int id; // Identificador único del empleado
    private String nombre; // Nombre completo del empleado
    private String puesto; // Puesto que desempeña
    private double salario; // Salario actual del empleado
    private static int totalEmpleados = 0; // Contador estático de empleados creados
    private static int proximoId = 1; // Para asignar IDs automáticos

    // Constructor sobrecargado con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id; // Usamos this para diferenciar el parámetro del atributo
        this.nombre = nombre; // Asigna el nombre
        this.puesto = puesto; // Asigna el puesto
        this.salario = salario; // Asigna el salario
        totalEmpleados++; // Incrementa el contador de empleados
        proximoId = Math.max(proximoId, id + 1); // Actualiza el próximo ID disponible
    }

    // Constructor sobrecargado con nombre y puesto (salario por defecto e ID automático)
    public Empleado(String nombre, String puesto) {
        this.id = proximoId++; // Asigna un ID automático y lo incrementa
        this.nombre = nombre; // Asigna el nombre
        this.puesto = puesto; // Asigna el puesto
        this.salario = 30000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador de empleados
    }

    // Getter para id
    public int getId() {
        return id; // Retorna el ID
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Setter para nombre con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) { // Valida que no sea nulo o vacío
            this.nombre = nombre; // Actualiza el nombre
        } else {
            System.out.println("Nombre inválido para empleado ID " + id);
        }
    }

    // Getter para puesto
    public String getPuesto() {
        return puesto; // Retorna el puesto
    }

    // Setter para puesto con validación
    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) { // Valida que no sea nulo o vacío
            this.puesto = puesto; // Actualiza el puesto
        } else {
            System.out.println("Puesto inválido para empleado ID " + id);
        }
    }

    // Getter para salario
    public double getSalario() {
        return salario; // Retorna el salario
    }

    // Setter para salario con validación
    public void setSalario(double salario) {
        if (salario >= 0) { // Valida que el salario no sea negativo
            this.salario = salario; // Actualiza el salario
        } else {
            System.out.println("Salario inválido para empleado ID " + id);
        }
    }

    // Método sobrecargado para aumentar salario por porcentaje
    public void actualizarSalario(float porcentaje) { // Cambiado a float para diferenciar
        if (porcentaje >= 0) { // Valida que el porcentaje no sea negativo
            double aumento = salario * (porcentaje / 100); // Calcula el aumento
            salario += aumento; // Aplica el aumento
            System.out.println("Salario de " + nombre + " aumentado en " + porcentaje + "%");
        } else {
            System.out.println("Porcentaje de aumento inválido para empleado ID " + id);
        }
    }

    // Método sobrecargado para aumentar salario por cantidad fija
    public void actualizarSalario(double cantidadFija) {
        if (cantidadFija >= 0) { // Valida que la cantidad no sea negativa
            salario += cantidadFija; // Aplica el aumento
            System.out.println("Salario de " + nombre + " aumentado en " + cantidadFija);
        } else {
            System.out.println("Cantidad fija de aumento inválida para empleado ID " + id);
        }
    }

    // Método toString para mostrar información del empleado
    @Override
    public String toString() {
        return "Empleado ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }

    // Método estático para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados; // Retorna el contador de empleados
    }
}

