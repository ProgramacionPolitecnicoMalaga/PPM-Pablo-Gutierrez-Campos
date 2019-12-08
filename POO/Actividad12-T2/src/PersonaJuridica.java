import java.util.Date;

public class PersonaJuridica extends Comprador {
    private String CIF;
    private String razonSocial;

    public PersonaJuridica(String nombre, String CIF, String razonSocial) {
        super(nombre);
        this.CIF = CIF;
        this.razonSocial = razonSocial;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "PersonaJuridica{" +
                "CIF='" + CIF + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
