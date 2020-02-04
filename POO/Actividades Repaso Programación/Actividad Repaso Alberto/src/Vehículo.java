import java.util.Date;

public class Vehículo {

    private String modelo;
    private String marca;
    private String color;
    private Date añoFabricacion;
    private String combustion;
    private String estado;
    private double precioRecomendadoDeVenta;

    public Vehículo(String modelo, String marca, String color, Date añoFabricacion, String combustion, String estado, double precioRecomendadoDeVenta) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        this.combustion = combustion;
        this.estado = estado;
        this.precioRecomendadoDeVenta = precioRecomendadoDeVenta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioRecomendadoDeVenta() {
        return precioRecomendadoDeVenta;
    }

    public void setPrecioRecomendadoDeVenta(double precioRecomendadoDeVenta) {
        this.precioRecomendadoDeVenta = precioRecomendadoDeVenta;
    }

    @Override
    public String toString() {
        return "Vehículo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", precioRecomendadoDeVenta=" + precioRecomendadoDeVenta +
                '}';
    }
}
