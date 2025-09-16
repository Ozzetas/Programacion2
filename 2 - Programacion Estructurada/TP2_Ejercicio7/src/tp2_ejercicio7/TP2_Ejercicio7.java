/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio7;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        
        // Ciclo para validar la nota
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        // Mostrar mensaje de confirmación
        System.out.println("Nota guardada correctamente.");
        
        scanner.close();
    }
    
}
