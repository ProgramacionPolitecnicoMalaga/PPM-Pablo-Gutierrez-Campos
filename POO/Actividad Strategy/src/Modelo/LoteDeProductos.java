package Modelo;

import Criterios.CriterioMejorPrecio;
import Criterios.SelectorDeMejorProducto;

import java.util.Arrays;

public class LoteDeProductos {
    private Producto[] productos;
    private final static int MAX_PRODUCTOS = 100;
    private int totalProductos;

    public LoteDeProductos(){
        totalProductos = 0;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void addProducto(Producto producto){
        if (totalProductos < productos.length){
            productos[totalProductos] = producto;
            totalProductos++;
        } else {
            productos= Arrays.copyOf(productos,productos.length * 2);
            productos[totalProductos] = producto;
            totalProductos++;
        }
    }

    public Producto getProductoEnPosicion(int i){
        if ((i>=0)&&(i<productos.length))
            return productos[i];
        return null;
    }
    public int getTotalProductos(){
        return totalProductos;
    }

}
