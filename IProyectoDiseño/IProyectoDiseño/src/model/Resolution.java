/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Resolution {
    private int id; 
    private Date date; 
    private String intro; 
    private String result;
    private String resolve; 
    private String notify; 
    private Employee employee;
    private ArrayList<String> considerations;

    public Resolution(Date date, String intro, String result, String resolve, 
                      String notify, ArrayList<String> considerations) {
        this.date = date;
        this.intro = intro;
        this.result = result;
        this.resolve = resolve;
        this.notify = notify;
        this.employee = employee;
        this.considerations = considerations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<String> getConsiderations() {
        return considerations;
    }

    public void setConsiderations(ArrayList<String> considerations) {
        this.considerations = considerations;
    }
}
