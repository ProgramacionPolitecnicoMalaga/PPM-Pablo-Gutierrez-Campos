public class BuilderDeluxeFamiliar implements InterfazBuilder{
    private Pack pack;

    public BuilderDeluxeFamiliar() {
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
        pack.setHabitacion(TipoHabitacion.SUITE);
    }

    @Override
    public void camaAdicional() {
        pack.setCamaAdicional(true);
    }

    @Override
    public void parqueDeAtracciones() {
        pack.setParqueDeAtracciones(true);
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
