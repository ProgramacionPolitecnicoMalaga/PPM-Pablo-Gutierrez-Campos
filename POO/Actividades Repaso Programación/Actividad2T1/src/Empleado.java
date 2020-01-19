import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String apellidos;
    private ArrayList<Ventas> numeroDeVentas;

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        numeroDeVentas = new ArrayList<Ventas>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Ventas> getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(ArrayList<Ventas> numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public void buscarNumeroItems(Integer numeroItems){
        for(int i =0; i < numeroDeVentas.size(); i++ ){
           if (numeroDeVentas.get(i).getNumeroDeItems() == numeroItems){
               System.out.println("Los empleados que vendieron" + numeroItems + "fueron" + getNombre());
           } else {
               System.out.println("Introduce otro número");
           }
        }
    }

    public double promedioDeVentas(){

        double promedio = 0;

        System.out.println("Promedio de ventas:");
        for (Ventas v: numeroDeVentas) {
            promedio +=  v.getNumeroDeItems();


            System.out.println(getNombre()+promedio);
        } return  promedio/numeroDeVentas.size();
    }

    public void mejorVendedor(){
        int mayor = 0;

       for (int i = 0; i < numeroDeVentas.size(); i++){
           int numeroVentas = numeroDeVentas.get(i).getNumeroDeItems();
           if((numeroVentas) > mayor){
               mayor = numeroVentas;
           }
       }

    }



}
