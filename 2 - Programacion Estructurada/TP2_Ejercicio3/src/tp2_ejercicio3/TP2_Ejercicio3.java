/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio3;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        // Determinar la etapa de vida
        String etapa;
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapa = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        
        // Mostrar el resultado
        System.out.println("Eres un " + etapa + ".");
        
        scanner.close();
    }
    
}
