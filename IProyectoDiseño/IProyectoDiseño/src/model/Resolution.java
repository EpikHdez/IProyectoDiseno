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
    private String title;
    private String intro; 
    private String result;
    private String resolve; 
    private String notify;
    private String considerations;
    
    public Resolution(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getConsider() {
        return considerations;
    }

    public void setConsider(String considerations) {
        this.considerations = considerations;
    }
}
