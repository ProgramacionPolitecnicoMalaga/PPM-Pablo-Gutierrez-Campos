public class BuilderRomance implements InterfazBuilder{
    private Pack pack;

    public BuilderRomance() {
        pack = new Pack();
    }

    public Pack getPack() {
        return pack;
    }

    @Override
    public void desayuno() {
        pack.setDesayuno(false);
    }

    @Override
    public void almuerzo() {
        pack.setAlmuerzo(false);
    }

    @Override
    public void cena() {
        pack.setCena(true);
    }

    @Override
    public void habitacion() {
        pack.setHabitacion(TipoHabitacion.DOBLE);
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
