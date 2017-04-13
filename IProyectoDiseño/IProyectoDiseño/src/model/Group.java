/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Group {
    private int numberGroup;
    private String period; 
    private boolean open; // no es mejor quitarlo? 
    private Employee employee; 
    private ArrayList<Schedule> schedules; 
    private Course course; // still quito el curso y lo hago un plan? 

    public Group(int number, String period, boolean open, Employee employee, ArrayList<Schedule> schedules, Course course) {
        this.numberGroup = number;
        this.period = period;
        this.open = open;
        this.employee = employee;
        this.schedules = schedules;
        this.course = course;
    }
    

    public int getNumber() {
        return numberGroup;
    }

    public void setNumber(int number) {
        this.numberGroup = number;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
