/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Pasaporte {
    private String numero; // Número único del pasaporte
    private String fechaEmision; // Fecha de emisión del pasaporte
    private Foto foto; // Relación de composición con Foto
    private Titular titular; // Relación de asociación bidireccional con Titular

    // Constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, String nombre, String dni) {
        this.numero = numero; // Inicializa el número
        this.fechaEmision = fechaEmision; // Inicializa la fecha de emisión
        this.foto = new Foto(imagen, formato, this); // Crea la Foto (composición)
        this.titular = new Titular(nombre, dni, this); // Crea el Titular (asociación)
    }

    // Getter para número
    public String getNumero() {
        return numero; // Retorna el número
    }

    // Getter para fecha de emisión
    public String getFechaEmision() {
        return fechaEmision; // Retorna la fecha
    }

    // Getter para foto
    public Foto getFoto() {
        return foto; // Retorna la foto
    }

    // Getter para titular
    public Titular getTitular() {
        return titular; // Retorna el titular
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Pasaporte: Número=" + numero + ", Fecha Emisión=" + fechaEmision);
        System.out.println("Foto: Imagen=" + foto.getImagen() + ", Formato=" + foto.getFormato());
        System.out.println("Titular: Nombre=" + titular.getNombre() + ", DNI=" + titular.getDni());
    }
}
