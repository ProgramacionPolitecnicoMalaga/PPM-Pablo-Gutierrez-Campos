package Criterios;

import Modelo.LoteDeProductos;
import Modelo.Producto;

public class CriterioMejorValorado implements SelectorDeMejorProducto {
    @Override
    public Producto elegirMejorProducto(LoteDeProductos lote) {
        double mayorValoracion = Double.MIN_VALUE;
        Producto productoMejorValorado = null;
        for (int i=0; i<lote.getTotalProductos(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double valoracionActual = productoActual.getValoracion();
            if (valoracionActual  > mayorValoracion){
                mayorValoracion = valoracionActual;
                productoMejorValorado = productoActual;
            }
        }
        return productoMejorValorado;
    }
}

