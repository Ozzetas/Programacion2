/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio13;

/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio13 {

    // Función recursiva para mostrar los precios
    public static void mostrarPrecios(double[] precios, int indice) {
        // Caso base: si el índice es igual o mayor a la longitud del array, detener
        if (indice >= precios.length) {
            return;
        }
        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);
        // Llamada recursiva con el siguiente índice
        mostrarPrecios(precios, indice + 1);
    }
    
    public static void main(String[] args) {
        // Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        
        // Modificar el precio en el índice 2
        precios[2] = 129.99;
        
        // Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }
    
}
