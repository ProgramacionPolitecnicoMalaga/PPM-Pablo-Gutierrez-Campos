import java.util.Date;

public class Vehiculo {
    private Date fechFabricado;
    private Date fechaEntrada;
    private int numeroDeBastidor;

    public Vehiculo(Date fechFabricado, Date fechaEntrada, int numeroDeBastidor) {
        this.fechFabricado = fechFabricado;
        this.fechaEntrada = fechaEntrada;
        this.numeroDeBastidor = numeroDeBastidor;
    }

    public Date getFechFabricado() {
        return fechFabricado;
    }

    public void setFechFabricado(Date fechFabricado) {
        this.fechFabricado = fechFabricado;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroDeBastidor() {
        return numeroDeBastidor;
    }

    public void setNumeroDeBastidor(int numeroDeBastidor) {
        this.numeroDeBastidor = numeroDeBastidor;
    }
}
