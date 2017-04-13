/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Manager {
    public abstract void insert(Object parameter) throws Exception;
    public abstract void edit(Object parameter) throws Exception;
    public abstract void delete (String id) throws Exception;
    public abstract Object select(String id) throws Exception;
    public abstract ArrayList<Object> selectAll();
}
