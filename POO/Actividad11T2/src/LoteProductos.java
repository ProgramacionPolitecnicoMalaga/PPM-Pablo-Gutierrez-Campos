import java.util.ArrayList;

public class LoteProductos{
    ArrayList<Producto> ListaDeProductos;
    MejorSeleccion seleccion;

    public LoteProductos(MejorSeleccion seleccion) {
        ListaDeProductos = new ArrayList<Producto>();
        this.seleccion = seleccion;
    }

    public int getTotalProductos(){
        return ListaDeProductos.size();
    }

    public Producto getProductoEnPosicion(int i){
        return ListaDeProductos.get(i);
    }

    public void addProducto(Producto producto){
        ListaDeProductos.add(producto);
    }

    public ArrayList<Producto> elegirMejorOpcion(){
        return seleccion.mejorOpcion(ListaDeProductos);
    }

}
