public class MiMain {
    public static void main(String[] args) {
        LoteDeProductos lote = new LoteDeProductos();
        lote.addProducto(new Producto(p1, 4.3,12));
        lote.addProducto(new Producto(p2, 3.5,3));
        lote.addProducto(new Producto(p3, 4.9,4));

        lote.setSelectorDeMejorProducto(new CriterioMejorPrecio());

        System.out.println(lote.getSellersChoice());

    }
}
