/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author ErickHdez
 */
public class GroupNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>GroupNotFoundException</code> without
     * detail message.
     */
    public GroupNotFoundException() {
    }

    /**
     * Constructs an instance of <code>GroupNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GroupNotFoundException(String msg) {
        super(msg);
    }
}
