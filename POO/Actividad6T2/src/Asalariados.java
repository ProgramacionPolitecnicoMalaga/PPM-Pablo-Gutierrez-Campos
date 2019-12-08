public class Asalariados extends Empleados {

public double sueldoBase;
    public Asalariados(String nombre, String apellidos, double sueldoBase) {
        super(nombre, apellidos);
        this.sueldoBase = sueldoBase;

    }

    public double getSueldo() {
        return sueldoBase;
    }



    @Override
    public String toString() {
        return "Asalariados{" +
                "sueldo=" + sueldoBase +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
