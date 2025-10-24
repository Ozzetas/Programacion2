/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainEjercicio3 {
    public static void main(String[] args) {
        Universidad univesp = new Universidad("UNIVESP");

        // Crear profesores
        Profesor p1 = new Profesor("P01", "Ana López", "Programación");
        Profesor p2 = new Profesor("P02", "Carlos Gómez", "Bases de Datos");
        Profesor p3 = new Profesor("P03", "María Pérez", "Redes");

        univesp.agregarProfesor(p1);
        univesp.agregarProfesor(p2);
        univesp.agregarProfesor(p3);

        // Crear cursos
        Curso c1 = new Curso("CURS001", "POO en Java");
        Curso c2 = new Curso("CURS002", "SQL Avanzado");
        Curso c3 = new Curso("CURS003", "Redes I");
        Curso c4 = new Curso("CURS004", "Algoritmos");
        Curso c5 = new Curso("CURS005", "Desarrollo Web");

        univesp.agregarCurso(c1);
        univesp.agregarCurso(c2);
        univesp.agregarCurso(c3);
        univesp.agregarCurso(c4);
        univesp.agregarCurso(c5);

        // Asignar profesores
        univesp.asignarProfesorACurso("CURS001", "P01");
        univesp.asignarProfesorACurso("CURS002", "P02");
        univesp.asignarProfesorACurso("CURS003", "P03");
        univesp.asignarProfesorACurso("CURS004", "P01");

        univesp.listarCursos();
        System.out.println();
        univesp.listarProfesores();
        System.out.println();

        // Cambiar profesor
        System.out.println("Cambiando profesor de CURS001 a P02...");
        univesp.asignarProfesorACurso("CURS001", "P02");

        univesp.listarCursos();
        System.out.println();
        p1.listarCursos();
        p2.listarCursos();
        System.out.println();

        // Eliminar curso
        univesp.eliminarCurso("CURS005");
        System.out.println("Después de eliminar CURS005:");
        univesp.listarCursos();
        System.out.println();

        // Eliminar profesor
        univesp.eliminarProfesor("P03");
        System.out.println("Después de eliminar P03:");
        univesp.listarCursos();
    }
}
