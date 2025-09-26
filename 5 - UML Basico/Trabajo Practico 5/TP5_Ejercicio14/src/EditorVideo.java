/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class EditorVideo {
    // Método de dependencia de creación
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Crea un Render
        System.out.println("Render exportado: Formato=" + render.getFormato() + ", Proyecto=" + render.getProyecto().getNombre());
    }
}