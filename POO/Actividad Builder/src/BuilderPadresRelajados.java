public class BuilderPadresRelajados implements InterfazBuilder{
    private Pack pack;

    public BuilderPadresRelajados() {
        pack = new Pack();
    }

    public Pack getPack() {
        return pack;
    }

    @Override
    public void desayuno() {
        pack.setDesayuno(true);
    }

    @Override
    public void almuerzo() {
        pack.setAlmuerzo(true);
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
        pack.setCamaAdicional(true);
    }

    @Override
    public void parqueDeAtracciones() {
        pack.setParqueDeAtracciones(false);
    }

    @Override
    public void cursoDeSurf() {
        pack.setCursoDeKiteSurf(true);
    }

    @Override
    public void actividadesInfantiles() {
        pack.setActividadesInfantiles(true);
    }

    @Override
    public void cineEnLaPlaya() {
        pack.setCineEnLaPlaya(true);
    }
}
