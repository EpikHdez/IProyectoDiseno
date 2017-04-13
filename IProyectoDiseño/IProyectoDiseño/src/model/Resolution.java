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
    
    
}
