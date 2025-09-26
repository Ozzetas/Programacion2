/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class FirmaDigital {
    private String codigoHash; // Código hash de la firma
    private String fecha; // Fecha de la firma
    private Usuario usuario; // Relación de agregación con Usuario

    // Constructor
    public FirmaDigital(String codigoHash, String fecha, String nombreUsuario, String email) {
        this.codigoHash = codigoHash; // Inicializa el código hash
        this.fecha = fecha; // Inicializa la fecha
        this.usuario = new Usuario(nombreUsuario, email); // Crea el usuario (agregación)
    }

    // Getter para código hash
    public String getCodigoHash() {
        return codigoHash; // Retorna el código hash
    }

    // Getter para fecha
    public String getFecha() {
        return fecha; // Retorna la fecha
    }

    // Getter para usuario
    public Usuario getUsuario() {
        return usuario; // Retorna el usuario
    }
}