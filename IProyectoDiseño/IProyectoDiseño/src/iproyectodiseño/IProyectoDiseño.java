/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iproyectodiseño;

import controller.School;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import view.FrMain;

/**
 *
 * @author Ximena
 */
public class IProyectoDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        School.getInstance();
      
        FrMain fm= new FrMain();
        fm.setVisible(true);
        fm.setDefaultCloseOperation(fm.DO_NOTHING_ON_CLOSE);
        fm.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowclosing");
                School.getInstance().saveRequest();
                fm.setVisible(false);
                fm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("ingresa al window closed");
                School.getInstance().saveRequest();
                fm.setVisible(false);
                fm.dispose();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("window iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("window deactivated");
            }
        
        });
    }
}
