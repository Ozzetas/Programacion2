/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class CuentaBancaria {
    private String cbu; // CBU de la cuenta
    private double saldo; // Saldo de la cuenta
    private ClaveSeguridad claveSeguridad; // Relación de composición con ClaveSeguridad
    private Titular titular; // Relación bidireccional con Titular

    // Constructor
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion, String nombreTitular, String dni) {
        this.cbu = cbu; // Inicializa el CBU
        this.saldo = saldo; // Inicializa el saldo
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion); // Crea la clave (composición)
        this.titular = new Titular(nombreTitular, dni, this); // Crea el titular (asociación)
    }

    // Getter para CBU
    public String getCbu() {
        return cbu; // Retorna el CBU
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo; // Retorna el saldo
    }

    // Getter para clave de seguridad
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad; // Retorna la clave
    }

    // Getter para titular
    public Titular getTitular() {
        return titular; // Retorna el titular
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Cuenta Bancaria: CBU=" + cbu + ", Saldo=$" + saldo);
        System.out.println("Clave Seguridad: Código=" + claveSeguridad.getCodigo() + ", Última Modificación=" + claveSeguridad.getUltimaModificacion());
        System.out.println("Titular: Nombre=" + titular.getNombre() + ", DNI=" + titular.getDni());
    }
}