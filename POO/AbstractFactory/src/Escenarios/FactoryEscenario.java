package Escenarios;

import Jugadores.Jugador;
import Obstáculos.Obstáculo;
import Villanos.Villano;

public interface FactoryEscenario {
    public Jugador crearJugador();
    public Obstáculo crearObstáculo();
    public Villano crearVillano();
}
