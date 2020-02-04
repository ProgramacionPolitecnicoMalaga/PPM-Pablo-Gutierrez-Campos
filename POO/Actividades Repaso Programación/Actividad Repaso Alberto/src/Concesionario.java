import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Cliente> listaDeClientes;
    private ArrayList<Vehículo> listaDeVehiculos;
    private ArrayList<Operaciones> listaDeOperaciones;

    public Concesionario() {
         listaDeClientes = new ArrayList<Cliente>();
         listaDeVehiculos = new ArrayList<Vehículo>();
         listaDeOperaciones = new ArrayList<Operaciones>();
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public ArrayList<Vehículo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(ArrayList<Vehículo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public ArrayList<Operaciones> getListaDeOperaciones() {
        return listaDeOperaciones;
    }

    public void setListaDeOperaciones(ArrayList<Operaciones> listaDeOperaciones) {
        this.listaDeOperaciones = listaDeOperaciones;
    }

    public void añadirVehiculo(Vehículo vehiculo){
        listaDeVehiculos.add(vehiculo);
    }

    public void añadirCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public void venderACliente(Cliente cliente,Vehículo vehículo, double precio){
        Operaciones operaciones = new Operaciones(cliente,vehículo,"Venta",precio);
        listaDeOperaciones.add(operaciones);

    }


    public void comprarACliente(Cliente cliente,Vehículo vehículo,double precio){
        Operaciones operaciones = new Operaciones(cliente,vehículo,"Compra",precio);
        listaDeOperaciones.add(operaciones);
    }

    public double consultarSaldoTotalCliente(Cliente cliente){

        double saldoTotal = 0;

        for (Operaciones o: listaDeOperaciones) {
            if (o.getCliente().equals(cliente)){
                if (o.getTipoOperacion().equals("Compra")){
                    saldoTotal -= o.getPrecioAcordado();
                } else if (o.getTipoOperacion().equals("Venta")){
                    saldoTotal += o.getPrecioAcordado();
                } else {
                    System.out.println("Introduzca una operación correcta");
                }
            }

        } return saldoTotal;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "listaDeClientes=" + listaDeClientes +
                ", listaDeVehiculos=" + listaDeVehiculos +
                ", listaDeOperaciones=" + listaDeOperaciones +
                '}';
    }
}
