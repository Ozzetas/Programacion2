/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainImpuesto {
    public static void main(String[] args) {
        // Crear un impuesto con contribuyente
        Impuesto impuesto = new Impuesto(1000.0, "Juan Pérez", "20-12345678-9");
        // Crear una calculadora
        Calculadora calculadora = new Calculadora();
        // Calcular el impuesto (dependencia de uso)
        calculadora.calcular(impuesto);
    }
}