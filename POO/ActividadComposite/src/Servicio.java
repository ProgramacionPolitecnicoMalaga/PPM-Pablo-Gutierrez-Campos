public interface Servicio {

    //true va a ser paquete y false producto

    public final static int ILINK = 30;
    public final static int RACK = 20;
    public final static int SERVIDOR = 25;
    public final static int CLOUD_SOLUTIONS = 15;
    public final static int VPS = 20;


    public boolean getTipo();

    public void setPrecio(double precio);

    public double getPrecioFinal();


}
