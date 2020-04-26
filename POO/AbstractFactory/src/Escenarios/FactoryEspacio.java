package Escenarios;

import Jugadores.Jugador;
import Jugadores.USSEnterprise;
import Obstáculos.NavesKlingon;
import Obstáculos.Obstáculo;
import Villanos.Khan;
import Villanos.Villano;

public class FactoryEspacio implements FactoryEscenario {
    @Override
    public Jugador crearJugador() {
        return new USSEnterprise();
    }

    @Override
    public Obstáculo crearObstáculo() {
        return new NavesKlingon();
    }

    @Override
    public Villano crearVillano() {
        return new Khan();
    }
}
