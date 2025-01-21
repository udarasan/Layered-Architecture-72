package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemBOImpl {
    ItemDAOImpl itemDAO = new ItemDAOImpl();
    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }


    @Override
    public void save(ItemDTO item) throws SQLException, ClassNotFoundException {
        itemDAO.save(item);
    }

    @Override
    public void update(ItemDTO itemDTO) throws SQLException,ClassNotFoundException{
        itemDAO.update(itemDTO);

    }
    public void delete(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    @Override
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        return null;
    }
    @Override
    public boolean exit(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exit(code);
    }
    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewID();
    }
}
