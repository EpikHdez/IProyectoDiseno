/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.ERequestState.*;
import model.Group;
import model.Person;
import model.Request;
import model.Student;

/**
 *
 * @author Usuario
 */
public class RequestsManager extends Manager {
   // private final DAOData daoRequest;
    private Request currentRequest;
    private DirectorResolution director;
    private DAORequest data; 
    
    public RequestsManager(DAORequest dao) {
        elements = new ArrayList();
        director = new DirectorResolution();
        data = dao; 
        currentRequest = null;
        readData();
    }

    @Override
    public void insert(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Group group = null;
        try {
            group = School.getInstance().selectGroup(dto.getNumGroup(), dto.getCodCourse());
        } catch (Exception ex) {
            Logger.getLogger(RequestsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        Request temp = new Request();
        temp.setId(dto.getRequestId());
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                temp = (Request) r;
                temp.setRequestState(dto.getState());
                
                if(temp.getRequestState() == CANCELED)
                    temp.setNote(dto.getNote());
                
                return;
            }
        }
    }

    @Override
    public void delete(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                elements.remove(r);
                
                return;
            }
        }
    }

    @Override
    public Object select(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                currentRequest = (Request) r;
                return r;
            }
        }
        
        return null;
    }
    
    public ArrayList<Object> selectPendings() {
        ArrayList<Object> pendings = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PENDING)
                pendings.add(r);
        }
        
        return pendings;
    }
    
    public ArrayList<Object> selectCanceled() {
        ArrayList<Object> canceled = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == CANCELED)
                canceled.add(r);
        }
        
        return canceled;
    }
    
    public ArrayList<Object> selectProcessed() {
        ArrayList<Object> processed = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PROCESSED)
                processed.add(r);
        }
        
        return processed;
    }

    @Override
    public ArrayList<Object> selectAll() {
        return elements;
    }
    
    public void insertResolution(DTOResolution res) {
        director.buildResolution(res.getConsiderations(), res.getIntro(), 
                res.getNotify(), res.getResolve(), res.getResult());
        currentRequest.setResolution(director.getResolution());
    }
    
    public ArrayList<Request> createRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }

    public DTOTemplate getTemplate(){
        Package pack = ResolutionBuilder.class.getPackage();
        String builder = String.format("%s.%sResolutionBuilder", pack.getName(), 
                                       currentRequest.getInconsistencie().name());
          try {
            ResolutionBuilder rb = (ResolutionBuilder) Class.forName(builder).newInstance();
            director.setResolutionBuilder(rb);
            return director.getTemplate();
          }
          catch(Exception ex) {}
          return null;
    }
          

    @Override
    public void readData() {
        ArrayList<Request> requests = data.readRequests(); 
        for (Request request : requests) {
            elements.add(request);
        }
        System.out.println(elements.toString());

    }
}
