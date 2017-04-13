/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import static model.ERequestState.CANCELED;
import model.Group;
import model.Person;
import model.Request;
import model.Student;

/**
 *
 * @author Usuario
 */
public class RequestsManager extends Manager{
    private final DAORequest daoRequest;
    private Request currentRequest;
    
    public RequestsManager() {
        elements = new ArrayList();
        daoRequest = new DAORequest();
        currentRequest = null;
    }

    @Override
    public void insert(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Group group = School.getInstance().selectGroup(dto.getNumGroup(), dto.getCodCourse());
        Student student = new Student(dto.getIdStudent(), dto.getNameStudent(),
                                      dto.getEmail(), dto.getPhone());
        Person requester = new Person(dto.getRequesterId(), dto.getRequesterName(), "", "");
        
        currentRequest = new Request(dto.getDate(), dto.getDescription(), 
                                     dto.getInconsistence(), student, requester,
                                     group);
        
        elements.add(currentRequest);
    }

    @Override
    public void edit(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        
        for(Request r : elements) {
            if(dto.getRequestId() == r.getId()) {
                r.setRequestState(dto.getState());
                
                if(r.getRequestState() == CANCELED)
                    r.setNote(dto.getNote());
                
                return;
            }
        }
    }

    @Override
    public void delete(String id) {
        int iId = Integer.parseInt(id);
        
        for(Request r : requests) {
            if(iId == r.getId()) {
                requests.remove(r);
                
                return;
            }
        }
    }

    @Override
    public Object select(String id) {
        int iId = Integer.parseInt(id);
        
        for(Request r : requests) {
            if(iId == r.getId()) {
                return r;
            }
        }
        
        return null;
    }

    @Override
    public ArrayList<Object> selectAll() {
        return (ArrayList<Object>) requests;
    }
    
    
    
    
    public ArrayList<Request> createRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
}
