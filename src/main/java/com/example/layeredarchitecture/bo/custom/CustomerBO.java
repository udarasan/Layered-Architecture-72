package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    void deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;
    String generateNewID() throws SQLException, ClassNotFoundException;
    CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
}
