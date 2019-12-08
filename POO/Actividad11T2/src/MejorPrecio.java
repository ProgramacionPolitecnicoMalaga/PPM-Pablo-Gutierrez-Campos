import java.util.ArrayList;

public class MejorPrecio {
    ArrayList<Producto> ListaDeProductos;

    public MejorPrecio() {
        ListaDeProductos = new ArrayList<Producto>();
    }
    public ArrayList<Producto> mejorOpcion(ArrayList<Producto> l) {
        ListaDeProductos = l;
        ArrayList<Producto> loteMejorPrecio = new ArrayList<>();
        loteMejorPrecio.add(ListaDeProductos.get(0));
        for (int i=1; i < ListaDeProductos.size();i++) {
            if(loteMejorPrecio.get(0).getPrecio()>ListaDeProductos.get(i).getPrecio()){
                loteMejorPrecio.removeAll(loteMejorPrecio);
                loteMejorPrecio.add(ListaDeProductos.get(i));
            }else if (loteMejorPrecio.get(0).getPrecio()==ListaDeProductos.get(i).getPrecio()){
                loteMejorPrecio.add(ListaDeProductos.get(i));
            }
        }
        return loteMejorPrecio;
    }
}
