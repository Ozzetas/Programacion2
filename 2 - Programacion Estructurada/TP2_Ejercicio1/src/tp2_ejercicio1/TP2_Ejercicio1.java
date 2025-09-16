/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio1;
import java.util.Scanner;
/**
 *
 * @author BAD1110
 */
public class TP2_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el año al usuario
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        // Verificar si es bisiesto
        boolean esBisiesto = false;
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        }
        
        // Mostrar resultado
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        scanner.close();
    }
    
}
