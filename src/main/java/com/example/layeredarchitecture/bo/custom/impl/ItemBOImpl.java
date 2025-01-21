package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.ItemBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    ItemDAOImpl itemDAO =
            (ItemDAOImpl) DAOFactory.getInstance()
                    .getDAO(DAOFactory.DAOType.ITEM);
    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }


    @Override
    public void saveItem(ItemDTO item) throws SQLException, ClassNotFoundException {
        itemDAO.save(item);
    }

    @Override
    public void updateItem(ItemDTO itemDTO) throws SQLException,ClassNotFoundException{
        itemDAO.update(itemDTO);

    }
    public void deleteItem(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    @Override
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        return null;
    }
    @Override
    public boolean exitItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exit(code);
    }
    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewID();
    }
}
