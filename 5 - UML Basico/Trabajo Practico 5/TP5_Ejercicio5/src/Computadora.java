/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Computadora {
    private String marca; // Marca de la computadora
    private String numeroSerie; // Número de serie
    private PlacaMadre placaMadre; // Relación de composición con PlacaMadre
    private Propietario propietario; // Relación bidireccional con Propietario

    // Constructor
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, String nombreProp, String dni) {
        this.marca = marca; // Inicializa la marca
        this.numeroSerie = numeroSerie; // Inicializa el número de serie
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // Crea la placa madre (composición)
        this.propietario = new Propietario(nombreProp, dni, this); // Crea el propietario (asociación)
    }

    // Getter para marca
    public String getMarca() {
        return marca; // Retorna la marca
    }

    // Getter para número de serie
    public String getNumeroSerie() {
        return numeroSerie; // Retorna el número de serie
    }

    // Getter para placa madre
    public PlacaMadre getPlacaMadre() {
        return placaMadre; // Retorna la placa madre
    }

    // Getter para propietario
    public Propietario getPropietario() {
        return propietario; // Retorna el propietario
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Computadora: Marca=" + marca + ", Número Serie=" + numeroSerie);
        System.out.println("Placa Madre: Modelo=" + placaMadre.getModelo() + ", Chipset=" + placaMadre.getChipset());
        System.out.println("Propietario: Nombre=" + propietario.getNombre() + ", DNI=" + propietario.getDni());
    }
}