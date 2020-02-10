import java.util.ArrayList;

public class Cafeteria {

    private ArrayList<Mesa> mesas;
    private Carta carta;
    private Caja caja;

    public Cafeteria(Carta carta, Caja caja) {
        this.carta = carta;
        this.caja = caja;
        mesas =  new ArrayList<Mesa>();
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public void añadirMesa(Mesa mesa){
        mesas.add(mesa);
    }

    public void asignarMesa(int num){
        mesas.get(num-1).reservarMesa();
    }

    public void liberarMesa(int num){
        mesas.get(num-1).liberarMesa();
    }

    public void liberarMesa(Mesa mesa){
        mesa.liberarMesa();
    }

    public void cobrarMesa(Cuenta cuenta){
        caja.cobrarCuenta(cuenta);
        liberarMesa(cuenta.getMesa());
    }

    public void calcularTotal(){
        caja.recuento();
    }

    public void añadirProductoALaCarta(String nombre, double precio){
        Producto producto = new Producto(nombre,precio);
        carta.añadirProductos(producto);
    }

    public ArrayList<Mesa> consultarMesasAbiertas(){
        ArrayList<Mesa> mesasLibres = new ArrayList<Mesa>();

        for (Mesa m: mesas) {
            if(m.isLibre()){
                mesasLibres.add(m);
            }

        } return mesasLibres;

    }

    public ArrayList<Mesa> consultarMesasCerradas(){
        ArrayList<Mesa> mesasCerradas = new ArrayList<Mesa>();

        for (Mesa m: mesas) {
            if(!m.isLibre()){
                mesasCerradas.add(m);
            }

        } return mesasCerradas;

    }

    public void añadirProductoALaMesa(Producto producto,int num){
        mesas.get(num-1).añadirProductos(producto);
    }


    @Override
    public String toString() {
        return "Cafeteria{" +
                "mesas=" + mesas +
                ", carta=" + carta +
                ", caja=" + caja +
                '}';
    }
}
