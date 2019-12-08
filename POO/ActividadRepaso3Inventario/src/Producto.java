import java.util.ArrayList;
import java.util.HashMap;

public class Producto {
    private String id;
    //HashMap<String,Componente> especificaciones;
     ArrayList<Componente> especificaciones;

     public Producto(String id){
         this.id = id;
         especificaciones = new ArrayList<>();
     }

     public ArrayList<Componente> getEspecificaciones(){
         return especificaciones;
     }
     public void setEspecificaciones(Componente especificacion){
         especificaciones.add(especificacion);
     }
}
