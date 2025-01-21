package com.example.layeredarchitecture.dao.custom.impl;


import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dto.CustomerDTO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        ArrayList<Customer> customerDTOS = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer();
            customer.setId(rst.getString("id"));
            customer.setName(rst.getString("name"));
            customer.setAddress(rst.getString("address"));
            customerDTOS.add(customer);
        }
        return customerDTOS;
    }

    @Override
    public void save(Customer entity) throws SQLException, ClassNotFoundException {
       SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",entity.getId(),entity.getName(),entity.getAddress());
    }

    @Override
    public void update(Customer entity) throws SQLException, ClassNotFoundException {
        SQLUtil.execute("");
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        SQLUtil.execute("DELETE FROM Customer WHERE id=?",id);
    }

    @Override
    public boolean exit(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("SELECT id FROM Customer WHERE id=?",id);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
       ResultSet rst=SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }

    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?");
        rst.next();
        Customer entity = new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"));
        return entity;
    }
}
