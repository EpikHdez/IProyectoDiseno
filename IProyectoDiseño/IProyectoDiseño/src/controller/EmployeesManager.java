/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Employee;


/**
 *
 * @author Usuario
 */
public final class EmployeesManager extends Manager {
    private DAOData data; 
    private ArrayList<Employee> employees; 

    public EmployeesManager(DAOData data) {
        this.data = data;
        this.employees = new ArrayList<>();
        readData();
    }
    
    public ArrayList<Employee> createTop3Professors(){
        ArrayList<Employee> employees = new ArrayList<Employee>(); 
        return employees;
    }

    @Override
    public void insert(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object select(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readData() {
        employees = data.readProfessors(); 
        data.printArrayEmployee(employees);
    }
}
