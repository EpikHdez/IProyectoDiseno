/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Resolution;
import view.FrResolution;

/**
 *
 * @author Usuario
 */
public class UIResolution {
    private Resolution r; 
    private FacadeCoordinator facade; 


    public UIResolution() {
        facade=new FacadeCoordinator();
    }
   
    public void createResolution(FrResolution frResolution,EDocType format)
    {
        
     
        r.setIntro(frResolution.getTxtintro().getText());
        r.setNotify(frResolution.getTxtnotify().getText());
        r.setResolve(frResolution.getTxtresolve().getText());
        r.setResult(frResolution.getTxtresult().getText());
        r.setConsider(frResolution.getTxtconsider().getText());
       
        facade.createResolution(r,format);
        JOptionPane.showMessageDialog(frResolution, "Se ha creado una Resolución con Éxito.");
    }
    
 
  
    public void createTemplateResolution(FrResolution frResolution) {
      r=facade.createTemplateResolution();
       frResolution.getTxtintro().setText(r.getIntro());
       frResolution.getTxtnotify().setText(r.getNotify());
       frResolution.getTxtresolve().setText(r.getResolve());
       frResolution.getTxtresult().setText(r.getResult());
       frResolution.getTxtconsider().setText(r.getConsider());
    }
}
