/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio5;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;
        
        // Ciclo para solicitar números hasta que se ingrese 0
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            // Sumar si el número es par
            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);
        
        // Mostrar la suma total de los números pares
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        scanner.close();
    }
    
}
