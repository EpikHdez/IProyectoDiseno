/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Parameter;

/**
 *
 * @author Usuario
 */
public class GradeErrorResolutionBuilder extends ResolutionBuilder{

    @Override
    public DTOTemplate generateTemplate() {
        Parameter parameter=Parameter.getInstance();
        DTOTemplate dtotemp=new DTOTemplate();
        dtotemp.setIntro(parameter.getParameter("intro"));
        dtotemp.setConsider(parameter.getParameter("consider"));
        dtotemp.setNotify(parameter.getParameter("notify"));
        dtotemp.setResolve(parameter.getParameter("resolve"));
        dtotemp.setResult(parameter.getParameter("result"));
        return dtotemp; //To change body of generated methods, choose Tools | Templates.
    }
    
}
