/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainEditorVideo {
    public static void main(String[] args) {
        // Crear un proyecto
        Proyecto proyecto = new Proyecto("Video Promocional", 10);
        // Crear un editor de video
        EditorVideo editor = new EditorVideo();
        // Exportar un render (dependencia de creación)
        editor.exportar("MP4", proyecto);
    }
}