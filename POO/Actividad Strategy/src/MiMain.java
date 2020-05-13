import Criterios.CriterioMejorPrecio;
import Criterios.CriterioMejorRatioValoracionPrecio;
import Criterios.CriterioMejorValorado;
import Criterios.Selector;
import Modelo.LoteDeProductos;
import Modelo.Producto;

public class MiMain {
    public static void main(String[] args) {
        LoteDeProductos lote = new LoteDeProductos();
        CriterioMejorPrecio mejorPrecio = new CriterioMejorPrecio();
        CriterioMejorRatioValoracionPrecio mejorRatio = new CriterioMejorRatioValoracionPrecio();
        CriterioMejorValorado mejorValorado = new CriterioMejorValorado();
        Selector selector = new Selector();
        lote.addProducto(new Producto("Tornillo", 4.3,12));
        lote.addProducto(new Producto("Tornillo1", 3.5,3));
        lote.addProducto(new Producto("Tornillo2", 4.9,4));
        selector.setSelector(mejorRatio);
        System.out.println(selector.obtenerProducto(lote));


    }
}
