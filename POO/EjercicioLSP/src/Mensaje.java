public class Mensaje {
    private int tipoMensaje;
    private String descripción;
    private Persona destinatario;

    public Mensaje(int tipoMensaje, String descripción, Persona destinatario) {
        this.tipoMensaje = tipoMensaje;
        this.descripción = descripción;
        this.destinatario = destinatario;
    }

    public int getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "tipoMensaje=" + tipoMensaje +
                ", descripción='" + descripción + '\'' +
                ", destinatario=" + destinatario +
                '}';
    }
}
