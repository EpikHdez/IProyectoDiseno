/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import model.Course;
import model.EEmployeeRol;
import model.Employee;
import model.Group;
import model.Plan;
import model.Schedule;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Usuario
 */
public class DAOData {
    FileInputStream FIS;
    XSSFWorkbook workbook; 

    public DAOData(FileInputStream FIS) throws IOException {
        this.FIS = FIS;
        this.workbook = new XSSFWorkbook(FIS); 
    }
   
    
    public Plan readPlan(){
        ArrayList<Course> courses = new ArrayList<>(); 
       //takes the sheet you ask for 
        XSSFSheet sheet = workbook.getSheet("PLAN"); 
               
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String code = null;
            String name = null;
            double credits = 0; 
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0: 
                            code = cell.getStringCellValue(); break; 
                        case 1: 
                            name = cell.getStringCellValue(); break; 
                        case 2: 
                            credits = cell.getNumericCellValue(); break; 
                    }
                }
                
            }
            if(code != null){
                Course course = new Course(code, name, credits);
                System.out.println(course.toString());
                courses.add(course); 
                System.out.println("creating a course");
                code = null ; name = null; credits = 0; 
            }
           
        }
        Plan plan = new Plan(410, 2010, courses); 
        return plan; 
    }
    
    
     public void printArrayCourse(ArrayList<Course> objects){
        for (Course object : objects) {
            System.out.println(object.toString());
        }
    }
    
    public void printArrayPlan(ArrayList<Plan> objects){
        for (Plan object : objects) {
            System.out.println(object.toString());
        }
    }
    
    
    public ArrayList<Employee> readProfessors(){
        ArrayList<Employee> employees = new ArrayList<>(); 
        //takes the sheet you ask for 
        XSSFSheet sheet = workbook.getSheet("PROFESORES"); 
        
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String id = null;
            String name = null;
            String email = null;
            String phone = null;
             
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0: 
                            id = cell.getStringCellValue(); break; 
                        case 1: 
                            name = cell.getStringCellValue(); break; 
                        case 2: 
                            email = cell.getStringCellValue(); break; 
                        case 3: 
                            phone = cell.getStringCellValue(); break; 
                    }
                }
                
            }
            if(id != null){
                employees.add(new Employee(EEmployeeRol.PROFESSOR, id, name, email, phone)); 
                System.out.println("creating professor");
                id = null; name = null; email = null; phone = null; 
            }
            
            
        }
        
        return employees;
    }

    public void printArrayEmployee(ArrayList<Employee> objects){
        for (Employee object : objects) {
            System.out.println(object.toString());
        }
    }
    
    /*
        Periodo	Curso	Grupo	Profesor	Horario	Aula
        IS2017	IC1802	1	5-5555-5555	K-J 7:30-9:20	B3-08
    */
    
    public ArrayList<Group> readGroups(){
        ArrayList<Group> groups = new ArrayList<>(); 
        XSSFSheet sheet = workbook.getSheet("OFERTA");
        
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String period = null;
            Plan plan = null;
            int numberGroup = 0;
            Employee employee = null;
            ArrayList<Schedule> schedules = new ArrayList<>(); 
         
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0: 
                            period = cell.getStringCellValue(); break; 
                       
                    }
                }
                
            }
      
            
        }
     
        return null;
        
    }
}