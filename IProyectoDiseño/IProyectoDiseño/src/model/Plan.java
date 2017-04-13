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
public class Plan {
      private String code;
   private String name;
   private double credits;

    public Plan(String code, String name, double credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Plan{" + "code=" + code + ", name=" + name + ", credits=" + credits + '}';
    }
}
