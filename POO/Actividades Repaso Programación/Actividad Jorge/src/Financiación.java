public class Financiación {

    private EstadoFinanciacion estado;
    private int cuotasTotales;
    private int cuotasRestantes;
    private double precioCuota;

    public Financiación() {
        this.estado = EstadoFinanciacion.PENDIENTE;
    }

    public Financiación(int cuotasTotales, int cuotasRestantes) {
        this.cuotasTotales = cuotasTotales;
        this.cuotasRestantes = cuotasRestantes;
    }

    public EstadoFinanciacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoFinanciacion estado) {
        this.estado = estado;
    }

    public int getCuotasTotales() {
        return cuotasTotales;
    }

    public void setCuotasTotales(int cuotasTotales) {
        this.cuotasTotales = cuotasTotales;
    }

    public int getCuotasRestantes() {
        return cuotasRestantes;
    }

    public void setCuotasRestantes(int cuotasRestantes) {
        this.cuotasRestantes = cuotasRestantes;
    }

    public double getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(double precioCuota) {
        this.precioCuota = precioCuota;
    }

    @Override
    public String toString() {
        return "Financiación{" +
                "activo=" + estado +
                ", cuotasTotales=" + cuotasTotales +
                ", cuotasRestantes=" + cuotasRestantes +
                ", precioCuota=" + precioCuota +
                '}';
    }
}
