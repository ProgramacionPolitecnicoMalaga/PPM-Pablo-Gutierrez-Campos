public class Administrador extends Empleado {


    public Administrador(String nombre, String apellidos, String DNI, String categoria) {
        super(nombre, apellidos, DNI, categoria);
    }

    @Override
    public double sueldo() {
        return 1400;
    }

}
