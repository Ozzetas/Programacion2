/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainEjercicio2 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A2", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A3", "Julio Cortázar", "Argentino");

        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("ISBN004", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y el cáliz de fuego", 2000, a2);

        biblioteca.listarLibros();
        System.out.println();

        Libro l = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (l != null) l.mostrarInfo();
        System.out.println();

        biblioteca.filtrarLibrosPorAnio(1967);
        System.out.println();

        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();
        System.out.println();

        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());
        System.out.println();

        biblioteca.mostrarAutoresDisponibles();
    }
}
