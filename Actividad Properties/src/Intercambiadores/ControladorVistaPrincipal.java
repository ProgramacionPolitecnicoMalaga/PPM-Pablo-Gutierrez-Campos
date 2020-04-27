package Intercambiadores;

import DAO.ConsultaMensaje;
import DAO.ConsultaUsuario;
import DAO.DAOMensaje;
import DAO.DAOUsuario;
import Modelo.Mensaje;
import Modelo.Usuario;

import java.util.ArrayList;

public class ControladorVistaPrincipal {

    DAOMensaje daoMensaje;
    DAOUsuario daoUsuario;

    public ControladorVistaPrincipal() {
        daoMensaje = new ConsultaMensaje();
        daoUsuario = new ConsultaUsuario();
    }

    public ArrayList<Mensaje> getMensajes(){
        return daoMensaje.mostrarMensajes();
    }

    public Mensaje getMensaje(String emisor){
        return daoMensaje.buscarMensaje(emisor);
    }
    public Usuario getUsuario(String nombreUsuario){
        return daoUsuario.buscarUsuario(nombreUsuario);
    }

    public ArrayList<Usuario> getUsuarios(){
        return daoUsuario.cargarUsuarios();
    }

    public void insertarMensaje(Mensaje mensaje){
        daoMensaje.insertarMensaje(mensaje);
    }
}
