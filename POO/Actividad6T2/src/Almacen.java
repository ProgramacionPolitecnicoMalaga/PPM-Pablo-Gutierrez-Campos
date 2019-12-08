import java.util.ArrayList;

public class Almacen {
    ArrayList<Empleados> trabajadores;

    public Almacen() {
        trabajadores = new ArrayList<Empleados>();
    }

    public void anadir(Empleados e){
        trabajadores.add(e);
    }

}
