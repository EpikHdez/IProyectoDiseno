/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Request;

/**
 *
 * @author Usuario
 */
public class RequestsManager extends Manager{
    private DAORequest daoRequest; 
    
    public ArrayList<Request> createRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
}
