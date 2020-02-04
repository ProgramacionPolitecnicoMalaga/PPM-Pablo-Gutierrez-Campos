import java.util.Date;
import java.util.Objects;

public class Tarea {

    private Date fechaLimite;
    private boolean completado;

    public Tarea(Date fechaLimite, boolean completado) {
        this.fechaLimite = fechaLimite;
        this.completado = completado;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }


    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(completado, tarea.completado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completado);
    }



    @Override
    public String toString() {
        return "Tarea{" +
                "fechaLimite=" + fechaLimite +
                ", estadoTarea='" + completado + '\'' +
                '}';
    }
}

