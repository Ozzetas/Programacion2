/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Render {
    private String formato; // Formato del render
    private Proyecto proyecto; // Relación de asociación con Proyecto

    // Constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato; // Inicializa el formato
        this.proyecto = proyecto; // Asocia el proyecto
    }

    // Getter para formato
    public String getFormato() {
        return formato; // Retorna el formato
    }

    // Getter para proyecto
    public Proyecto getProyecto() {
        return proyecto; // Retorna el proyecto
    }
}