/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio11;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio11 {

    // Variable global
    private static final double DESCUENTO_FIJO = 0.10; // 10%

    // Método para calcular el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_FIJO; // Variable local
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        // Llamar al método para calcular y mostrar el descuento
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
    
}
