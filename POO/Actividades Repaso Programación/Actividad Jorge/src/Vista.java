import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public final static int NUEVOACTIVO = 1;
    public final static int NUEVOCLIENTE = 2;
    public final static int NUEVASOLICITUDFINANCIACION = 3;
    public final static int MOSTRARACTIVOSVENTA = 4;
    public final static int MOSTRARACTIVOSENALQUILER = 5;
    public final static int MOSTRARACTIVOSCERCANOS = 6;
    public final static int TERMINAR = 7;

    private Scanner lector;

    public Vista(){
        lector = new Scanner(System.in).useDelimiter("\n");
    }

    public int menuInicial(){
        System.out.println("Seleccciona una opción:\n" +
                "1- Introducir activo.\n" +
                "2- Introducir un cliente.\n" +
                "3- Solicitud de financiación.\n" +
                "4- Mostrar activos en venta\n" +
                "5- Mostrar activos en alquiler\n" +
                "6- Mostrar activos más cercanos\n" +
                "7- Terminar.");

        return lector.nextInt();
    }

    public String preguntarDireccion(){
        System.out.println("Introduce la dirección del activo");
        return lector.next();
    }

    public double preguntarPrecio(){
        System.out.println("Introduce el precio del activo");
        return lector.nextDouble();
    }

    public int preguntarVentaOAlquiler(){
        int aux;
        System.out.println("Selecciona el estado del activo:\n" +
                "1. En venta\n" +
                "2. En alquiler");
        aux = lector.nextInt();
        if (aux > 0 && aux < 3)
            return aux;
        else System.out.println("Opción incorrecta.");
        return preguntarVentaOAlquiler();
    }

    public String preguntarNombre(){
        System.out.println("Introduce el nombre del cliente");
        return lector.next();
    }
    public String preguntarApellidos(){
        System.out.println("Introduce los apellidos del cliente");
        return lector.next();
    }
    public String preguntarDNI(){
        System.out.println("Introduce el DNI del cliente");
        return lector.next();
    }

    public int preguntarCuotasTotales(){
        System.out.println("Introduce las cuotas totales de la financiación");
        return lector.nextInt();
    }

    public int preguntarCuotasRestantes(){
        System.out.println("Introduce las cuotas restante de la financiación");
        return lector.nextInt();
    }

    public double preguntarRadio(){
        System.out.println("Introduce el radio para los activos mas cercanos");
        return lector.nextDouble();
    }

    public Cliente preguntarCliente(){
        Cliente cliente = new Cliente(preguntarNombre(),preguntarApellidos(),preguntarDNI());
        return cliente;
    }

    public Financiación preguntarFinanciacion(){
        Financiación financiacion = new Financiación(preguntarCuotasTotales(),preguntarCuotasRestantes());
        return financiacion;
    }

    public void mostrarActivosEnVenta(ArrayList<Activo> ventas){
        if(!ventas.isEmpty()){
            for (Activo a : ventas) {
                System.out.println(ventas.indexOf(a) + ". " + a);
            }
        }else {
            System.out.println("No hay ningún dato");
        }

    }

    public void mostrarActivosEnAlquiler(ArrayList<Activo> alquiler){
        if(!alquiler.isEmpty()){
            for (Activo a : alquiler) {
                System.out.println(alquiler.indexOf(a) + ". " + a);
            }
        }else {
            System.out.println("No hay ningún dato");
        }

    }
}
