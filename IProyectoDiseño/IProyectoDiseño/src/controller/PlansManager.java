/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Course;
import model.Plan;

/**
 *
 * @author ErickHdez
 */
public final class PlansManager extends Manager {
    private DAOData data; 
    private ArrayList<Plan> plans; 
    
    public PlansManager(DAOData data) {
        this.data = data;
        this.plans = new ArrayList<>();
        readData();
    }
    
    
    @Override
    public void insert(Object parameter) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object select(String id) {
        int planCode = Integer.parseInt(id);
        
        for(Plan p : plans) {
            if(p.getCode() == planCode)
                return p;
        }
        
        return null;
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readData() {
        plans.add(data.readPlan()); 
        System.out.println(plans.toString());
    }
    
    public Course selectCourse(String planCode, String id) {
        Plan plan = (Plan) select(planCode);
        
        if(plan == null)
            return null;
        
        for(Course c : plan.getCourses()) {
            if(c.getCode().equals(id))
                return c;
        }
        
        return null;
    }
    
    public ArrayList<Course> selectAllCourses(String planCode) {
        Plan plan = (Plan) select(planCode);
        
        if(plan == null)
            return null;
        
        return plan.getCourses();
    }
}
