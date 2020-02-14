import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Activo> ventas;
    private ArrayList<Activo> alquileres;
    private ArrayList<Cliente> clientes;
    private ArrayList<Formulario> clientesFinanciacion;


    public Inmobiliaria() {
         ventas = new ArrayList<Activo>();
         alquileres = new ArrayList<Activo>();
         clientes = new ArrayList<Cliente>();
         clientesFinanciacion = new ArrayList<Formulario>();
    }

    public ArrayList<Activo> getVentas() {
        return ventas;
    }


    public ArrayList<Activo> getAlquileres() {
        return alquileres;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Formulario> getClientesFinanciacion() {
        return clientesFinanciacion;
    }

    public void ponerEnVenta(Activo activo){
        activo.setVentaAlquiler(true);
        ventas.add(activo);
    }

    public void ponerEnAlquiler(Activo activo){
        activo.setVentaAlquiler(false);
        alquileres.add(activo);
    }

    public void añadirCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void añadirClienteFinanciacion(Formulario formulario){
        clientesFinanciacion.add(formulario);
    }




    @Override
    public String toString() {
        return "Inmobiliaria{" +
                "ventas=" + ventas +
                ", alquileres=" + alquileres +
                '}';
    }


}
