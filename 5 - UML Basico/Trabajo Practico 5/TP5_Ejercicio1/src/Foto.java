/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Foto {
    private String imagen; // Representación de la imagen (p.ej., nombre de archivo)
    private String formato; // Formato de la imagen (p.ej., JPG)
    private Pasaporte pasaporte; // Referencia al pasaporte (composición)

    // Constructor
    public Foto(String imagen, String formato, Pasaporte pasaporte) {
        this.imagen = imagen; // Inicializa la imagen
        this.formato = formato; // Inicializa el formato
        this.pasaporte = pasaporte; // Asocia al pasaporte
    }

    // Getter para imagen
    public String getImagen() {
        return imagen; // Retorna la imagen
    }

    // Getter para formato
    public String getFormato() {
        return formato; // Retorna el formato
    }
}