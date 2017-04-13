/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Employee;
import model.Group;
import model.Person;
import model.Request;
import model.Resolution;
import model.Student;

/**
 *
 * @author Usuario
 */
public class School  {
    private static School INSTANCE = null;
    
    private DocumentGenerator docGenerator; 
    private EmployeesManager personsManager; 
    private RequestsManager requestsManager; 
    private PlansManager plansManager;
    private GroupsManager groupsManager;
    
    private School() {
        personsManager = new EmployeesManager();
        requestsManager = new RequestsManager();
        plansManager = new PlansManager();
        groupsManager = new GroupsManager();
    }
    
    public static synchronized School getInstance() {
        if(INSTANCE == null)
            INSTANCE = new School();
        
        return INSTANCE;
    }
   
    public void insertRequest(DTORequest req) {
        requestsManager.insert(req);
    }
    
    public void editRequest(DTORequest req) {
        requestsManager.edit(req);
    }
    
    public void deleteRequest(String id) {
        requestsManager.delete(id);
    }
    
    public Request selectRequest(String id) {
        return (Request) requestsManager.select(id);
    }
    
    public ArrayList<Object> selectPendingRequests() {
        return requestsManager.selectPendings();
    }
    
    public ArrayList<Object> selectCanceledRequests() {
        return requestsManager.selectCanceled();
    }
    
    public ArrayList<Object> selectProcessedRequests() {
        return requestsManager.selectProcessed();
    }
    
    public ArrayList<Object> selectAllRequests() {
        return requestsManager.selectAll();
    }
    
    public ArrayList<Request> viewRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
    
    
    
    public Group selectGroup(int groupNumber, String courseCode) {
        //Se juntan para enviarlo buscar, ya que para buscar se recibe un
        //solo parametro
        String toSearch = groupNumber + "-" + courseCode;
        
        return (Group) groupsManager.select(toSearch);
    }
    
    public ArrayList<Object> selectAllGroups() {
        return groupsManager.selectAll();
    }
    
    
    
    
    public void insertResolution(DTOResolution res){
        
    }
   
    
    public ArrayList<Resolution> createTop5Resolutions(){
        ArrayList<Resolution> resolutions = new ArrayList<Resolution>(); 
        return resolutions;
    }
    
    public ArrayList<Employee> createTop3Professors(){
        ArrayList<Employee> employees = new ArrayList<Employee>(); 
        return employees;
    }
    
    public boolean createDocument(EDocType docType){
        //we have to implement this
        return false; 
    }
}
