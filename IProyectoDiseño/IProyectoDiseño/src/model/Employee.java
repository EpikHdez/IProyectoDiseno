/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Employee extends Person{
    private EEmployeeRol rol;

    public Employee(EEmployeeRol rol, String id, String name, String email, String phone) {
        super(id, name, email, phone);
        this.rol = rol;
    }
}
