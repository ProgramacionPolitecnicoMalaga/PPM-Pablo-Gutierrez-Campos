package Criterios;

import Criterios.SelectorDeMejorProducto;
import Modelo.LoteDeProductos;
import Modelo.Producto;

public class Selector {

    private SelectorDeMejorProducto selector;

    public void setSelector(SelectorDeMejorProducto selector) {
        this.selector = selector;
    }

    public Producto obtenerProducto(LoteDeProductos loteDeProductos){
       return selector.elegirMejorProducto(loteDeProductos);
    }
}
