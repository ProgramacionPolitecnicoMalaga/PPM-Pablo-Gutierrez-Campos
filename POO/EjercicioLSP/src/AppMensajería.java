import java.util.ArrayList;

public class AppMensajería {
    private ArrayList<Persona> personas;
    private ArrayList<Mensaje> mensajes;

    public AppMensajería() {
        personas = new ArrayList<Persona>();
        mensajes = new ArrayList<Mensaje>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void añadirPersona(Persona p){
        personas.add(p);
    }

    public void añadirMensaje(Mensaje m){
        mensajes.add(m);
    }
    @Override
    public String toString() {
        return "AppMensajería{" +
                "personas=" + personas +
                ", mensajes=" + mensajes +
                '}';
    }
}
