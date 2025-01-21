package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO <T> extends SuperDAO{
    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    public void save(T dto) throws SQLException, ClassNotFoundException;
    public void update(T dto) throws SQLException, ClassNotFoundException;
    public void delete(String id) throws SQLException, ClassNotFoundException;
    public boolean exit(String id) throws SQLException, ClassNotFoundException;
    public String generateNewID() throws SQLException, ClassNotFoundException;
    public T search(String id) throws SQLException, ClassNotFoundException;

}
