import java.util.ArrayList;

public class Caja {

    private ArrayList<Cuenta> cuentas;

    public Caja() {
         cuentas =  new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void cobrarCuenta(Cuenta cuenta){
        cuenta.calcularTotalCuenta();
        cuentas.add(cuenta);
    }

    public double recuento(){
        double total = 0;
        for (Cuenta c:cuentas) {
            total += c.calcularTotalCuenta();

        } return total;
    }


    @Override
    public String toString() {
        return "Caja{" +
                "cuentas=" + cuentas +
                '}';
    }
}
