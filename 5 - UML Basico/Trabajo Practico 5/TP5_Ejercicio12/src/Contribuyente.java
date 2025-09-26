/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Contribuyente {
    private String nombre; // Nombre del contribuyente
    private String cuil; // CUIL del contribuyente

    // Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre; // Inicializa el nombre
        this.cuil = cuil; // Inicializa el CUIL
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para CUIL
    public String getCuil() {
        return cuil; // Retorna el CUIL
    }
}