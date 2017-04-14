/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.EInconsistencie;
import model.ERequestState;
import view.FrRequest;
import model.Group;


/**
 *
 * @author Usuario
 */
public class UIRequest {
    private FacadeCoordinator facade; 
    private DTORequest dtoRequest; 

    public UIRequest() {
         facade= new FacadeCoordinator();
    }

    public FacadeCoordinator getFacade() {
        return facade;
    }

    public void setFacade(FacadeCoordinator facade) {
        this.facade = facade;
    }

    public DTORequest getDtoRequest() {
        return dtoRequest;
    }

    public void setDtoRequest(DTORequest dtoRequest) {
        this.dtoRequest = dtoRequest;
    }
 
    public void createRequest(FrRequest frrequest){
        Date date = new Date();
        dtoRequest=new DTORequest();
       
        dtoRequest.setCodCourse(frrequest.getCbcourse().getSelectedItem().toString());
        dtoRequest.setDate(date);
        dtoRequest.setDescription(frrequest.getTxtdescription().getText());
        dtoRequest.setEmail(frrequest.getTxtemail().getText());
        dtoRequest.setIdStudent(frrequest.getTxtcarne().getText());
        dtoRequest.setInconsistence(EInconsistencie.values()[frrequest.getCbcategory().getSelectedIndex()]);

        dtoRequest.setNameStudent(frrequest.getTxtname().getText());
        dtoRequest.setNumGroup(Integer.parseInt(frrequest.getCbgroup().getSelectedItem().toString()));
        dtoRequest.setPeriod(frrequest.getTxtperiod().getText());
        dtoRequest.setPhone(frrequest.getTxtphone().getText());
        dtoRequest.setState(ERequestState.PENDING);
      
        
        try {
            facade.createRequest(dtoRequest);
        } catch (IOException ex) {
            Logger.getLogger(UIRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void setallGroups(FrRequest frrequest){
        int i=0;
        for(Object o:facade.selectallGroups()){
            ((Group)o).getNumber();
            frrequest.getCbgroup().insertItemAt(Integer.toString(((Group)o).getNumber()), i);
            i++;
        };
    }
    public void setallCourses(FrRequest frrequest){
        int i=0;
        for(Course c:facade.selectallCourses()){
            c.getCode();
            frrequest.getCbcourse().insertItemAt(c.getCode()+" "+c.getName(), i);
            i++;
        };
    }
    
}
