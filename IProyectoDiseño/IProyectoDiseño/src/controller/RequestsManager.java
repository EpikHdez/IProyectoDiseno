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
        currentRequest = (Request) parameter;
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
