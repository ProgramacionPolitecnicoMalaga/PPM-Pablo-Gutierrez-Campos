public class Técnico extends Empleado {

    public Técnico(String nombre, String apellidos, String DNI, String categoria) {
        super(nombre, apellidos, DNI, categoria);
    }

    @Override
    public double sueldo() {
        return 900;
    }
}
