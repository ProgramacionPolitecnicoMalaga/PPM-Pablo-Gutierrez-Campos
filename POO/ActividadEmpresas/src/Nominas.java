public class Nominas {
    double saldoBase;
    double productividad;
    Empleado empleado;

    public Nominas(double saldoBase, double productividad, Empleado empleado) {
        this.saldoBase = saldoBase;
        this.productividad = productividad;
        this.empleado = empleado;
    }

    public double getSaldoBase() {
        return saldoBase;
    }

    public void setSaldoBase(double saldoBase) {
        this.saldoBase = saldoBase;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Nominas{" +
                "saldoBase=" + saldoBase +
                ", productividad=" + productividad +
                ", empleado=" + empleado +
                '}';
    }
}
