/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BAD1110
 */
public class MainEjercicio1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear 5 productos
        inventario.agregarProducto(new Producto("P1", "Arroz", 800.50, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P2", "Televisor 50\"", 250000.00, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P3", "Camiseta", 3500.00, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P4", "Lámpara", 1800.00, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P5", "Café", 1200.00, 40, CategoriaProducto.ALIMENTOS));

        // Tareas
        inventario.listarProductos();
        System.out.println();

        Producto p = inventario.buscarProductoPorId("P2");
        if (p != null) p.mostrarInfo();
        System.out.println();

        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println();

        inventario.eliminarProducto("P3");
        inventario.listarProductos();
        System.out.println();

        inventario.actualizarStock("P1", 75);
        inventario.listarProductos();
        System.out.println();

        System.out.println("Total en stock: " + inventario.obtenerTotalStock());
        System.out.println();

        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            System.out.print("Producto con mayor stock: ");
            mayor.mostrarInfo();
        }
        System.out.println();

        inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println();

        inventario.mostrarCategoriasDisponibles();
    }
}
