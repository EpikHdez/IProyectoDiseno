/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.File;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Request {
    private static int request_serial = 1; 
    private int id; 
    private Date date; 
    private String Description; 
    private File evidence; 
    private EInconsistencie inconsistencie; 
    private ERequestState requestState; 
    private Note note; 
    private Resolution resolution; 
}
