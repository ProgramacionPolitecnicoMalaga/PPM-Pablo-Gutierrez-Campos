public class BuilderBásico implements InterfazBuilder{
    private Pack pack;

    public BuilderBásico() {
        pack = new Pack();
    }
    @Override
    public Pack getPack() {
        return pack;
    }

    @Override
    public void desayuno() {
        pack.setDesayuno(true);
    }

    @Override
    public void almuerzo() {
        pack.setAlmuerzo(false);
    }

    @Override
    public void cena() {
        pack.setCena(false);
    }

    @Override
    public void habitacion() {
        pack.setHabitacion(TipoHabitacion.SIMPLE);
    }

    @Override
    public void camaAdicional() {
        pack.setCamaAdicional(false);
    }

    @Override
    public void parqueDeAtracciones() {
        pack.setParqueDeAtracciones(false);
    }

    @Override
    public void cursoDeSurf() {
        pack.setCursoDeKiteSurf(false);
    }

    @Override
    public void actividadesInfantiles() {
        pack.setActividadesInfantiles(false);
    }

    @Override
    public void cineEnLaPlaya() {
        pack.setCineEnLaPlaya(false);
    }
}
