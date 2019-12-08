public class MiMain {
    public static void main(String[] args) {
        MejorSeleccion selector1 = new MejorPrecio();
        MejorSeleccion selector2 = new MejorValoracion();
        MejorSeleccion selector3 = new MejorRatio();
        LoteProductos productos = new LoteProductos(selector1);

       productos.addProducto(new Producto("Chocolate1", 3,5));
       productos.addProducto(new Producto("Chocolate2", 1,1));
       productos.addProducto(new Producto("Chocolate3", 1,1));
       productos.addProducto(new Producto("Chocolate4", 3,5));
       productos.addProducto(new Producto("Chocolate5", 5,5));

        System.out.println(productos.elegirMejorOpcion());



    }
}
