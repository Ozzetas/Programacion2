/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio9;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio9 {
    
    // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0; // $10 por kg
        } else {
            return -1; // Valor inválido para indicar error
        }
    }

    // Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        scanner.nextLine(); // Limpiar buffer
        String zona = scanner.nextLine();
        
        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // Validar zona y mostrar resultados
        if (costoEnvio == -1) {
            System.out.println("Error: Zona de envío inválida. Debe ser Nacional o Internacional.");
        } else {
            double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + totalCompra);
        }
        
        scanner.close();
    }
    
}
