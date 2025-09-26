/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Usuario {
    private String nombre; // Nombre del usuario
    private String email; // Email del usuario

    // Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre; // Inicializa el nombre
        this.email = email; // Inicializa el email
    }

    // Getter para nombre
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para email
    public String getEmail() {
        return email; // Retorna el email
    }
}