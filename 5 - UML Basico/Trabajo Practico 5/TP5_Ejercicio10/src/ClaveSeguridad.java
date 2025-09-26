/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class ClaveSeguridad {
    private String codigo; // Código de la clave
    private String ultimaModificacion; // Fecha de última modificación

    // Constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo; // Inicializa el código
        this.ultimaModificacion = ultimaModificacion; // Inicializa la fecha
    }

    // Getter para código
    public String getCodigo() {
        return codigo; // Retorna el código
    }

    // Getter para última modificación
    public String getUltimaModificacion() {
        return ultimaModificacion; // Retorna la fecha
    }
}