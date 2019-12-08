public class Producto {
    private String nombre;
    private double valoracion;
    private double precio;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valoracion=" + valoracion +
                ", precio=" + precio +
                '}';
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
