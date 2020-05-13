package Criterios;

import Modelo.LoteDeProductos;
import Modelo.Producto;

public interface SelectorDeMejorProducto {
    public Producto elegirMejorProducto(LoteDeProductos lote);
}
