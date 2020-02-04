import java.util.Objects;

public class Operaciones {

    private Cliente cliente;
    private Vehículo vehiculo;
    private String tipoOperacion;
    private double precioAcordado;

    public Operaciones(Cliente cliente, Vehículo vehiculo, String tipoOperacion, double precioAcordado) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipoOperacion = tipoOperacion;
        this.precioAcordado = precioAcordado;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehículo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehículo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(double precioAcordado) {
        this.precioAcordado = precioAcordado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operaciones that = (Operaciones) o;
        return Objects.equals(tipoOperacion, that.tipoOperacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoOperacion);
    }

    @Override
    public String toString() {
        return "Operaciones{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", precioAcordado='" + precioAcordado + '\'' +
                '}';
    }
}
