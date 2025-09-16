/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio8;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio8 {
    
    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble() / 100; // Convertir a decimal
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble() / 100; // Convertir a decimal
        
        // Calcular el precio final llamando al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // Mostrar el resultado
        System.out.println("El precio final del producto es: " + precioFinal);
        
        scanner.close();
    }
    
}
