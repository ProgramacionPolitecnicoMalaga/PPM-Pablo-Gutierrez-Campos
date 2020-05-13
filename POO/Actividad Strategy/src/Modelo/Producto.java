package Modelo;

public class Producto {
    private String nombre;
    private double valoracion;
    private double precio;

    public Producto(String nombre, double valoracion, double precio) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.precio = precio;
    }

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
        return "Modelo.Producto{" +
                "nombre='" + nombre + '\'' +
                ", valoracion=" + valoracion +
                ", precio=" + precio +
                '}';
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
