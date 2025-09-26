/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Motor {
    private String tipo; // Tipo de motor
    private String numeroSerie; // Número de serie del motor

    // Constructor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo; // Inicializa el tipo
        this.numeroSerie = numeroSerie; // Inicializa el número de serie
    }

    // Getter para tipo
    public String getTipo() {
        return tipo; // Retorna el tipo
    }

    // Getter para número de serie
    public String getNumeroSerie() {
        return numeroSerie; // Retorna el número de serie
    }
}