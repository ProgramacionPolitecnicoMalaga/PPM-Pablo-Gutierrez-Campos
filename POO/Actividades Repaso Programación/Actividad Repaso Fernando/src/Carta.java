import java.util.ArrayList;

public class Carta {

    private ArrayList<Producto> productos;

    public Carta() {
          productos =  new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void añadirProductos(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "productos=" + productos +
                '}';
    }
}
