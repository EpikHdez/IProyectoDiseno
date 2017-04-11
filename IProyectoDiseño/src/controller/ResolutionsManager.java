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
public class ResolutionsManager extends Manager{
    private DAOResolution daoResolution; 
    private Director director; 
    
    public ArrayList<Resolution> createTop5Resolutions(){
        ArrayList<Resolution> resolutions = new ArrayList<Resolution>(); 
        return resolutions;
    }
}
