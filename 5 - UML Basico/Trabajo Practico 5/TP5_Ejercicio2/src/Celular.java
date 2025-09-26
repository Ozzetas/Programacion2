/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class Celular {
    private String imei; // Identificador único del celular
    private String marca; // Marca del celular
    private String modelo; // Modelo del celular
    private Bateria bateria; // Relación de agregación con Batería
    private Usuario usuario; // Relación bidireccional con Usuario

    // Constructor
    public Celular(String imei, String marca, String modelo, String modeloBateria, int capacidad, String nombre, String dni) {
        this.imei = imei; // Inicializa el IMEI
        this.marca = marca; // Inicializa la marca
        this.modelo = modelo; // Inicializa el modelo
        this.bateria = new Bateria(modeloBateria, capacidad); // Crea la batería (agregación)
        this.usuario = new Usuario(nombre, dni, this); // Crea el usuario (asociación)
    }

    // Getter para IMEI
    public String getImei() {
        return imei; // Retorna el IMEI
    }

    // Getter para marca
    public String getMarca() {
        return marca; // Retorna la marca
    }

    // Getter para modelo
    public String getModelo() {
        return modelo; // Retorna el modelo
    }

    // Getter para batería
    public Bateria getBateria() {
        return bateria; // Retorna la batería
    }

    // Getter para usuario
    public Usuario getUsuario() {
        return usuario; // Retorna el usuario
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Celular: IMEI=" + imei + ", Marca=" + marca + ", Modelo=" + modelo);
        System.out.println("Batería: Modelo=" + bateria.getModelo() + ", Capacidad=" + bateria.getCapacidad() + "mAh");
        System.out.println("Usuario: Nombre=" + usuario.getNombre() + ", DNI=" + usuario.getDni());
    }
}
