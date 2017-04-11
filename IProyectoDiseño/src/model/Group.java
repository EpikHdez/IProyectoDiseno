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
    
    private int number; 
    private int year; 
    private int period; 
    private boolean open; 
    private Employee employee; 
    private ArrayList<Schedule> schedules; 
    private Course course; 
    private EPeriodType periodType; 
}
