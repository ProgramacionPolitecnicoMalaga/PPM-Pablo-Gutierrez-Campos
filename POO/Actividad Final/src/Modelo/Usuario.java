package Modelo;

public class Usuario {

    private String nombre,contraseña,algoritmo;
    private int numeroIntentos;
    private boolean estaBloqueado;

    public Usuario(String nombre, String contraseña, String algoritmo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.algoritmo = algoritmo;
        this.numeroIntentos = 0;
        this.estaBloqueado = false;
    }

    public Usuario() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public boolean isEstaBloqueado() {
        return estaBloqueado;
    }

    public void setEstaBloqueado(boolean estaBloqueado) {
        this.estaBloqueado = estaBloqueado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                ", numeroIntentos=" + numeroIntentos +
                ", estaBloqueado=" + estaBloqueado +
                '}';
    }
}
