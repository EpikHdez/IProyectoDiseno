/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Group;
import model.Person;
import model.Request;
import model.Student;

/**
 *
 * @author Usuario
 */
public class RequestsManager extends Manager{
    private ArrayList<Request> requests;
    private final DAORequest daoRequest;
    private Request currentRequest;
    
    public RequestsManager() {
        requests = new ArrayList();
        daoRequest = new DAORequest();
        currentRequest = null;
    }

    @Override
    public void insert(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Group group = School.getInstance().selectGroup(dto.getNumGroup(), dto.getCodCourse());
        Student student = new Student(dto.getIdStudent(), dto.getNameStudent(),
                                      dto.getEmail(), dto.getPhone());
        Person requester = new Person(dto.getId(), dto.getName(), "", "");
        
        currentRequest = new Request(dto.getDate(), dto.getDescription(), 
                                     dto.getInconsistence(), student, requester,
                                     group);
        
        requests.add(currentRequest);
    }

    @Override
    public void edit(Object parameter) {
        
    }

    @Override
    public void delete(String id) {
        
    }

    @Override
    public Object select(String id) {
        return null;
        
    }

    @Override
    public ArrayList<Object> selectAll() {
        return null;
        
    }
    
    
    
    
    public ArrayList<Request> createRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
}
