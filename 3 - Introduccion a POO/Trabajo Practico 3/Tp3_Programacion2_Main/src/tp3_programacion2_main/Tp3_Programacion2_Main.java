/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_programacion2_main;

/**
 *
 * @author BAD1110
 */
public class Tp3_Programacion2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1: Registro de Estudiantes
        // Crear una instancia de estudiante
        Estudiante estudiante = new Estudiante("Juan", "Perez", "Matemáticas", 85.5);
        // Mostrar información inicial
        estudiante.mostrarInfo();
        // Aumentar calificación en 10 puntos
        estudiante.subirCalificacion(10);
        // Mostrar información actualizada
        estudiante.mostrarInfo();
        // Disminuir calificación en 5 puntos
        estudiante.bajarCalificacion(5);
        // Mostrar información final
        estudiante.mostrarInfo();

        System.out.println("\n--- Separador ---\n");

        // Ejercicio 2: Registro de Mascotas
        // Crear una instancia de mascota
        Mascota mascota = new Mascota("Luna", "Perro", 2);
        // Mostrar información inicial
        mascota.mostrarInfo();
        // Simular envejecimiento
        mascota.cumplirAnios();
        // Mostrar información actualizada
        mascota.mostrarInfo();

        System.out.println("\n--- Separador ---\n");

        // Ejercicio 3: Encapsulamiento con la Clase Libro
        // Crear una instancia de libro
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        // Mostrar información inicial
        libro.mostrarInfo();
        // Intentar establecer un año de publicación inválido
        libro.setAnioPublicacion(-100);
        // Mostrar información (sin cambios por año inválido)
        libro.mostrarInfo();
        // Establecer un año de publicación válido
        libro.setAnioPublicacion(1970);
        // Mostrar información final
        libro.mostrarInfo();

        System.out.println("\n--- Separador ---\n");

        // Ejercicio 4: Gestión de Gallinas en Granja Digital
        // Crear dos instancias de gallinas
        Gallina gallina1 = new Gallina("G001", 1, 0);
        Gallina gallina2 = new Gallina("G002", 2, 5);
        // Simular acciones para la primera gallina
        gallina1.ponerHuevo();
        gallina1.envejecer();
        // Mostrar estado de la primera gallina
        gallina1.mostrarEstado();
        // Simular acciones para la segunda gallina
        gallina2.ponerHuevo();
        gallina2.envejecer();
        // Mostrar estado de la segunda gallina
        gallina2.mostrarEstado();

        System.out.println("\n--- Separador ---\n");

        // Ejercicio 5: Simulación de Nave Espacial
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Apolo", 50);
        // Intentar avanzar sin suficiente combustible
        nave.avanzar(60);
        // Mostrar estado (combustible sin cambios)
        nave.mostrarEstado();
        // Recargar combustible
        nave.recargarCombustible(30);
        // Avanzar exitosamente
        nave.avanzar(20);
        // Mostrar estado final
        nave.mostrarEstado();
    }
}

// Ejercicio 1: Clase Estudiante
class Estudiante {
    // Atributos
    private String nombre; // Nombre del estudiante
    private String apellido; // Apellido del estudiante
    private String curso; // Nombre del curso
    private double calificacion; // Calificación del estudiante (0-100)

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre; // Inicializa el nombre
        this.apellido = apellido; // Inicializa el apellido
        this.curso = curso; // Inicializa el curso
        this.calificacion = calificacion; // Inicializa la calificación
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    // Método para aumentar la calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos; // Suma puntos a la calificación
        if (calificacion > 100) calificacion = 100; // Limita la calificación a 100
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
    }

    // Método para disminuir la calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos; // Resta puntos de la calificación
        if (calificacion < 0) calificacion = 0; // Limita la calificación a 0
        System.out.println("Calificación disminuida en " + puntos + " puntos.");
    }
}

// Ejercicio 2: Clase Mascota
class Mascota {
    // Atributos
    private String nombre; // Nombre de la mascota
    private String especie; // Especie de la mascota
    private int edad; // Edad de la mascota

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre; // Inicializa el nombre
        this.especie = especie; // Inicializa la especie
        this.edad = edad; // Inicializa la edad
    }

    // Método para mostrar información de la mascota
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + ", Especie: " + especie + ", Edad: " + edad + " años");
    }

    // Método para incrementar la edad
    public void cumplirAnios() {
        edad++; // Aumenta la edad en 1
        System.out.println(nombre + " ha cumplido un año más.");
    }
}

// Ejercicio 3: Clase Libro
class Libro {
    // Atributos privados para encapsulamiento
    private String titulo; // Título del libro
    private String autor; // Autor del libro
    private int anioPublicacion; // Año de publicación

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo; // Inicializa el título
        this.autor = autor; // Inicializa el autor
        this.anioPublicacion = anioPublicacion; // Inicializa el año de publicación
    }

    // Getter para el título
    public String getTitulo() {
        return titulo; // Retorna el título
    }

    // Getter para el autor
    public String getAutor() {
        return autor; // Retorna el autor
    }

    // Getter para el año de publicación
    public int getAnioPublicacion() {
        return anioPublicacion; // Retorna el año de publicación
    }

    // Setter para el año de publicación con validación
    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) { // Valida que el año sea positivo y no futuro
            this.anioPublicacion = anio; // Establece el año válido
            System.out.println("Año de publicación actualizado a: " + anio);
        } else {
            System.out.println("Año inválido: " + anio); // Advierte sobre año inválido
        }
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion);
    }
}

// Ejercicio 4: Clase Gallina
class Gallina {
    // Atributos
    private String idGallina; // Identificador único de la gallina
    private int edad; // Edad de la gallina
    private int huevosPuestos; // Cantidad de huevos puestos

    // Constructor
    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina; // Inicializa el ID
        this.edad = edad; // Inicializa la edad
        this.huevosPuestos = huevosPuestos; // Inicializa el conteo de huevos
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++; // Incrementa el conteo de huevos
        System.out.println("Gallina " + idGallina + " ha puesto un huevo.");
    }

    // Método para envejecer
    public void envejecer() {
        edad++; // Incrementa la edad
        System.out.println("Gallina " + idGallina + " ha envejecido un año.");
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina: " + idGallina + ", Edad: " + edad + ", Huevos puestos: " + huevosPuestos);
    }
}

// Ejercicio 5: Clase NaveEspacial
class NaveEspacial {
    // Atributos
    private String nombre; // Nombre de la nave
    private int combustible; // Cantidad de combustible
    private final int LIMITE_COMBUSTIBLE = 100; // Capacidad máxima de combustible

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre; // Inicializa el nombre
        this.combustible = combustible; // Inicializa el combustible
    }

    // Método para intentar despegar
    public void despegar() {
        if (combustible >= 10) { // Verifica si hay suficiente combustible para despegar
            combustible -= 10; // Consume 10 unidades de combustible
            System.out.println(nombre + " ha despegado exitosamente.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar una distancia
    public void avanzar(int distancia) {
        int combustibleNecesario = distancia / 2; // 2 km por unidad de combustible
        if (combustible >= combustibleNecesario) { // Verifica si hay suficiente combustible
            combustible -= combustibleNecesario; // Consume combustible
            System.out.println(nombre + " ha avanzado " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) { // Verifica si no excede el límite
            combustible += cantidad; // Agrega combustible
            System.out.println("Se han recargado " + cantidad + " unidades de combustible.");
        } else {
            System.out.println("No se puede recargar: excede el límite de combustible.");
        }
    }

    // Método para mostrar el estado de la nave
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible + " unidades");
    }
}
