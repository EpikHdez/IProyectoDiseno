/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import model.EInconsistencie;
import model.ERequestState;
import view.FrRequest;



/**
 *
 * @author Usuario
 */
public class UIRequest {
    private FacadeCoordinator facade; 
    private DTORequest dtoRequest; 

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
        facade= new FacadeCoordinator();
        dtoRequest.setCodCourse(frrequest.getCbcourse().getSelectedItem().toString());
        dtoRequest.setDate(date);
        dtoRequest.setDescription(frrequest.getTxtdescription().getText());
        dtoRequest.setEmail(frrequest.getTxtemail().getText());
        dtoRequest.setIdStudent(frrequest.getTxtcarne().getText());
        dtoRequest.setInconsistence(EInconsistencie.values()[frrequest.getCbcategory().getSelectedIndex()]);
        System.out.println(dtoRequest.getInconsistence());
        dtoRequest.setNameStudent(frrequest.getTxtname().getText());
        dtoRequest.setNumGroup(Integer.parseInt(frrequest.getCbgroup().getSelectedItem().toString()));
        dtoRequest.setPeriod(frrequest.getTxtperiod().getText());
        dtoRequest.setPhone(frrequest.getTxtphone().getText());
        dtoRequest.setState(ERequestState.PENDING);
      
        
        facade.createRequest(dtoRequest);
        
    }
    
}
