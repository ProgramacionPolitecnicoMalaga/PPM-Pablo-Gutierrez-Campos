import java.util.ArrayList;
import java.util.Objects;

public class Categoria {

    private TipoCategoria tipo;
    ArrayList<Tarea> tareas;

    public Categoria(TipoCategoria tipo) {
        this.tipo = tipo;
        tareas = new ArrayList<Tarea>();
    }

    public TipoCategoria getTipo() {
        return tipo;
    }

    public void setTipo(TipoCategoria tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return tipo == categoria.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "tipo='" + tipo + '\'' +
                ", tarea=" + tareas +
                '}';
    }
}
