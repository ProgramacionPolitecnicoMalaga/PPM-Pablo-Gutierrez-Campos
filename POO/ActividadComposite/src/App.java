public class App {
    public static void main(String[] args) {
        Servicio servicioInicial = new Paquete("iLink", Servicio.ILINK);
        Builder builder = new Builder(servicioInicial);
        builder.crearPaquete("iLink1.1",Servicio.ILINK).crearPaquete("Rack1",20)
                .crearProducto("Servidor1",Servicio.SERVIDOR).crearProducto("Servidor2",Servicio.SERVIDOR)
                .cerrarRama().crearPaquete("Rack2",Servicio.RACK).crearProducto("Servidor3",Servicio.SERVIDOR)
                .cerrarRama().cerrarRama().crearPaquete("CloudSolutions",Servicio.CLOUD_SOLUTIONS).crearProducto("VPS",Servicio.VPS)
                .crearPaquete("Rack",Servicio.RACK).crearProducto("VPS",Servicio.VPS).crearProducto("VPS",Servicio.VPS)
                .cerrarRama().cerrarRama();

        System.out.println(servicioInicial.getPrecioFinal());



    }
}
