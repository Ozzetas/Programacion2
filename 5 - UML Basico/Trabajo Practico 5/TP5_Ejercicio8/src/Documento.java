/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Documento {
    private String titulo; // Título del documento
    private String contenido; // Contenido del documento
    private FirmaDigital firmaDigital; // Relación de composición con FirmaDigital

    // Constructor
    public Documento(String titulo, String contenido, String codigoHash, String fecha, String nombreUsuario, String email) {
        this.titulo = titulo; // Inicializa el título
        this.contenido = contenido; // Inicializa el contenido
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, nombreUsuario, email); // Crea la firma (composición)
    }

    // Getter para título
    public String getTitulo() {
        return titulo; // Retorna el título
    }

    // Getter para contenido
    public String getContenido() {
        return contenido; // Retorna el contenido
    }

    // Getter para firma digital
    public FirmaDigital getFirmaDigital() {
        return firmaDigital; // Retorna la firma digital
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Documento: Título=" + titulo + ", Contenido=" + contenido);
        System.out.println("Firma Digital: Código Hash=" + firmaDigital.getCodigoHash() + ", Fecha=" + firmaDigital.getFecha());
        System.out.println("Usuario: Nombre=" + firmaDigital.getUsuario().getNombre() + ", Email=" + firmaDigital.getUsuario().getEmail());
    }
}