package DAO;

import Modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class ConsultasUsuario implements UsuarioDAO {
    @Override
    public ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String querry = "SELECT * FROM registro";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
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
    public boolean insertar(Usuario u) {
        boolean registrado = false;

        try {
            Connection con = Conexion.conexionBD();
            String query = "INSERT INTO registro (usuario,contraseña, algoritmo,numerosIntentos,estaBloqueado)" + " VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, u.getNombre());
            stm.setString (2, u.getContraseña());
            stm.setString (3, u.getAlgoritmo());
            stm.setInt (4, 0);
            stm.setBoolean (5, false);
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
    public Usuario buscarUsuario(String nombre) {
        Usuario usuario = new Usuario();
        String querry = "SELECT * FROM registro WHERE usuario LIKE '%"+nombre+"%'";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                usuario.setNombre(rs.getString("usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
                usuario.setEstaBloqueado(rs.getBoolean("estaBloqueado"));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public void actualizarDatos(Usuario u) {

        try {
            int myInt = u.isEstaBloqueado() ? 1 : 0;
            Connection con = Conexion.conexionBD();
            String query = "update`registro` set `estaBloqueado` ='" + myInt +"'   where `usuario` = '"+u.getNombre()+"'";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    }

