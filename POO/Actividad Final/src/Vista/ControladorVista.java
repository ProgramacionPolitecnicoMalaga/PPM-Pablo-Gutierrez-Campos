package Vista;

import Algoritmos.Encriptador;
import DAO.ConsultasUsuario;
import DAO.UsuarioDAO;

import Modelo.Usuario;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class ControladorVista implements ActionListener {
    private UsuarioDAO dao;
    private Vista vista;

    public ControladorVista(UsuarioDAO dao, Vista vista) {
        this.dao = dao;
        this.vista = vista;
        this.vista.cargarUsuarios(dao.cargarUsuarios());
    }

    public void crearDialogoRegistro() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DialogoRegistrar dialogo = new DialogoRegistrar(datos);
        String nombre = (String) datos.getDato("nombre");
        String clave = (String) datos.getDato("clave");
        String algoritmo = (String) datos.getDato("algoritmo");
        Encriptador encriptador = new Encriptador(clave, algoritmo);
        Usuario usuario = new Usuario(nombre,encriptador.generarHash(),algoritmo);
        dao.insertar(usuario);
        vista.cargarUsuarios(dao.cargarUsuarios());
    }

    public void crearDialogoValidar() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DialogoValidar dialogo = new DialogoValidar(datos);
        String nombre = (String) datos.getDato("nombre");
        Usuario usuario = dao.buscarUsuario(nombre);
        String clave = (String) datos.getDato("clave");
        String algoritmo = usuario.getAlgoritmo();
        Encriptador encriptador = new Encriptador(clave, algoritmo);
        boolean encriptado = encriptador.verificarClave(usuario.getContraseña());
        usuario.setEstaBloqueado(!encriptado);
        System.out.println(usuario.toString());
        System.out.println(encriptado);
        dao.actualizarDatos(usuario);
        vista.setLabelsPaneIcon(encriptado);
        vista.cargarDatosUsuario(usuario);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("registrar")) {
            try {
                crearDialogoRegistro();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("validar")) {
            try {
                crearDialogoValidar();
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        } else if (e.getActionCommand().equals("cargar")){
            Usuario usuario = dao.buscarUsuario(vista.selectedNombre());
            vista.cargarDatosUsuario(usuario);

        }
    }
}
