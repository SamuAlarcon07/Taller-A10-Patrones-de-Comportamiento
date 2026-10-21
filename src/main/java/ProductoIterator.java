import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductoIterator implements Iterator<Producto> {

    private List<Producto> productos;
    private int posicion;

    public ProductoIterator(List<Producto> productos) {
        this.productos = productos;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < productos.size();
    }

    @Override
    public Producto next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más productos.");
        }

        Producto producto = productos.get(posicion);
        posicion++;

        return producto;
    }
}