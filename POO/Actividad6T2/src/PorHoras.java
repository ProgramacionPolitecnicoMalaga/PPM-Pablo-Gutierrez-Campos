public class PorHoras extends Empleados {
    private double sueldoPorHora;
    private double horasTrabajadas;

    public PorHoras(String nombre, String apellidos, double sueldoPorHora, double horasTrabajadas) {
        super(nombre, apellidos);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldo() {
        return sueldoPorHora*horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }



    @Override
    public String toString() {
        return "PorHoras{" +
                "sueldoPorHora=" + sueldoPorHora +
                ", horasTrabajadas=" + horasTrabajadas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}
