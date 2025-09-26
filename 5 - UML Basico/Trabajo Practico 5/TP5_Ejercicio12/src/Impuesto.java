/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Impuesto {
    private double monto; // Monto del impuesto
    private Contribuyente contribuyente; // Relación de asociación con Contribuyente

    // Constructor
    public Impuesto(double monto, String nombreContribuyente, String cuil) {
        this.monto = monto; // Inicializa el monto
        this.contribuyente = new Contribuyente(nombreContribuyente, cuil); // Crea el contribuyente (asociación)
    }

    // Getter para monto
    public double getMonto() {
        return monto; // Retorna el monto
    }

    // Getter para contribuyente
    public Contribuyente getContribuyente() {
        return contribuyente; // Retorna el contribuyente
    }
}
