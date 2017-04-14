/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Group;

/**
 *
 * @author ErickHdez
 */
public final class GroupsManager extends Manager {
    private ArrayList<Group> groups;
    private DAOData data; 

    public GroupsManager(DAOData data) {
        this.data = data;
        this.groups = new  ArrayList<>();
        readData();
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
        String[] parameters = id.split("-");
        int groupNumber = Integer.parseInt(parameters[0]);
        String codeCourse = parameters[1];
        
        for(Group g : groups) {
            if(g.getNumber() == groupNumber) {
                if (g.getCourse().getCode().equals(codeCourse))
                    return g;
            }
        }
        
        return null;
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
