import java.util.Date;

public class Venta extends EventoVehiculo {
    Comprador comprador;


    public Venta(Date fecha, Vehiculo vehiculo, Comprador comprador) {
        super(fecha, vehiculo);
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "comprador=" + comprador +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
