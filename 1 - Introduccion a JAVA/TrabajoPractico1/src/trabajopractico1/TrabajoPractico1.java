/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;
import java.util.Scanner;

/**
 *
 * @author BAD1110
 */
public class TrabajoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad2 = sc.nextInt();
        System.out.println("hola " + nombre2);
        System.out.println("usted tiene " + edad2);
        System.out.println("Hola, Java!");
        
        String nombre = "Gabriel";
        int edad = 18;
        double altura = 22.3;
        boolean estudiante = true;
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        
        System.out.println("Nombre: Juan Perez\nEdad: 30 anios\nDireccion: \"Calle Falsa 123\"");
        
        System.out.println("Ingrese otros dos numeros enteros: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        sc.nextLine();
        int division2 = num3 / num4;
        double division3 = num3 / num4;
        System.out.println("La division entera es: " + division2);
        System.out.println("La division con decimal es: " + division3);
        
        System.out.println("Ingresa tu nombre4: ");
        String nombre4 = sc.nextLine(); // ERROR
        System.out.println("Hola, " + nombre4);
        
        int a3 = 5;
        int b3 = 2;
        int resultado3 = a3 / b3;
        System.out.println("Resultado: " + resultado3);

        
        
        sc.close();
    }
    
}
