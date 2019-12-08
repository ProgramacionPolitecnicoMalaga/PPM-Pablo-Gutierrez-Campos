public class Trabajadores {
    public static void main(String[] args) {
        Empleados[] empleado = new Empleados[6];

        empleado[0] = new Asalariados("Pablo", "Gutiérrez", 800);
        empleado[1] = new PorHoras("Juan", "García", 80,10);
        empleado[2] = new Comisionados("Sergio", "Romero",800, 10,50 );
        empleado[3] = new Asalariados("Marta", "Gutiérrez", 700);
        empleado[4] = new PorHoras("Paco", "García", 60,10);
        empleado[5] = new Comisionados("Ana", "Romero",600, 7,50 );


        for(int i=0; i<empleado.length; i++ ){
            System.out.println(empleado[i].toString());
        }

        Almacen a = new Almacen();
        a.anadir(new Asalariados("Pablo", "Gutiérrez", 800));

    }

}
