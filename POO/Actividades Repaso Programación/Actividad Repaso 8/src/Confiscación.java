import java.util.Date;

public class Confiscación extends EventoVehiculo {
    public Confiscación(Date fecha, Vehiculo vehiculo) {
        super(fecha, vehiculo);
    }

    @Override
    public String toString() {
        return "Confiscación{" +
                "vehiculo=" + vehiculo +
                '}';
    }
}
