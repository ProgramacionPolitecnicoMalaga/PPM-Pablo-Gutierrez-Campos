import java.util.ArrayList;

public class Mesa {

    private int numero;
    private boolean libre;
    ArrayList<Producto> productos;
    private int tamaño;

    public Mesa(int numero, boolean estado,int tamaño) {
        this.numero = numero;
        this.libre = estado;
        productos = new ArrayList<Producto>();
        this.tamaño = tamaño;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void añadirProductos(Producto producto){
        productos.add(producto);
    }

    public void reservarMesa(){
        libre = false;
    }

    public void liberarMesa(){
        libre = true;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", estado=" + libre +
                ", productos=" + productos +
                ", tamaño=" + tamaño +
                '}';
    }
}

