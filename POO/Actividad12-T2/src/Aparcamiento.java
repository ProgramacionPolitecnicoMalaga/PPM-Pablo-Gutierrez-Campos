import java.util.ArrayList;
import java.util.Date;

public class Aparcamiento implements Eventos{
    ArrayList<Vehiculo> listaRequisados;
    ArrayList<Vehiculo> listaSubastados;
    ArrayList<Vehiculo> listaVendidos;
    ArrayList<EventoVehiculo> listaEventos;
    ArrayList<Comprador> listaCompradoresAutorizados;



    public Aparcamiento() {
        this.listaRequisados = new ArrayList<Vehiculo>();
        this.listaSubastados = new ArrayList<Vehiculo>();
        this.listaVendidos =   new ArrayList<Vehiculo>();
        listaEventos =   new ArrayList<EventoVehiculo>();
        listaCompradoresAutorizados =  new ArrayList<Comprador>();
    }

    public ArrayList<Vehiculo> getListaRequisados() {
        return listaRequisados;
    }

    public void setListaRequisados(ArrayList<Vehiculo> listaRequisados) {
        this.listaRequisados = listaRequisados;
    }

    public ArrayList<Vehiculo> getListaSubastados() {
        return listaSubastados;
    }

    public void setListaSubastados(ArrayList<Vehiculo> listaSubastados) {
        this.listaSubastados = listaSubastados;
    }

    public ArrayList<Vehiculo> getListaVendidos() {
        return listaVendidos;
    }

    public void setListaVendidos(ArrayList<Vehiculo> listaVendidos) {
        this.listaVendidos = listaVendidos;
    }

    @Override
    public void requisar(Vehiculo vehiculo, Date fecha) {
        listaEventos.add(new Confiscación(fecha,vehiculo));
        listaRequisados.add(vehiculo);
    }

    @Override
    public void subastar(Vehiculo vehiculo, Date fecha) throws EventosException {
        if(listaRequisados.contains(vehiculo)){
        listaEventos.add(new Subasta(fecha,vehiculo));
        listaRequisados.remove(vehiculo);
        listaSubastados.add(vehiculo);
    }else{
            throw new EventosException("El vehiculo no ha sido requisado");
        }

    }

    @Override
    public void vender(Vehiculo vehiculo, Date fecha, Comprador comprador) throws EventosException {
        if(!listaSubastados.contains(vehiculo)){
            throw new EventosException("El vehiculo no está en subasta");
        } else if(listaCompradoresAutorizados.contains(comprador)){
            listaEventos.add(new Venta(fecha,vehiculo,comprador));
            listaSubastados.remove(vehiculo);
            listaVendidos.add(vehiculo);
        }else{
            throw new EventosException("El comprador no está autorizado");
        }

    }

    public void añadirComprador(Comprador comprador){
        listaCompradoresAutorizados.add(comprador);
    }

    public void añadirEvento(EventoVehiculo e){
        listaEventos.add(e);
    }
}
