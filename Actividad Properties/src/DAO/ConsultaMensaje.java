package DAO;

import Modelo.Mensaje;
import Modelo.Usuario;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConsultaMensaje implements DAOMensaje{



    @Override
    public boolean insertarMensaje(Mensaje mensaje) {
        boolean registrado = false;

        try {
            Connection con = (Connection) Conexion.conexionBD();
            String query = "INSERT INTO mensajes (id,titulo, cuerpo,emisor,receptor,fecha,id_usuario)" + " VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, String.valueOf(mensaje.getId()));
            stm.setString (2, mensaje.getTitulo());
            stm.setString (3, mensaje.getCuerpo());
            stm.setString (4, mensaje.getEmisor());
            stm.setString (5, mensaje.getReceptor());
            stm.setString (6, String.valueOf(mensaje.getFecha()));
            stm.setString (7, String.valueOf(mensaje.getId_usuario()));

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
    public Mensaje buscarMensaje(String emisor) {
        Mensaje mensaje = new Mensaje();
        String consulta = "SELECT * FROM mensajes WHERE emisor LIKE '%"+emisor+"%'";

        try {
            Connection con = (Connection) Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while (rs.next()) {
                mensaje.setId(Integer.parseInt(rs.getString("id")));
                mensaje.setTitulo(rs.getString("titulo"));
                mensaje.setCuerpo(rs.getString("cuerpo"));
                mensaje.setEmisor(rs.getString("emisor"));
                mensaje.setReceptor(rs.getString("receptor"));
                System.out.println(rs.getString("fecha") + "1111111111111111111111111");
                mensaje.setFecha(LocalDate.parse(rs.getString("fecha")));
                mensaje.setId_usuario(Integer.parseInt(rs.getString("id_usuario")));

            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mensaje;
    }

    @Override
    public ArrayList<Mensaje> mostrarMensajes() {
        ArrayList<Mensaje> mensajes = new ArrayList<>();

        String consulta = "SELECT * FROM mensajes ";

        try {
            Connection con = (Connection) Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while (rs.next()) {
                Mensaje mensaje = new Mensaje();
                mensaje.setId(Integer.parseInt(rs.getString("id")));
                mensaje.setTitulo(rs.getString("titulo"));
                mensaje.setCuerpo(rs.getString("cuerpo"));
                mensaje.setEmisor(rs.getString("emisor"));
                mensaje.setReceptor(rs.getString("receptor"));
                mensaje.setFecha(LocalDate.parse(rs.getString("fecha")));
                mensaje.setId_usuario(Integer.parseInt(rs.getString("id_usuario")));
                mensajes.add(mensaje);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mensajes;
    }
}
