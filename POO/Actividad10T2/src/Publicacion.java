import java.util.Date;

public class Publicacion implements Prestable{

   private int codigo;
   private String titulo;
   private int anyoPublicacion;
   private boolean prestado;

    public Publicacion(int codigo, String titulo, int anyoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
        prestado = false;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", prestado=" + prestado +
                '}';
    }
}
