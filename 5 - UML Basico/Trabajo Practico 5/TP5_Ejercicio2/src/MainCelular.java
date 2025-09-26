/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un celular con batería y usuario
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", "BAT123", 4000, "Ana Gómez", "87654321");
        // Mostrar información
        celular.mostrarInfo();
    }
    
}
