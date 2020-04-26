package Escenarios;

import Jugadores.Indiana;
import Jugadores.Jugador;
import Obstáculos.CarceleroTurco;
import Obstáculos.Obstáculo;
import Villanos.Molaram;
import Villanos.Villano;

public class FactorySelva implements FactoryEscenario {
    @Override
    public Jugador crearJugador() {
        return new Indiana();
    }

    @Override
    public Obstáculo crearObstáculo() {
        return new CarceleroTurco();
    }

    @Override
    public Villano crearVillano() {
        return new Molaram();
    }
}
