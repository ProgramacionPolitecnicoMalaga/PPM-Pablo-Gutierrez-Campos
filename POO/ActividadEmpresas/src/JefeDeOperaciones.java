public class JefeDeOperaciones extends Empleado {

    public JefeDeOperaciones(String nombre, String apellidos, String DNI, String categoria) {
        super(nombre, apellidos, DNI, categoria);
    }

    @Override
    public double sueldo() {
        return 3500;
    }

}
