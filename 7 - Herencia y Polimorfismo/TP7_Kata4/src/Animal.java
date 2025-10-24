/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("Este animal hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.printf("Animal: %s (%s)%n", nombre, especie);
    }
}
