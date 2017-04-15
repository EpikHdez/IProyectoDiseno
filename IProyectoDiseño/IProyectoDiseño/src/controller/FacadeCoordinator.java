/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.Course;
import model.Employee;
import model.Request;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class FacadeCoordinator {
    private School school; 

    public FacadeCoordinator() {
        school= School.getInstance();
    }
    
    public void createRequest(DTORequest dtoRequest) {
        school.insertRequest(dtoRequest);
    }
    public void createResolution(Resolution res,EDocType format ){
        school.setResolution(res,format);
    }
    public void viewRequestStadistics(){
    }
    public void Top5Resolutions(){
    }
    public void Top3Professors(){
    }
    public void createDocument(){
    }
    
    public ArrayList<Object> selectallGroups(){
        return school.selectAllGroups();
    }
    public ArrayList<Course> selectallCourses(){
        return school.selectAllCourses();
    }
    public ArrayList<Object> selectallRequest(){
        return school.selectAllRequests();
    }
    public Request selectRequest(String id){
        return school.selectRequest(id);
    }
    
    public ArrayList<Object> selectTypeRequest(int type){
        switch (type){
            case 0:
               return school.selectPendingRequests();
            case 1:
               return school.selectProcessedRequests();
            case 2:
               return school.selectCanceledRequests();
        
        }
                
        return null;
    }
    public void CancelRequest(String message){
        school.cancelRequest(message);
    }
    
    public Resolution createTemplateResolution() {
        return school.createTemplateResolution();
    }
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        return school.processedRequestsInDateRange(start, end);
    }
    
    public HashMap<Course,Integer> top5CoursesResolutionsByPeriod(String period){
        return school.top5CoursesResolutionsByPeriod(period);
    }
     public HashMap<Employee, Integer> top3ProfessorsResolutions() {
        return school.top3ProfessorsResolutions();
    }
}
