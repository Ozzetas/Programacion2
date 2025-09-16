/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio4;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar precio y categoría
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();
        
        // Validar categoría y calcular descuento
        double porcentajeDescuento = 0.0;
        boolean categoriaValida = true;
        
        switch (categoria) {
            case "A":
                porcentajeDescuento = 0.10; // 10%
                break;
            case "B":
                porcentajeDescuento = 0.15; // 15%
                break;
            case "C":
                porcentajeDescuento = 0.20; // 20%
                break;
            default:
                categoriaValida = false;
                System.out.println("Error: Categoría inválida. Debe ser A, B o C.");
        }
        
        // Calcular y mostrar resultados si la categoría es válida
        if (categoriaValida) {
            double descuento = precio * porcentajeDescuento;
            double precioFinal = precio - descuento;
            
            System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }
        
        scanner.close();
    }
    
}
