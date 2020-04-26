package Escenarios;

import Jugadores.Jugador;
import Jugadores.Patton;
import Obstáculos.Obstáculo;
import Obstáculos.Tanques;
import Villanos.Rommel;
import Villanos.Villano;

public class FactoryDesierto implements FactoryEscenario {
    @Override
    public Jugador crearJugador() {
        return new Patton();
    }

    @Override
    public Obstáculo crearObstáculo() {
        return new Tanques();
    }

    @Override
    public Villano crearVillano() {
        return new Rommel();
    }
}
