public class PersonaFisica extends Comprador {
    private String DNI;
    private String direccion;

    public PersonaFisica(String nombre, String DNI, String direccion) {
        super(nombre);
        this.DNI = DNI;
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "PersonaFisica{" +
                "DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
