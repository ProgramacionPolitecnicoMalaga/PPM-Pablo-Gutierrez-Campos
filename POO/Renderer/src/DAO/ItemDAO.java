package DAO;

import Modelo.Item;

import java.util.ArrayList;

public interface ItemDAO {
    public void insertarItem(Item item);
    public ArrayList<Item> mostrarItem();
    public void eliminarItem(String autor);
}
