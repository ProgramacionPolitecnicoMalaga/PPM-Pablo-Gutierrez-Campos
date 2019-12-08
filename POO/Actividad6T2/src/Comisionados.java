public class Comisionados extends Empleados {

private double sueldoBase;
private int numeroVentas;
private double sueldoPorVentas;

    public Comisionados(String nombre, String apellidos, double sueldoBase, int numeroVentas, double sueldoPorVentas) {
        super(nombre, apellidos);
        this.sueldoBase = sueldoBase;
        this.numeroVentas = numeroVentas;
        this.sueldoPorVentas = sueldoPorVentas;
    }

    public double getSueldo(){
        return sueldoBase + (double) numeroVentas*sueldoPorVentas;

    }


    @Override
    public String toString() {
        return "Comisionados{" +
                "sueldoBase=" + sueldoBase +
                ", numeroVentas=" + numeroVentas +
                ", sueldoPorVentas=" + sueldoPorVentas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}
