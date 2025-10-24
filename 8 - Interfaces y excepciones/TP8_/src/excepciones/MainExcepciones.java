/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author BAD1110
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainExcepciones {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== EJERCICIOS DE EXCEPCIONES ===\n");

        divisionSegura();
        System.out.println();

        conversionCadenaANumero();
        System.out.println();

        lecturaArchivo();
        System.out.println();

        validarEdad();
        System.out.println();

        lecturaConTryWithResources();
    }

    // 1. División segura
    private static void divisionSegura() {
        System.out.println("1. DIVISIÓN SEGURA");
        System.out.print("Ingrese numerador: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese denominador: ");
        int b = scanner.nextInt();

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    // 2. Conversión de cadena
    private static void conversionCadenaANumero() {
        System.out.println("\n2. CONVERSIÓN DE CADENA A NÚMERO");
        System.out.print("Ingrese un número entero: ");
        String input = scanner.next();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + input + "' no es un número válido.");
        }
    }

    // 3. Lectura de archivo
    private static void lecturaArchivo() {
        System.out.println("\n3. LECTURA DE ARCHIVO");
        System.out.print("Ingrese nombre del archivo: ");
        String archivo = scanner.next();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo '" + archivo + "' no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // 4. Excepción personalizada
    private static void validarEdad() {
        System.out.println("\n4. VALIDACIÓN DE EDAD");
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad " + edad + " no es válida. Debe estar entre 0 y 120.");
            }
            System.out.println("Edad válida: " + edad + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 5. try-with-resources
    private static void lecturaConTryWithResources() {
        System.out.println("\n5. TRY-WITH-RESOURCES");
        System.out.print("Ingrese nombre del archivo: ");
        String archivo = scanner.next();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            System.out.println("Lectura finalizada (recurso cerrado automáticamente).");
        }
    }
}
