package DAO;

import Modelo.Mensaje;
import Modelo.Usuario;

import java.util.ArrayList;

public interface DAOMensaje {

    boolean insertarMensaje(Mensaje mensaje);
    Mensaje buscarMensaje(String emisor);
    ArrayList<Mensaje> mostrarMensajes();
}
