import java.util.Date;

public class Main {
    public static void main(String[] args) throws EventosException {
        Comprador comprador1 = new PersonaFisica("juan", "adasdasda", "ñladmadk");
        Comprador comprador2 = new PersonaJuridica("hola", "aksjd", "ñasdn");

        Aparcamiento aparcamiento1 = new Aparcamiento();

        aparcamiento1.añadirComprador(comprador2);


        Vehiculo vehiculo1 = new Camion(new Date(),new Date(),5,"caaaaa", 5.8,5.6,5.6);
        Vehiculo vehiculo2 = new Coche(new Date(),new Date(),9,"cooo", 7.8,5.6,5.6);
        Vehiculo vehiculo3 = new Barco(new Date(),new Date(),7,"bbbbbbb", 20.0,20,5.6);

        aparcamiento1.requisar(vehiculo1,new Date());
        aparcamiento1.subastar(vehiculo1,new Date());
        aparcamiento1.vender(vehiculo1,new Date(), comprador2);

        aparcamiento1.requisar(vehiculo2,new Date());

        aparcamiento1.requisar(vehiculo3,new Date());
        aparcamiento1.subastar(vehiculo3,new Date());
        aparcamiento1.vender(vehiculo3,new Date(), comprador1);

        System.out.println(aparcamiento1.listaEventos.toString());
        aparcamiento1.vender(vehiculo2,new Date(), comprador2);
        aparcamiento1.vender(vehiculo3,new Date(),comprador1);





    }
}
