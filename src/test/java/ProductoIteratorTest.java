import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoIteratorTest {

    @Test
    public void debeRecorrerTodosLosProductosEnOrden() {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(
                new Producto("Teclado", "Perifericos", 120000)
        );

        inventario.agregarProducto(
                new Producto("Mouse", "Perifericos", 65000)
        );

        inventario.agregarProducto(
                new Producto("Monitor", "Pantallas", 750000)
        );

        Iterator<Producto> iterator = inventario.crearIterator();

        assertTrue(iterator.hasNext());
        assertEquals("Teclado", iterator.next().getNombre());

        assertTrue(iterator.hasNext());
        assertEquals("Mouse", iterator.next().getNombre());

        assertTrue(iterator.hasNext());
        assertEquals("Monitor", iterator.next().getNombre());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void debeIndicarQueNoHayElementosEnInventarioVacio() {
        Inventario inventario = new Inventario();

        Iterator<Producto> iterator = inventario.crearIterator();

        assertFalse(iterator.hasNext());
    }

    @Test
    public void debeLanzarExcepcionCuandoNoHayMasProductos() {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(
                new Producto("Teclado", "Perifericos", 120000)
        );

        Iterator<Producto> iterator = inventario.crearIterator();

        iterator.next();

        assertThrows(
                NoSuchElementException.class,
                () -> iterator.next()
        );
    }
}