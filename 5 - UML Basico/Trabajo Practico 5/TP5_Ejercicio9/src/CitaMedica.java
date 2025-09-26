/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class CitaMedica {
    private String fecha; // Fecha de la cita
    private String hora; // Hora de la cita
    private Paciente paciente; // Relación de asociación con Paciente
    private Profesional profesional; // Relación de asociación con Profesional

    // Constructor
    public CitaMedica(String fecha, String hora, String nombrePaciente, String obraSocial, String nombreProfesional, String especialidad) {
        this.fecha = fecha; // Inicializa la fecha
        this.hora = hora; // Inicializa la hora
        this.paciente = new Paciente(nombrePaciente, obraSocial); // Crea el paciente (asociación)
        this.profesional = new Profesional(nombreProfesional, especialidad); // Crea el profesional (asociación)
    }

    // Getter para fecha
    public String getFecha() {
        return fecha; // Retorna la fecha
    }

    // Getter para hora
    public String getHora() {
        return hora; // Retorna la hora
    }

    // Getter para paciente
    public Paciente getPaciente() {
        return paciente; // Retorna el paciente
    }

    // Getter para profesional
    public Profesional getProfesional() {
        return profesional; // Retorna el profesional
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Cita Médica: Fecha=" + fecha + ", Hora=" + hora);
        System.out.println("Paciente: Nombre=" + paciente.getNombre() + ", Obra Social=" + paciente.getObraSocial());
        System.out.println("Profesional: Nombre=" + profesional.getNombre() + ", Especialidad=" + profesional.getEspecialidad());
    }
}