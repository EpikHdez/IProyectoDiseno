/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Employee;
import model.Request;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class School  {
    private DocumentGenerator docGenerator; 
    private EmployeesManager employeeManager; 
    private RequestsManager requestManager; 
   
    
    public void createRequest(DTORequest req){
    
    }
    
    public void createResolution(DTOResolution res){
    
    }
    
    public ArrayList<Request> viewRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
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
