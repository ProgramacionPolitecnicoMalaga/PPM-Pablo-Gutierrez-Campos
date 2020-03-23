public class Participante extends PermiteEscribir {
    public Participante(String nombre) {
        super(nombre);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {// 1 es tarea, 2 notificacion y 3 lectura
        Mensaje mensaje = null;
        try {
            if (tipoMensaje <=0 || tipoMensaje >= 4 ) {
                throw new MensajesException("El tipo de mensaje no es correcto.");

            } else if (tipoMensaje == 1) {
                throw new MensajesException("El usuario no está autorizado a escribir una tarea");

            }
            else {
                mensaje = new Mensaje(tipoMensaje,texto,destinatario);
            }
        } catch (MensajesException e) {
            e.printStackTrace();
        }
        return mensaje;
    }
}
