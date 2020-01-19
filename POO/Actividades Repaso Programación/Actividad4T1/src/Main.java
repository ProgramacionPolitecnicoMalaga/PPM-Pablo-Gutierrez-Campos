import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner lectorTeclado = new Scanner(System.in);
    double cateto1 = 0,cateto2 = 0,hipotenusa = 0;
    int opcionElegida = -1;
    int operacionElegida;
    String unidad1 = "mm";
    String unidad2 = "cm";
    String unidad3 = "m";
    String unidadElegida = "";

        System.out.println("¿Qué unidad desea utilizar?\n" +
                "1. mm\n" +
                "2. cm\n" +
                "3. m\n" +
                "Introduzca una opción:");

    opcionElegida = lectorTeclado.nextInt();

    switch(opcionElegida){
                     case 1:  unidadElegida=unidad1;
                              break;
                     case 2:  unidadElegida=unidad2;
                              break;
                     case 3:  unidadElegida=unidad3;
                              break;
        default:
            System.out.println("No válido");
        }

        System.out.println("Que operación desea realizar? \n"
                + "1. Calcular la hipotenusa de un triángulo a partir de sus catetos. \n"
                + "2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa. \n"
                + "3. Calcular el área de un triángulo a partir un cateto y la hipotenusa- \n"
                + "4. Calcular el área de un triángulo a partir de dos catetos.\n"
                + "Elige una opción: \n");

    operacionElegida = lectorTeclado.nextInt();
    Scanner catetoPrimero = new Scanner(System.in);
    Scanner catetoSegundo = new Scanner(System.in);
    Scanner hipotenusa2 = new Scanner(System.in);

    switch (operacionElegida){
        case 1:  System.out.println("Introduce el primer cateto");
            cateto1 = catetoPrimero.nextDouble();
            System.out.println("Introduce el segundo cateto");
            cateto2 = catetoSegundo.nextDouble();
            hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            System.out.println("La hipotenusa es " + hipotenusa + unidadElegida);
            break;

        case 2:   System.out.println("Introduce un cateto");
            cateto1 = catetoPrimero.nextDouble();
            System.out.println("Introduce la hipotenusa");
            hipotenusa = hipotenusa2.nextDouble();
            cateto2 = Math.sqrt(Math.pow(hipotenusa,2)- Math.pow(cateto1,2));
            System.out.println("El valor del cateto calculado es " + cateto2 + unidadElegida);
            break;
        case 3:  System.out.println("Introduce un cateto");
            cateto1 = catetoPrimero.nextDouble();
            System.out.println("Introduce la hipotenusa");
            hipotenusa = hipotenusa2.nextDouble();
            System.out.println("El área es" + (cateto1*hipotenusa)/2 + "" +unidadElegida + " cuadrados");
            break;
        case 4:  System.out.println("Introduce el primer cateto");
            cateto1 = catetoPrimero.nextDouble();
            System.out.println("Introduce el segundo cateto");
            cateto2 = catetoSegundo.nextDouble();
            System.out.println("El área es " +  (cateto1*cateto2)/2 + "" + unidadElegida + " cuadrados" );
            break;

        default:  System.out.println("Elige otra operación");
    }

}
}