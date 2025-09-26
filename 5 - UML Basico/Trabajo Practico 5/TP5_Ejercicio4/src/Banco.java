/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Banco {
    private String nombre; // Nombre del banco
    private String cuit; // CUIT del banco

    // Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre; // Inicializa el nombre
        this.cuit = cuit; // Inicializa el CUIT
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para CUIT
    public String getCuit() {
        return cuit; // Retorna el CUIT
    }
}
