import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.agregarProducto(
                new Producto("Teclado", "Perifericos", 120000)
        );

        inventario.agregarProducto(
                new Producto("Mouse", "Perifericos", 65000)
        );

        inventario.agregarProducto(
                new Producto("Portatil", "Computadores", 2500000)
        );

        inventario.agregarProducto(
                new Producto("Monitor", "Pantallas", 750000)
        );

        Iterator<Producto> iterator = inventario.crearIterator();

        System.out.println("=== INVENTARIO DE PRODUCTOS ===");

        while (iterator.hasNext()) {
            Producto producto = iterator.next();

            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Categoria: " + producto.getCategoria());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("------------------------------");
        }

        System.out.println("Fin del inventario.");
    }
}