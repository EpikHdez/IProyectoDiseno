/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import model.Course;
import model.Employee;
import model.Group;
import model.Request;
import static org.apache.xmlbeans.impl.jam.internal.javadoc.JavadocRunner.start;
import static org.apache.xmlbeans.impl.schema.StscState.end;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrRequest;
import view.FrStadistics;

/**
 *
 * @author Usuario
 */
public class UIStadistics {
    private FacadeCoordinator facade; 

    public UIStadistics() {
        facade=new FacadeCoordinator();
    }

     public void processedRequestsInDateRange(FrStadistics frstadistics) {
        
        Date start=(Date) frstadistics.getSpInitialD().getValue();
        Date end=(Date) frstadistics.getSpFinalD().getValue();
        ArrayList<Request> r= facade.processedRequestsInDateRange(start, end);
        if (frstadistics.getCbResolutions().getItemCount()!=0){
            frstadistics.getCbResolutions().removeAllItems();
        }
        for(Request request: r){
            frstadistics.getCbResolutions().addItem(Integer.toString(request.getId()));
        }
    }
     public void getRequest(FrStadistics frstadistics){
         if(frstadistics.getCbResolutions().getItemCount()!=0){
            Request r=facade.selectRequest(frstadistics.getCbResolutions().getSelectedItem().toString());
            frstadistics.getLbcarne().setText(r.getAffected().getId());
            frstadistics.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
            frstadistics.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
            frstadistics.getLbinconsistence().setText(r.getInconsistencie().toString());
            frstadistics.getLbname().setText(r.getAffected().getName());
            frstadistics.getLbresolution().setText(Integer.toString(r.getResolution().getId()));
            frstadistics.getLbperiod().setText(r.getGroup().getPeriod());
         }
     
     }
     public void setallPeriods(FrStadistics frstadistics){
        int i=0;
        ArrayList<String>periods=new ArrayList<String>();
        for(Object o:facade.selectallGroups()){
            if(!periods.contains(((Group)o).getPeriod())){
            frstadistics.getCbperiod().insertItemAt(((Group)o).getPeriod(), i);  
            periods.add(((Group)o).getPeriod());
            i++;
            }
        
    }
    }
     public DefaultCategoryDataset top5CoursesResolutionsByPeriod(FrStadistics frstadistics){
        ArrayList<Course> c=facade.top5CoursesResolutionsByPeriod(frstadistics.getCbperiod().getSelectedItem().toString());
         DefaultCategoryDataset dataset=new DefaultCategoryDataset();
         for(Course course:c){
             dataset.setValue(100, "", course.getName());
         }
         return dataset;
    }
      public DefaultCategoryDataset top3ProfessorsResolutions() {
        ArrayList<Employee> e= facade.top3ProfessorsResolutions();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for(Employee employee:e){
            dataset.setValue(1000, "", employee.getName());
        }
        return dataset;
    }
}
