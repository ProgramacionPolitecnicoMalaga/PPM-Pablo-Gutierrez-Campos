import java.util.Date;

public class Barco extends Vehiculo {
    private String nombre;
    private double eslora,manga,calado;

    public Barco(Date fechFabricado, Date fechaEntrada, int numeroDeBastidor, String nombre, double eslora, double manga, double calado) {
        super(fechFabricado, fechaEntrada, numeroDeBastidor);
        this.nombre = nombre;
        this.eslora = eslora;
        this.manga = manga;
        this.calado = calado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nombre='" + nombre + '\'' +
                ", eslora=" + eslora +
                ", manga=" + manga +
                ", calado=" + calado +
                '}';
    }
}
