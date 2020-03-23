public abstract class PermiteEscribir extends Persona {
    public PermiteEscribir(String nombre) {
        super(nombre);
    }

    public abstract Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario);
}
