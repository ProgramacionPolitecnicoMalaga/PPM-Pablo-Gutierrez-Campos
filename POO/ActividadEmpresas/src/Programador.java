public class Programador extends Empleado {

    public Programador(String nombre, String apellidos, String DNI, String categoria) {
        super(nombre, apellidos, DNI, categoria);
    }

    @Override
    public double sueldo() {
        return 1800;
    }

}
