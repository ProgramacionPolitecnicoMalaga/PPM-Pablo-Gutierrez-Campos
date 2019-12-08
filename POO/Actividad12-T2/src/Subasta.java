import java.util.Date;

public class Subasta extends EventoVehiculo {
    public Subasta(Date fecha, Vehiculo vehiculo) {
        super(fecha, vehiculo);
    }

    @Override
    public String toString() {
        return "Subasta{" +
                "vehiculo=" + vehiculo +
                '}';
    }
}
