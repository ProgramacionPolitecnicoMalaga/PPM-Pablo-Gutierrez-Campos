import java.util.ArrayList;

public class Paquete implements Servicio {

    private String nombre;
    private double precio;
    private ArrayList<Servicio> servicios;

    public Paquete(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        servicios = new ArrayList<>();
    }

    @Override
    public boolean getTipo() {
        return true;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecioFinal() {
        double precio = getPrecio();
        for (Servicio s: servicios) {
            precio += s.getPrecioFinal();
        }
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void añadirServicio(Servicio servicio){
        servicios.add(servicio);
    }

    public void eliminarServicio(int indice){
        servicios.remove(indice);
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Paquete{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", servicios=" + servicios +
                '}';
    }
}
