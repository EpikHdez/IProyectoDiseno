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
import model.Course;

/**
 *
 * @author Usuario
 */
public class FacadeCoordinator {
    private School school; 

    public FacadeCoordinator() {
        school= School.getInstance();
    }
    
    public void createRequest(DTORequest dtoRequest) throws IOException{
       
       
        school.insertRequest(dtoRequest);
    }
    public void createResolution(DTOResolution dtoResolution){
        school.insertResolution(dtoResolution);
    }
    public void viewRequestStadistics(){
    }
    public void Top5Resolutions(){
    }
    public void Top3Professors(){
    }
    public void createDocument(){
    }
    public DTOTemplate getTemplate(){
        return school.getTemplate();
    }
    
    public ArrayList<Object> selectallGroups(){
       
        return school.selectAllGroups();
    }
    public ArrayList<Course> selectallCourses(){
        return school.selectAllCourses();
    }
}
