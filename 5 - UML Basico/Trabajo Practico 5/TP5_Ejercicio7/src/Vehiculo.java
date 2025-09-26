/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Vehiculo {
    private String patente; // Patente del vehículo
    private String modelo; // Modelo del vehículo
    private Motor motor; // Relación de agregación con Motor
    private Conductor conductor; // Relación bidireccional con Conductor

    // Constructor
    public Vehiculo(String patente, String modelo, String tipoMotor, String numeroSerie, String nombreConductor, String licencia) {
        this.patente = patente; // Inicializa la patente
        this.modelo = modelo; // Inicializa el modelo
        this.motor = new Motor(tipoMotor, numeroSerie); // Crea el motor (agregación)
        this.conductor = new Conductor(nombreConductor, licencia, this); // Crea el conductor (asociación)
    }

    // Getter para patente
    public String getPatente() {
        return patente; // Retorna la patente
    }

    // Getter para modelo
    public String getModelo() {
        return modelo; // Retorna el modelo
    }

    // Getter para motor
    public Motor getMotor() {
        return motor; // Retorna el motor
    }

    // Getter para conductor
    public Conductor getConductor() {
        return conductor; // Retorna el conductor
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Vehículo: Patente=" + patente + ", Modelo=" + modelo);
        System.out.println("Motor: Tipo=" + motor.getTipo() + ", Número Serie=" + motor.getNumeroSerie());
        System.out.println("Conductor: Nombre=" + conductor.getNombre() + ", Licencia=" + conductor.getLicencia());
    }
}
