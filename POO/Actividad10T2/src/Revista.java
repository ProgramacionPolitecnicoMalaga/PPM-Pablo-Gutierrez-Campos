import java.util.Date;

public class Revista extends Publicacion {
    private int numeroEjemplar;
    public Revista(int codigo, String titulo,int anyoPublicacion, int numeroEjemplar) {
        super(codigo, titulo, anyoPublicacion);
        this.numeroEjemplar = numeroEjemplar;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }


}
