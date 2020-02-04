import java.util.Date;

public interface Eventos {

    public void requisar(Vehiculo vehiculo, Date fecha);
    public void subastar(Vehiculo vehiculo, Date fecha) throws EventosException;
    public void vender(Vehiculo vehiculo,Date fecha,Comprador comprador) throws EventosException;
}
