import Escenarios.FactoryEscenario;
import Jugadores.Jugador;
import Obstáculos.Obstáculo;
import Villanos.Villano;
import Vista.SelectorFactory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        SelectorFactory factory = new SelectorFactory();


        System.out.println("Introduzca un escenario");
        FactoryEscenario escenario = factory.elegirFactory(lector.next());
        Jugador jugador = escenario.crearJugador();
        Villano villano = escenario.crearVillano();
        Obstáculo obstáculo = escenario.crearObstáculo();
        System.out.println(jugador.obtenerJugador());
        System.out.println(villano.obtenerVillano());
        System.out.println(obstáculo.obtenerJugador());




    }
}
