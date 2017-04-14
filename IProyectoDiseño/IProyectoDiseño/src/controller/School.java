/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import model.Course;
import model.Employee;
import model.Group;
import model.Request;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class School  {
    private static School INSTANCE;
    private IDocumentGenerator docGenerator; 
    private EmployeesManager employeesManager; 
    private RequestsManager requestsManager; 
    private PlansManager plansManager;
    private GroupsManager groupsManager;
    
    private School() {
        DAOData data = getDataFile();
        employeesManager = new EmployeesManager(data);
        plansManager = new PlansManager(data);
        groupsManager = new GroupsManager(data);
        requestsManager = new RequestsManager();
    }
    
    private DAOData getDataFile() {
        try {
            FileInputStream fis = new FileInputStream(new File("src//files//DatosProyecto1.xlsx"));
            return new DAOData(fis);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public static synchronized School getInstance() {
        if(INSTANCE == null){
            INSTANCE = new School();
        }
        return INSTANCE;
    }
   
    public void insertRequest(DTORequest req) {
        requestsManager.insert(req);
    }
    
    public void editRequest(DTORequest req) {
        requestsManager.edit(req);
    }
    
    public void deleteRequest(String id) {
        requestsManager.delete(id);
    }
    
    public Request selectRequest(String id) {
        return (Request) requestsManager.select(id);
    }
    
    public ArrayList<Object> selectPendingRequests() {
        return requestsManager.selectPendings();
    }
    
    public ArrayList<Object> selectCanceledRequests() {
        return requestsManager.selectCanceled();
    }
    
    public ArrayList<Object> selectProcessedRequests() {
        return requestsManager.selectProcessed();
    }
    
    public ArrayList<Object> selectAllRequests() {
        return requestsManager.selectAll();
    }
    
    public ArrayList<Request> viewRequestStadistics(){
        ArrayList<Request> requests = new ArrayList<Request>(); 
        return requests; 
    }
    
    public ArrayList<Object> viewEmployees(){
        return employeesManager.elements; 
    }
    
    public Employee findEmployee(String id){
        return employeesManager.findEmployee(id);
    }
    
    public Course selectCourse(String id) {
        return plansManager.selectCourse("410", id); //Como por ahora es el unico que existe
    }
    
    public ArrayList<Course> selectAllCourses() {
        return plansManager.selectAllCourses("410");
    }
    
    
    
    public Group selectGroup(int groupNumber, String courseCode) {
        //Se juntan para enviarlo buscar, ya que para buscar se recibe un
        //solo parametro
        String toSearch = groupNumber + "-" + courseCode;
        
        return (Group) groupsManager.select(toSearch);
    }
    
    public ArrayList<Object> selectAllGroups() {
        return groupsManager.selectAll();
    }
    
    
    
    
    public void insertResolution(DTOResolution res){
        requestsManager.insertResolution(res);
        
    }
   
    
    public ArrayList<Resolution> createTop5Resolutions(){
        ArrayList<Resolution> resolutions = new ArrayList<Resolution>(); 
        return resolutions;
    }
    
    public ArrayList<Employee> createTop3Professors(){
        ArrayList<Employee> employees = new ArrayList<Employee>(); 
        return employees;
    }
    
    public boolean createDocument(EDocType docType){
        //we have to implement this
        return false; 
    }


    public IDocumentGenerator getDocGenerator() {
        return docGenerator;
    }

    public void setDocGenerator(IDocumentGenerator docGenerator) {
        this.docGenerator = docGenerator;
    }


    public DTOTemplate getTemplate(){
        return requestsManager.getTemplate();
    };

    public Course findCourse(String code){
        return plansManager.findCourse(code);
    }
    
    public void loadDataGroups(){
        groupsManager.readData();
    }
}
