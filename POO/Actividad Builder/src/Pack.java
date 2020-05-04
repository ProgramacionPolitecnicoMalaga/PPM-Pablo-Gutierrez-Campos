public class Pack {
    private boolean desayuno;
    private boolean almuerzo;
    private boolean cena;
    private boolean camaAdicional;
    private boolean parqueDeAtracciones;
    private boolean cursoDeKiteSurf;
    private boolean actividadesInfantiles;
    private boolean cineEnLaPlaya;
    private TipoHabitacion habitacion;

    public Pack() {
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }

    public boolean isCena() {
        return cena;
    }

    public void setCena(boolean cena) {
        this.cena = cena;
    }

    public boolean isCamaAdicional() {
        return camaAdicional;
    }

    public void setCamaAdicional(boolean camaAdicional) {
        this.camaAdicional = camaAdicional;
    }

    public boolean isParqueDeAtracciones() {
        return parqueDeAtracciones;
    }

    public void setParqueDeAtracciones(boolean parqueDeAtracciones) {
        this.parqueDeAtracciones = parqueDeAtracciones;
    }

    public boolean isCursoDeKiteSurf() {
        return cursoDeKiteSurf;
    }

    public void setCursoDeKiteSurf(boolean cursoDeKiteSurf) {
        this.cursoDeKiteSurf = cursoDeKiteSurf;
    }

    public boolean isActividadesInfantiles() {
        return actividadesInfantiles;
    }

    public void setActividadesInfantiles(boolean actividadesInfantiles) {
        this.actividadesInfantiles = actividadesInfantiles;
    }

    public boolean isCineEnLaPlaya() {
        return cineEnLaPlaya;
    }

    public void setCineEnLaPlaya(boolean cineEnLaPlaya) {
        this.cineEnLaPlaya = cineEnLaPlaya;
    }

    public TipoHabitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(TipoHabitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Pack{" +
                "desayuno=" + desayuno +
                ", almuerzo=" + almuerzo +
                ", cena=" + cena +
                ", camaAdicional=" + camaAdicional +
                ", parqueDeAtracciones=" + parqueDeAtracciones +
                ", cursoDeKiteSurf=" + cursoDeKiteSurf +
                ", actividadesInfantiles=" + actividadesInfantiles +
                ", cineEnLaPlaya=" + cineEnLaPlaya +
                ", habitacion=" + habitacion +
                '}';
    }
}
