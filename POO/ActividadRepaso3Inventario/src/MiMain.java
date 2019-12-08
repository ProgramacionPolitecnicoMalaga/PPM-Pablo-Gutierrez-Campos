import java.util.ArrayList;

public class MiMain {
    public static void main(String[] args) {


        /* Monitorizar la fabricación de productos, para que cada vez que se fabrica un nuevo producto se actualice
           el inventario de componentes. Tras fabricar un cierto producto, si quedan menos unidades de las necesarias
           para fabricar 10 productos, se debe generar un mensaje informando de la escasez de dicho componente. */


        Producto p1 = new Producto("P1");
        Producto p2 = new Producto("P2");

        p1.setEspecificaciones(new Componente("C1",7));
        p1.setEspecificaciones(new Componente("C2",10));
        p1.setEspecificaciones(new Componente("C3",4));

        Inventario inventario = new Inventario();
        Inventario.addExistencia(new Componente("C1",0),100);
        Inventario.addExistencia(new Componente("C2",0), 120);
        Inventario.addExistencia(new Componente("C3",0), 60);

       ArrayList<Componente> escasos = inventario.minimasExistencias(p1);
        while (escasos.size() == 0){
            inventario.contabilizarProducto(p1);
            escasos = inventario.minimasExistencias(p1);
        }


       /* Tras fabricar un cierto producto, si quedan menos unidades de las necesarias para fabricar 10 productos,
        se debe generar un mensaje informando de la escasez de dicho componente. */
        if (escasos.size() > 0)
            System.out.println("NO QUEDAN EXISTENCIAS DE LOS SIGUIENTES COMPONENTES");
        System.out.println(escasos);
        System.out.println(inventario);
    }
}
