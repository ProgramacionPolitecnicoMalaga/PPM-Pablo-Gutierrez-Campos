import java.util.Date;

public class Camion extends Vehiculo {
    private String matricula;
    private double altura,anchura,longitud;

    public Camion(Date fechFabricado, Date fechaEntrada, int numeroDeBastidor, String matricula, double altura, double anchura, double longitud) {
        super(fechFabricado, fechaEntrada, numeroDeBastidor);
        this.matricula = matricula;
        this.altura = altura;
        this.anchura = anchura;
        this.longitud = longitud;


    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public double getAnchura() {
        return anchura;
    }


    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", longitud=" + longitud +
                '}';
    }
}
