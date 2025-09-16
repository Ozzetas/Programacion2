/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio12;

/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // Modificar el precio en el índice 2 (tercer elemento)
        precios[2] = 129.99;
        
        // Mostrar precios modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
}
