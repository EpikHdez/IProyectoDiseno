/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class DirectorResolution {
    private ResolutionBuilder resolutionBuilder; 
    
    public void setResolutionBuilder(ResolutionBuilder rs){
        resolutionBuilder = rs; 
    }
    
    public Resolution getResolution(){
        return resolutionBuilder.getResolution(); 
    }
   
    public void constructResolution(ArrayList<String> consideration, String parIntro, String parNotify, String parResolve, String parResult) {
        resolutionBuilder.createNewResolution();
        resolutionBuilder.buildConsider(consideration);
        resolutionBuilder.buildIntro(parIntro);
        resolutionBuilder.buildNotify(parNotify);
        resolutionBuilder.buildResolve(parResolve);
        resolutionBuilder.buildResult(parResult);
    }
    
    
}
