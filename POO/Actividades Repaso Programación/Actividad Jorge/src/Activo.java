public class Activo {

    private int numeroHabitaciones;
    private double metrosCuadrados;
    private Dirección dirección;
    public boolean tieneAscensor;
    public EstadoActivo estado;
    public boolean ventaAlquiler;
    public double precio;

    public Activo(String direccion,double latitud, double longitud, int numeroHabitaciones, double metrosCuadrados, boolean tieneAscensor, EstadoActivo estado, double precio) {

        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.dirección = new Dirección(direccion,latitud,longitud);
        this.tieneAscensor = tieneAscensor;
        this.estado = estado;
        this.precio = precio;
    }

    public Activo(Dirección dirección, double precio) {
        this.dirección = dirección;
        this.precio = precio;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Dirección getDirección() {
        return dirección;
    }

    public void setDirección(Dirección dirección) {
        this.dirección = dirección;
    }

    public boolean isTieneAscensor() {
        return tieneAscensor;
    }

    public void setTieneAscensor(boolean tieneAscensor) {
        this.tieneAscensor = tieneAscensor;
    }

    public EstadoActivo getEstado() {
        return estado;
    }

    public void setEstado(EstadoActivo estado) {
        this.estado = estado;
    }

    public boolean isVentaAlquiler() {
        return ventaAlquiler;
    }

    public void setVentaAlquiler(boolean ventaAlquiler) {
        this.ventaAlquiler = ventaAlquiler;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return dirección.getDireccion();
    }


    public double getLatitud() {
        return dirección.getLatitud();
    }

    public double getLongitud() {
        return dirección.getLongitud();
    }


    @Override
    public String toString() {
        return "Activo{" +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", metrosCuadrados=" + metrosCuadrados +
                ", dirección=" + dirección +
                ", tieneAscensor=" + tieneAscensor +
                ", estado=" + estado +
                ", ventaAlquiler=" + ventaAlquiler +
                ", precio=" + precio +
                '}';
    }
}
