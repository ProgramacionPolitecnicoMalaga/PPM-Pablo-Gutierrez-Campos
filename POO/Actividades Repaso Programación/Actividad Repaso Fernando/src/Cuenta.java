import java.util.ArrayList;

public class Cuenta {

    private Mesa mesa;
    private int numeroCuenta;
    private ArrayList<Producto> productos;

    public Cuenta(Mesa mesa, int numeroCuenta) {
        this.mesa = mesa;
        this.numeroCuenta = numeroCuenta;
        productos = new ArrayList<Producto>();
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void añadirProductos(Producto producto){
        productos.add(producto);
    }

    public double calcularTotalCuenta(){
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        } return total;
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "mesa=" + mesa +
                ", numeroCuenta=" + numeroCuenta +
                ", productos=" + productos +
                '}';
    }
}
