/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class GeneradorQR {
    // Método de dependencia de creación
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // Crea un CódigoQR
        System.out.println("QR generado: Valor=" + codigo.getValor() + ", Usuario=" + codigo.getUsuario().getNombre());
    }
}