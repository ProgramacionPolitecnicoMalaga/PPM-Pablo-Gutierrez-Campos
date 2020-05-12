public class Builder {

    private Servicio servicio;
    private Builder builder;

    public Builder(Servicio servicio, Builder builder) {
        this.servicio = servicio;
        this.builder = builder;
    }

    public Builder(Servicio servicio) {
        this.servicio = servicio;
        builder = null;
    }

    public Builder crearPaquete(String nombre, double precio){
        Paquete paquete = new Paquete(nombre,precio);
        if (servicio.getTipo()){
            ((Paquete) servicio).añadirServicio(paquete);
        } else {
            System.out.println("Es un producto y no se puede añadir");
        }
        return new Builder(paquete,this);
    }

    public Builder crearProducto(String nombre, double precio){
        Producto producto = new Producto(nombre,precio);
        ((Paquete) servicio).añadirServicio(producto);

        return this;
    }

    public Builder cerrarRama(){
        return builder ;
    }
}
