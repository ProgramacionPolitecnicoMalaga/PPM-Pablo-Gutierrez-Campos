public class JefeDeProyecto extends Empleado {

    public JefeDeProyecto(String nombre, String apellidos, String DNI, String categoria) {
        super(nombre, apellidos, DNI, categoria);
    }

    @Override
    public double sueldo() {
        return 2500;
    }
}
