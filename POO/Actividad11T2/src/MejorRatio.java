import java.util.ArrayList;

public class MejorRatio{
    ArrayList<Producto> ListaDeProductos;

    public MejorRatio()  {
        ListaDeProductos = new ArrayList<Producto>();
    }
    public ArrayList<Producto> mejorOpcion(ArrayList<Producto> l) {
        ListaDeProductos = l;
        ArrayList<Producto> loteMejorRatio = new ArrayList<>();
        loteMejorRatio.add(ListaDeProductos.get(0));
        for (int i=1; i < ListaDeProductos.size();i++) {
            double ratio1 = loteMejorRatio.get(0).getValoracion()/loteMejorRatio.get(0).getPrecio();
            double ratio2 = ListaDeProductos.get(i).getValoracion()/ListaDeProductos.get(i).getPrecio();

            if(ratio1<ratio2){
                loteMejorRatio.removeAll(loteMejorRatio);
                loteMejorRatio.add(ListaDeProductos.get(i));
            }else if(ratio1==ratio2){
                loteMejorRatio.add(ListaDeProductos.get(i));
            }
        }
        return loteMejorRatio;
    }
}

