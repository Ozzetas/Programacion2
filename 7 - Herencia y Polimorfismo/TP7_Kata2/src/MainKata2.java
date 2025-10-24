/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(3),
            new Rectangulo(10, 2)
        };

        System.out.println("=== ÁREAS DE FIGURAS ===");
        for (Figura f : figuras) {
            f.mostrarArea(); // Polimorfismo
        }
    }
}
