/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.Course;
import static model.ERequestState.*;
import model.Employee;
import model.Group;
import model.Person;
import model.Request;
import model.Resolution;
import model.Student;

/**
 *
 * @author Usuario
 */
public final class RequestsManager extends Manager {
   // private final DAOData daoRequest;
    private Request currentRequest;
    private DAORequest data; 
    
    public RequestsManager(DAORequest dao) {
        elements = new ArrayList();
        data = dao; 
        currentRequest = null;
        readData();
    }

    @Override
    public void insert(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Group group = School.getInstance().selectGroup(dto.getPeriod(), 
                        dto.getNumGroup(), dto.getCodCourse());
        Student student = new Student(dto.getIdStudent(), dto.getNameStudent(),
                                      dto.getEmail(), dto.getPhone());
        Person requester = new Person(dto.getRequesterId(), dto.getRequesterName(), "", "");
        
        currentRequest = new Request(dto.getDate(), dto.getDescription(), 
                                     dto.getInconsistence(), student, requester,
                                     group);
        
        elements.add(currentRequest);
    }

    @Override
    public void edit(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Request temp = new Request();
        temp.setId(dto.getRequestId());
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                temp = (Request) r;
                temp.setRequestState(dto.getState());
                
                if(temp.getRequestState() == CANCELED)
                    temp.setNote(dto.getNote());
                
                return;
            }
        }
    }

    @Override
    public void delete(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                elements.remove(r);
                
                return;
            }
        }
    }

    @Override
    public Object select(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                currentRequest = (Request) r;
                return r;
            }
        }
        
        return null;
    }
    
    public ArrayList<Object> selectPendings() {
        ArrayList<Object> pendings = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PENDING)
                pendings.add(r);
        }
        
        return pendings;
    }
    
    public ArrayList<Object> selectCanceled() {
        ArrayList<Object> canceled = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == CANCELED)
                canceled.add(r);
        }
        
        return canceled;
    }
    
    public ArrayList<Object> selectProcessed() {
        ArrayList<Object> processed = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PROCESSED)
                processed.add(r);
        }
        
        return processed;
    }

    @Override
    public ArrayList<Object> selectAll() {
        return elements;
    }
    
    public Resolution createTemplateResolution() {
        return currentRequest.createTemplateResolution();
    }
    
    public void setResolution(Resolution res) {
        currentRequest.setRequestState(PROCESSED);
        currentRequest.setResolution(res);
    }

    @Override
    public void readData() {
        elements = data.readRequests();
    }
    
    public void CancelRequest(String message){
      currentRequest.setRequestState(CANCELED);

      currentRequest.setNote(message);
    }
    
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        ArrayList<Request> processed = new ArrayList();
        Request r;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            
            if(r.getDate().after(start) && r.getDate().before(end))
                processed.add(r);
        }
        
        return processed;
    }
    
    public ArrayList<Course> top5CoursesResolutionsByPeriod(String period) {
        HashMap<Course, Integer> courses = new HashMap();
        Request r;
        Course c;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            
            if(r.getGroup().getPeriod().equals(period)) {
                c = r.getGroup().getCourse();
                
                if(courses.containsKey(c))
                    courses.put(c, courses.get(c) + 1);
                else
                    courses.put(c, 1);
            }
        }
        
        return filterTop5Courses(courses);
    }
    
    private ArrayList<Course> filterTop5Courses(HashMap<Course, Integer> courses) {
        int counter = 0;
        int values[] = new int[5]; 
        ArrayList<Course> top5 = new ArrayList();
        
        for(Map.Entry<Course, Integer> entry : courses.entrySet()) {
            if(counter < 5) {
                top5.add(entry.getKey());
                values[counter++] = entry.getValue();
            } else {
                for(int i = 0; i < 5; i++) {
                    if(entry.getValue() > values[i]) {
                        top5.remove(i);
                        top5.add(entry.getKey());
                    }
                }
            }
        }
        
        return top5;
    }
    
    public ArrayList<Employee> top3ProfessorsResolutions() {
        HashMap<Employee, Integer> professors = new HashMap();
        Request r;
        Employee e;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            e = r.getGroup().getProfessor();
                
            if(professors.containsKey(e))
                professors.put(e, professors.get(e) + 1);
            else
                professors.put(e, 1);
        }
        
        return filterTop3Professors(professors);
    }
    
    private ArrayList<Employee> filterTop3Professors(HashMap<Employee, Integer> professors) {
        int counter = 0;
        int values[] = new int[3]; 
        ArrayList<Employee> top3 = new ArrayList();
        
        for(Map.Entry<Employee, Integer> entry : professors.entrySet()) {
            if(counter < 3) {
                top3.add(entry.getKey());
                values[counter++] = entry.getValue();
            } else {
                for(int i = 0; i < 3; i++) {
                    if(entry.getValue() > values[i]) {
                        top3.remove(i);
                        top3.add(entry.getKey());
                    }
                }
            }
        }
        
        return top3;
    }
}
