/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
import java.util.ArrayList;
import java.util.List;

public class MainKata4 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Luna"));
        animales.add(new Vaca("Mimosa"));
        animales.add(new Perro("Max"));
        animales.add(new Gato("Nieve"));

        System.out.println("=== SONIDOS DE ANIMALES ===");
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // Polimorfismo
            System.out.println();
        }
    }
}
