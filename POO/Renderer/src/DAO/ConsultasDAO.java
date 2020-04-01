package DAO;

import Modelo.Item;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConsultasDAO implements ItemDAO {

    @Override
    public void insertarItem(Item item) {
        try {
            Connection con = Conexion.conexionBD();
            String query = " INSERT INTO Item (autor,fecha,texto,tema)" + " VALUES (?, ?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, item.getAutor());
            stm.setDate   (2, Date.valueOf(item.getFecha()));
            stm.setString(3, item.getTexto());
            stm.setString(4, item.getTema());
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Item> mostrarItem() {
        ArrayList<Item> items = new ArrayList<>();

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Item");
            while (rs.next()) {
                Item item = new Item();
                item.setAutor(rs.getString("autor"));
                item.setFecha(LocalDate.parse(rs.getString("fecha")));
                item.setTexto(rs.getString("texto"));
                item.setTema(rs.getString("tema"));
                items.add(item);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void eliminarItem(String autor) {

        String consultaSql = "DELETE FROM Item WHERE autor = '"+autor+"'";

        try {
            Connection  con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            stm.execute(consultaSql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
