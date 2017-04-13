/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class FacadeCoordinator {
    private School school; 
    public void createRequest(DTORequest dtoRequest) throws IOException{
        school= School.getInstance();
        school.insertRequest(dtoRequest);
    }
    public void createResolution(){
    }
    public void viewRequestStadistics(){
    }
    public void Top5Resolutions(){
    }
    public void Top3Professors(){
    }
    public void createDocument(){
    }
}
