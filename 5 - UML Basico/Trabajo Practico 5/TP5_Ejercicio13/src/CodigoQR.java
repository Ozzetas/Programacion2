/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class CodigoQR {
    private String valor; // Valor del código QR
    private Usuario usuario; // Relación de asociación con Usuario

    // Constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor; // Inicializa el valor
        this.usuario = usuario; // Asocia el usuario
    }

    // Getter para valor
    public String getValor() {
        return valor; // Retorna el valor
    }

    // Getter para usuario
    public Usuario getUsuario() {
        return usuario; // Retorna el usuario
    }
}