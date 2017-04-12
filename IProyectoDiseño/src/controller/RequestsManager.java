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
    
    public RequestsManager() {
        requests = new ArrayList();
        daoRequest = new DAORequest();
    }

    @Override
    public void insert(Object parameter) throws Exception{
        if(!(parameter instanceof DTORequest))
            throw new IllegalArgumentException("El parametro no es una instancia de solicitud.");
        
        DTORequest dto = (DTORequest) parameter;
        
        
        
        requests.add((Request) parameter);
    }

    @Override
    public void edit(Object parameter) {
        
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object select(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    public ArrayList<Request> createRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
}
