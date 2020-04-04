package DAO;
import Modelo.Usuario;

import java.util.ArrayList;

public interface UsuarioDAO {
    ArrayList<Usuario> cargarUsuarios();
    boolean insertar(Usuario usuario);
    Usuario buscarUsuario(String nick);
    void actualizarDatos(Usuario usuario);
}