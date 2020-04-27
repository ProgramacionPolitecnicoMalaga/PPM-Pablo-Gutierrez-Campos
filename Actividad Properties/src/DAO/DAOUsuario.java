package DAO;

import Modelo.Usuario;

import java.util.ArrayList;

public interface DAOUsuario {
    ArrayList<Usuario> cargarUsuarios();
    boolean insertar(Usuario usuario);
    Usuario buscarUsuario(String usuario);

}
