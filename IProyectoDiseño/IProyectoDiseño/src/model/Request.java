/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.DTOResolution;
import java.io.File;
import java.util.Date;
import static model.ERequestState.PENDING;

/**
 *
 * @author Usuario
 */
public class Request {
    private int id; 
    private Date date; 
    private String description; 
    private File evidence; 
    private EInconsistencie inconsistencie; 
    private ERequestState requestState; 
    private Note note; 
    private Resolution resolution;
    private Student affected;
    private Person requester;
    private Group group;
    
    public Request() {}

    public Request(Date date, String description, EInconsistencie inconsistencie, 
                   Student affected, Person requester, Group group) {
        
        this.id = Integer.parseInt(Parameter.getInstance()
                                   .getParameter("request_serial"));
        this.date = date;
        this.description = description;
        this.inconsistencie = inconsistencie;
        this.requestState = PENDING;
        this.affected = affected;
        this.requester = requester;
        this.group = group;
        
        System.out.println(id);
        
        Parameter.getInstance().setParameter("request_serial", 
                                             String.valueOf(id + 1));
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
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

    public void setNote(String message) {
        this.note = new Note(message);
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Student getAffected() {
        return affected;
    }

    public void setAffected(Student affected) {
        this.affected = affected;
    }

    public Person getRequester() {
        return requester;
    }

    public void setRequester(Person requester) {
        this.requester = requester;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Request) obj).getId();
    }
}
