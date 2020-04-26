package Modelo;

public class Empadronamiento {
    public int año;
    public String nacionalidad;
    public int numeroEmpadronados;

    public Empadronamiento(int año, String nacionalidad, int numeroEmpadronados) {
        this.año = año;
        this.nacionalidad = nacionalidad;
        this.numeroEmpadronados = numeroEmpadronados;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroEmpadronados() {
        return numeroEmpadronados;
    }

    public void setNumeroEmpadronados(int numeroEmpadronados) {
        this.numeroEmpadronados = numeroEmpadronados;
    }

    @Override
    public String toString() {
        return "Empadronamiento{" +
                "año=" + año +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", numeroEmpadronados=" + numeroEmpadronados +
                '}';
    }
}
