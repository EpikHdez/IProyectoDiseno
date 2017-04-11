/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Resolution {
    private static int resolution_serial = 1; 
    private int id; 
    private Date date; 
    private String intro; 
    private String result; 
    private String consider; 
    private String resolve; 
    private String notify; 
    private Employee employee; 
    private Parameter parameter;
}
