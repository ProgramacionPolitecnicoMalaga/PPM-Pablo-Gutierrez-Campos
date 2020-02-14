import java.util.ArrayList;

public class Vendedor extends Cliente {

    private ArrayList<Activo> activos;
    public Vendedor(String nombre, String apellidos, String dni, int telefono, String direccion) {
        super(nombre, apellidos, dni, telefono, direccion);
        activos = new ArrayList<Activo>();
    }

    public ArrayList<Activo> getActivos() {
        return activos;
    }

    public void añadirActivo(Activo activo){
        activos.add(activo);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "activos=" + activos +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
