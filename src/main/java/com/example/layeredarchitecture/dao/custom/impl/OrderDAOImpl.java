package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    public boolean exitOrder(String orderId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);
        return stm.executeQuery().next();
    }

    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public void save(OrderDTO dto) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void update(OrderDTO dto) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {

    }

    @Override
    public boolean exit(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return "";
    }

    @Override
    public OrderDTO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
