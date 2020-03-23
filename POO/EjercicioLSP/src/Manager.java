public class Manager extends PermiteEscribir {
    public Manager(String nombre) {
        super(nombre);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {
        Mensaje mensaje = null;

            try {
                if(tipoMensaje <=0 || tipoMensaje >= 4 ){
                throw new MensajesException("Tipo de mensaje incorrecto");
            } else {
                    mensaje = new Mensaje(tipoMensaje,texto,destinatario);
                }

        } catch (MensajesException e) {
                e.printStackTrace();
            }
            return mensaje;
    }
}
