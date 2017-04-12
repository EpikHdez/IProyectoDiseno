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
    private int id; 
    private Date date; 
    private String Description; 
    private File evidence; 
    private EInconsistencie inconsistencie; 
    private ERequestState requestState; 
    private Note note; 
    private Resolution resolution;

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public File getEvidence() {
        return evidence;
    }

    public void setEvidence(File evidence) {
        this.evidence = evidence;
    }

    public EInconsistencie getInconsistencie() {
        return inconsistencie;
    }

    public void setInconsistencie(EInconsistencie inconsistencie) {
        this.inconsistencie = inconsistencie;
    }

    public ERequestState getRequestState() {
        return requestState;
    }

    public void setRequestState(ERequestState requestState) {
        this.requestState = requestState;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
