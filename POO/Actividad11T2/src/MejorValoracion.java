import java.util.ArrayList;

public class MejorValoracion{
    ArrayList<Producto> ListaDeProductos;

    public MejorValoracion() {
        ListaDeProductos = new ArrayList<Producto>();
    }
    public ArrayList<Producto> mejorOpcion(ArrayList<Producto> l) {
        ListaDeProductos = l;
        ArrayList<Producto> loteMejorValoracion = new ArrayList<>();
        loteMejorValoracion.add(ListaDeProductos.get(0));
        for (int i=1; i < ListaDeProductos.size();i++) {
            if(loteMejorValoracion.get(0).getValoracion()<ListaDeProductos.get(i).getValoracion()){
                loteMejorValoracion.removeAll(loteMejorValoracion);
                loteMejorValoracion.add(ListaDeProductos.get(i));
            }else if(loteMejorValoracion.get(0).getValoracion()==ListaDeProductos.get(i).getValoracion()){
                loteMejorValoracion.add(ListaDeProductos.get(i));
            }
        }
        return loteMejorValoracion;
    }
}

