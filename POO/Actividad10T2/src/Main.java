public class Main {
    public static void main(String[] args) {
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete();

        Libro libro1 = new Libro(345235,"Hola", 1999);
        Libro libro2 = new Libro(345235,"Adios",9999);
        Revista revista1 = new Revista(34523, "df",2432,8);

        paquete1.add(libro1);
        paquete1.add(libro2);
        paquete1.add(revista1);

        paquete2.add(libro1);

        libro1.prestar();
        System.out.println(paquete1.getPaquete().toString());
        System.out.println(paquete2.getPaquete().toString());
    }
}
