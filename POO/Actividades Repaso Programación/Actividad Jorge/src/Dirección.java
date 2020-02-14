import java.util.ArrayList;

public class Dirección {
    private String direccion;
    private double latitud;
    private double longitud;

    public Dirección(String direccion, double latitud, double longitud) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Dirección(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double calcularDistancia(Dirección otraUbicación){
        double distanciaMínima = Double.MAX_VALUE;
        double theta = otraUbicación.getLongitud() - longitud;
        double distanciaActual = Math.sin(Math.toRadians(otraUbicación.getLatitud())) * Math.sin(Math.toRadians(latitud)) + Math.cos(Math.toRadians(otraUbicación.getLatitud())) * 	Math.cos(Math.toRadians(latitud)) * Math.cos(Math.toRadians(theta));
        distanciaActual = Math.acos(distanciaActual);
        distanciaActual = Math.toDegrees(distanciaActual);
        return Math.abs(distanciaActual * 60 * 1.853159616);
    }

    public ArrayList<Activo> obtenerActivosMasCercanos (ArrayList<Activo> activos,double radio){
        ArrayList<Activo> cercanos = new ArrayList<Activo>();

        for (Activo a: activos) {
            if(calcularDistancia(a.getDirección()) <= radio){
                cercanos.add(a);
            }
        }
        return cercanos;
    }

    @Override
    public String toString() {
        return "Dirección{" +
                "direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}

