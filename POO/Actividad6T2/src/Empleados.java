public abstract class Empleados {
    String nombre;
    String apellidos;


    public Empleados(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    public abstract double getSueldo();



}
