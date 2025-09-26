/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class PlacaMadre {
    private String modelo; // Modelo de la placa madre
    private String chipset; // Chipset de la placa madre

    // Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo; // Inicializa el modelo
        this.chipset = chipset; // Inicializa el chipset
    }

    // Getter para modelo
    public String getModelo() {
        return modelo; // Retorna el modelo
    }

    // Getter para chipset
    public String getChipset() {
        return chipset; // Retorna el chipset
    }
}