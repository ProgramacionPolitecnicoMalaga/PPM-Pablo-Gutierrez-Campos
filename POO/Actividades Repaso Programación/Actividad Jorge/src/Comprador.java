public class Comprador extends Cliente {

    public Comprador(String nombre, String apellidos, String dni, int telefono, String direccion) {
        super(nombre, apellidos, dni, telefono, direccion);

    }

    @Override
    public String toString() {
        return "Comprador{" +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
