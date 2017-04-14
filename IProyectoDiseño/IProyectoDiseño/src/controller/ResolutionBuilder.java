/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Resolution;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 *
 * @author Usuario
 */
public abstract class ResolutionBuilder {
    protected Configuration config;
    protected Resolution resolution; 
    
    public void createNewResolution(){
        resolution = new Resolution();
        config = getConfiguration();
    }
    
    public Resolution getResolution(){
        return this.resolution; 
    }
    
    private Configuration getConfiguration() {
        try {
            Parameters params = new Parameters();
            FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                    new FileBasedConfigurationBuilder<FileBasedConfiguration>
                        (PropertiesConfiguration.class).configure(params.properties().
                                setFileName("src//files//Parameters.properties"));
            
            return builder.getConfiguration();
        } catch (ConfigurationException ex) {
            Logger.getLogger(ResolutionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public abstract void buildIntro();
    public abstract void buildResult();
    public abstract void buildConsider();
    public abstract void buildResolve();
    public abstract void buildNotify();
}
