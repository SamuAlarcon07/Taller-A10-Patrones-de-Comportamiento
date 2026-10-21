import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Iterator<Producto> crearIterator() {
        return new ProductoIterator(productos);
    }
}