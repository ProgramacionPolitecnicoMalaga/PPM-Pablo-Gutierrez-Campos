import java.util.ArrayList;

public class Paquete {
    private ArrayList<Publicacion> paquete;

    public Paquete(){
        paquete = new ArrayList<Publicacion>();
    }

    public ArrayList<Publicacion> getPaquete() {
        return paquete;
    }

    public void add(Publicacion p){
        paquete.add(p);
    }
}
