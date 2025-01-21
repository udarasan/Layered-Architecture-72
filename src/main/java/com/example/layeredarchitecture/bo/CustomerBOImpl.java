package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl {
    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        customerDAO.save(customerDTO);
    }

    @Override
    public void update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
    CustomerDAOImpl customerDAO = new CustomerDAOImpl();
    customerDAO.update(customerDTO);
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        customerDAO.delete(id);
    }

    @Override
    public boolean exit(String id) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.exit(id);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewID();
    }

    @Override
    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        return customerDAO.search(id);
    }
}
