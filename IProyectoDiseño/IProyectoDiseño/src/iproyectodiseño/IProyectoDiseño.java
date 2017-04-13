/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iproyectodiseño;

import controller.DAOData;
import controller.DTORequest;
import controller.PlansManager;
import controller.School;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import view.FrMain;

/**
 *
 * @author Ximena
 */
public class IProyectoDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FrMain fm= new FrMain();
        fm.setVisible(true);

        //FileInputStream fis = new FileInputStream(new File("src\\files\\DatosProyecto1.xlsx"));
        //DAOData data = new DAOData(fis); 
        //data.readPlan();
        //data.readProfessors();
        School school = School.getInstance();
        PlansManager manager = school.getPlansManager();
        manager.read();
        school.getPersonsManager().read();
   

    }
    
}
