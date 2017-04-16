/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EInconsistencie;
import model.Group;
import model.Request;
import model.Student;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
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

    public ArrayList<Object> readRequests(){
        ArrayList<Object> requests = new ArrayList(); 
        XSSFSheet sheet = workbook.getSheetAt(0); 
        
        for(Row row : sheet){
            Date date= null; 
            Student affected; String carnet = null; String name = null; String email = null; String celStu = null; 
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
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                carnet = Integer.toString((int) cell.getNumericCellValue());
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                carnet = cell.getStringCellValue(); 
                            break;
                        case 2: //es el nombre del estudiante
                            name = cell.getStringCellValue(); 
                            break; 
                        case 3: 
                            email = cell.getStringCellValue();
                            break; 
                        case 4:  
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                celStu = Integer.toString((int) cell.getNumericCellValue());
                            else if(cell.getCellType() == Cell.CELL_TYPE_STRING)
                                celStu = cell.getStringCellValue(); 
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
            if(carnet != null){
                affected = new Student(carnet, name, email, celStu); 
                group = School.getInstance().selectGroup(period, numberGroup,course); 
                einconsistencie = identifyEInconsistencie(inconsistencie); 
                requests.add(new Request(new Date(2017, 5, 12), description, einconsistencie, affected, affected, group));
            }
           
        }
        System.out.println("reads the requests");
        printArrayRequest(requests);
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
    
       
    private String transformInconsistencieToSpanish(EInconsistencie inc){
        if(inc == EInconsistencie.GradeError){
            return "ERROR_NOTA"; 
        }
        else if(inc == EInconsistencie.RecordExclusion){
            return "EXCLUSION_ACTA"; 
        }
        else if(inc == EInconsistencie.RecordInclusion){
            return "INCLUSION_ACTA";
        }
        return null; 
    }

    public void saveRequest() {
        System.out.println("llega al destino final");
        XSSFSheet sheet = workbook.getSheetAt(0); 
        System.out.println("1");
        int rowI = 1; 
        for(Object o: School.getInstance().selectAllRequests()){
            printArrayRequest(School.getInstance().selectAllRequests());
            System.out.println("2 for");
            Request r = (Request) o; 
            Row row = sheet.createRow(rowI); 
            //
            Cell cellDate = row.createCell(0); 
            cellDate.setCellValue(r.getDate());
            CellStyle styleCreationDate = workbook.createCellStyle(); 
            XSSFDataFormat dfCreationDate = workbook.createDataFormat();
            styleCreationDate.setDataFormat(dfCreationDate.getFormat("d/m/yy"));
            cellDate.setCellStyle(styleCreationDate);
            //
            Cell cellCarnet = row.createCell(1); 
            cellCarnet.setCellValue(r.getAffected().getId());
            CellStyle styleCreationInt = workbook.createCellStyle(); 
            XSSFDataFormat dfCreationInt = workbook.createDataFormat(); 
            
            Cell cellName = row.createCell(2); 
            cellName.setCellValue(r.getAffected().getName());
            Cell cellEmail = row.createCell(3); 
            cellEmail.setCellValue(r.getAffected().getEmail());
            Cell cellPhone = row.createCell(4); 
            cellPhone.setCellValue(r.getAffected().getPhone());
            Cell cellPeriod = row.createCell(5); 
            cellPeriod.setCellValue(r.getGroup().getPeriod());
            Cell cellCourse = row.createCell(6); 
            cellCourse.setCellValue(r.getGroup().getCourse().getCode());
            Cell cellNumGroup = row.createCell(7); 
            cellNumGroup.setCellType(Cell.CELL_TYPE_NUMERIC);
            cellNumGroup.setCellValue(r.getGroup().getNumber());
            Cell cellInc = row.createCell(8); 
            cellInc.setCellValue(transformInconsistencieToSpanish(r.getInconsistencie()));
            Cell cellDescription = row.createCell(9); 
            cellDescription.setCellValue(r.getDescription());
            rowI++; 
            System.out.println("end for");
        }
        System.out.println("out for");
        // Save to excel file 
        try{
            System.out.println("inside try ");
            FileOutputStream out = new FileOutputStream(new File("src//files//DatosFormulario.xlsx"));
            System.out.println("3 ");
            workbook.write(out);
            System.out.println(" 4");
            out.close(); 
            System.out.println("5");
            System.out.println("Excel written succesfully :D");
        } catch (FileNotFoundException ex) {
            System.out.println("entro al file exception");
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("entro al io exception");
            Logger.getLogger(DAORequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void printArrayRequest(ArrayList<Object> objects) {
             for (Object object : objects) {
            System.out.println(object.toString());
        }
    }
    
}