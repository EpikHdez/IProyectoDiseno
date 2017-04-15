/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import model.EInconsistencie;
import model.Group;
import model.Request;
import model.Student;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Usuario
 */
public class DAORequest {
    FileInputStream FIS;
    XSSFWorkbook workbook; 

    public DAORequest(FileInputStream FIS) throws IOException {
        this.FIS = FIS;
        this.workbook = new XSSFWorkbook(FIS); 
        
    }
    public void printArrayRequest(ArrayList<Request> objects){
        for (Request object : objects) {
            System.out.println(object.toString());
        }
    }
    public ArrayList<Object> readRequests(){
        ArrayList<Object> requests = new ArrayList(); 
        XSSFSheet sheet = workbook.getSheetAt(0); 
        
        for(Row row : sheet){
            Date date= null; 
            Student affected; int carnet = 0; String name = null; String email = null; int celStu = 0; 
            Group group; String period = null; String course = null; int numberGroup = 0; 
            EInconsistencie einconsistencie; String inconsistencie = null; 
            String description = null; 
            File evidence; 
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0:
                            date = row.getCell(0).getDateCellValue(); 
                            break; 
                        case 1: 
                            carnet = (int) cell.getNumericCellValue();  
                            break;
                        case 2: //es el nombre del estudiante
                            name = cell.getStringCellValue(); 
                            break; 
                        case 3: 
                            email = cell.getStringCellValue();
                            break; 
                        case 4:  
                            celStu = (int) cell.getNumericCellValue();
                            break; 
                        case 5: 
                            period = cell.getStringCellValue(); 
                            break; 
                        case 6: 
                            course = cell.getStringCellValue(); 
                            break; 
                        case 7: 
                            numberGroup = (int) cell.getNumericCellValue(); 
                            break; 
                        case 8: 
                            inconsistencie = cell.getStringCellValue();
                            break; 
                        case 9: 
                            description = cell.getStringCellValue(); 
                             break; 
                        case 10: 
                            System.out.println("there is no file implementation yet");
                            break;        
                    }
                }
                
            }
            if(carnet != 0){
                affected = new Student(Integer.toString(carnet), name, email, Integer.toString(celStu)); 
                group = School.getInstance().selectGroup(numberGroup,course); 
                einconsistencie = identifyEInconsistencie(inconsistencie); 
                requests.add(new Request(new Date(2017, 5, 12), description, einconsistencie, affected, affected, group));
            }
           
        }
        return requests;
    }

    private EInconsistencie identifyEInconsistencie(String inconsistencie) {
        if(inconsistencie.equals("ERROR_NOTA")){
            return EInconsistencie.GradeError; 
        }
        else if(inconsistencie.equals("EXCLUSION_ACTA")){
            return EInconsistencie.RecordExclusion; 
        }
        else if(inconsistencie.equals("INCLUSION_ACTA")){
            return EInconsistencie.RecordInclusion; 
        }
        return null; 
    }
    
}