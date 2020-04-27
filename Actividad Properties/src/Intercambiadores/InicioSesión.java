package Intercambiadores;

import Algoritmos.MD5;
import DAO.ConsultaUsuario;
import DAO.DAOUsuario;
import Modelo.Usuario;

import java.security.NoSuchAlgorithmException;

public class InicioSesión {
    MD5 md5;
    DAOUsuario usuarioDAO;

    public InicioSesión() throws NoSuchAlgorithmException {
        md5 = new MD5();
        usuarioDAO = new ConsultaUsuario();
    }

    public boolean iniciarSesion(String nombreUsuario, String contraseña) throws NoSuchAlgorithmException {

        Usuario usuario = usuarioDAO.buscarUsuario(nombreUsuario);
        return md5.verificarHash(contraseña,usuario.getContraseña());

    }
}
