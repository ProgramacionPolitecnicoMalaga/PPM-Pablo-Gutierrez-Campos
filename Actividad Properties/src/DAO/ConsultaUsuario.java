package DAO;

import Modelo.Mensaje;
import Modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class ConsultaUsuario implements DAOUsuario {
    @Override
    public ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        String consulta = "SELECT * FROM usuarios ";

        try {
            Connection con = (Connection) Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(Integer.parseInt(rs.getString("id")));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuarios.add(usuario);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }


    @Override
    public boolean insertar(Usuario usuario) {
        boolean registrado = false;

        try {
            Connection con = (Connection) Conexion.conexionBD();
            String query = "INSERT INTO usuarios (id,usuario,contraseña)" + " VALUES (?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, String.valueOf(usuario.getId()));
            stm.setString (2, usuario.getUsuario());
            stm.setString (3, usuario.getContraseña());


            registrado = true;
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Usuario buscarUsuario(String usuario) {
        Usuario usuario1 = new Usuario();
        String consulta = "SELECT * FROM usuarios WHERE usuario LIKE '%"+usuario+"%'";

        try {
            Connection con = (Connection) Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while (rs.next()) {
                usuario1.setId(Integer.parseInt(rs.getString("id")));
                usuario1.setUsuario(rs.getString("usuario"));
                usuario1.setContraseña(rs.getString("contraseña"));


            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario1;
    }

}
