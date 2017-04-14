/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import view.FrResolution;

/**
 *
 * @author Usuario
 */
public class UIResolution {
    private DTOResolution dtoResolution; 
    private FacadeCoordinator facade; 
    private ArrayList<String> considerations =new ArrayList<String>();

    public UIResolution() {
        facade=new FacadeCoordinator();
    }
   
    public void createResolution(FrResolution frResolution)
    {
        
        Date date = new Date();
        dtoResolution.setIntro(frResolution.getTxtintro().getText());
        dtoResolution.setNotify(frResolution.getTxtnotify().getText());
        dtoResolution.setResolve(frResolution.getTxtresolve().getText());
        dtoResolution.setResult(frResolution.getTxtresult().getText());
        dtoResolution.setConsiderations(considerations);
        dtoResolution.setDate(date);
        
        
        
        
        
    }
    public void getTemplate(FrResolution frResolution){
       dtoResolution=new DTOResolution();
       facade.getTemplate();
       frResolution.getTxtintro().setText(facade.getTemplate().getIntro());
       frResolution.getTxtconsider().setText(facade.getTemplate().getConsider());
       frResolution.getTxtnotify().setText(facade.getTemplate().getNotify());
       frResolution.getTxtresolve().setText(facade.getTemplate().getResolve());
       frResolution.getTxtresult().setText(facade.getTemplate().getResult());
       
       
    
    }
    public void addConsideration(FrResolution frResolution){
        considerations.add(frResolution.getTxtconsider().getText());                
    }
    public void constructResolution(FrResolution frResolution)
    {
        
        facade.createResolution(dtoResolution);
        
        
        
        
        
    }
}
