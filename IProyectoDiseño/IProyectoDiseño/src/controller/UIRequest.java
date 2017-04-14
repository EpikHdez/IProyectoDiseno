/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.EInconsistencie;
import model.ERequestState;
import view.FrRequest;
import model.Group;
import model.Request;
import view.FrViewRequest;


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
        dtoRequest.setPeriod(frrequest.getCbperiod().getSelectedItem().toString());
        dtoRequest.setPhone(frrequest.getTxtphone().getText());
        dtoRequest.setState(ERequestState.PENDING);
        dtoRequest.setRequesterId(frrequest.getTxtidr().getText());
        dtoRequest.setRequesterName(frrequest.getTxtnamer().getText());
        facade.createRequest(dtoRequest);
    }
    
    public void setallGroups(FrRequest frrequest){
        int i=0;
        frrequest.getCbgroup().removeAllItems();
        for(Object o:facade.selectallGroups()){
            String coursegroup=((Group)o).getCourse().getCode();
            String course=frrequest.getCbcourse().getSelectedItem().toString();
            if (course.equals(coursegroup)){
               
                frrequest.getLbNameCourse().setText(((Group)o).getCourse().getName());
                frrequest.getCbgroup().insertItemAt(Integer.toString(((Group)o).getNumber()), i);
                i++;}
        };
    }
    public void setallCourses(FrRequest frrequest){
        int i=0;
        for(Course c:facade.selectallCourses()){
            c.getCode();
            frrequest.getCbcourse().insertItemAt(c.getCode(), i);
            i++;
        };
    }
    public void setallPeriods(FrRequest frrequest){
        int i=0;
        ArrayList<String>periods=new ArrayList<String>();
        for(Object o:facade.selectallGroups()){
            if(!periods.contains(((Group)o).getPeriod())){
            frrequest.getCbperiod().insertItemAt(((Group)o).getPeriod(), i);  
            periods.add(((Group)o).getPeriod());
            i++;
            }
        
    }
    }
    public void setallRequest(FrViewRequest frviewrequest){
        
        int i=0;
        if(frviewrequest.getCdRequest().getItemCount()!=0){
            frviewrequest.getCdRequest().removeAllItems();
        }
        for (Object o:facade.selectTypeRequest(frviewrequest.getCbtyperequest().getSelectedIndex())){
            frviewrequest.getCdRequest().insertItemAt(Integer.toString(((Request)o).getId()), i);
            i++;
        }
        if (frviewrequest.getCbtyperequest().getSelectedIndex()!=0){
            frviewrequest.getLbmotivo().setVisible(false);
            frviewrequest.getBtncancel().setVisible(false);
            frviewrequest.getTxtMotivo().setVisible(false);
            frviewrequest.getSpmotivo().setVisible(false);
        }
        else {
            frviewrequest.getLbmotivo().setVisible(true);
            frviewrequest.getBtncancel().setVisible(true);
            frviewrequest.getTxtMotivo().setVisible(true);
             frviewrequest.getSpmotivo().setVisible(true);
        }
            
            
    }
     public void setRequest(FrViewRequest frviewrequest){
       if(frviewrequest.getCdRequest().getItemCount()!=0){
            Request r=facade.selectRequest(frviewrequest.getCdRequest().getSelectedItem().toString());
            frviewrequest.getLbCategory().setText(r.getInconsistencie().toString());
            frviewrequest.getLbcarne().setText(r.getAffected().getId());
            frviewrequest.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
            frviewrequest.getLbdescription().setText(r.getDescription());
            frviewrequest.getLbemail().setText(r.getAffected().getEmail());
            frviewrequest.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
            frviewrequest.getLbname().setText(r.getAffected().getName());
            frviewrequest.getLbperiod().setText(r.getGroup().getPeriod());
            frviewrequest.getLbphone().setText(r.getAffected().getPhone());
            frviewrequest.getLbnamer().setText(r.getRequester().getName());
            frviewrequest.getLbcarner().setText(r.getRequester().getId());
       }
            
    }
    
    
}
