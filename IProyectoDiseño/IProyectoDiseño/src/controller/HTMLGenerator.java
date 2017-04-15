/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class HTMLGenerator implements IDocumentGenerator{
    String buffer;
    
    public HTMLGenerator() {
        buffer = "<html>\n"
                + "\t<head>\n"
                + "\t\t<meta charset=\"utf-8\">\n"
                + "\t\t<title>";
    }

    @Override
    public void GenerateDocument(Resolution doc) {
        String resId = "RES-IC-" + format(doc.getId()) + "-" +
                Calendar.getInstance().get(Calendar.YEAR);
        
        buffer += resId + "</title>\n"
                + "\t</head>\n"
                + "\t<body>\n"
                + "\t\t<b><center>" + doc.getTitle() + "</center></b><br>\n"
                + "\t\t<b><center>" + resId + "</center></b><br><br>\n"
                + "\t\t<b>Atención: </b>" + doc.getAttention() + "<br>\n"
                + "\t\t<p>" + doc.getIntro() + "</p><br>\n"
                + "\t\t<b>Resultando único:</b><br>\n"
                + "\t\t<p>" + doc.getResult() + "<p><br>\n"
                + "\t\t<b>Considerando único:</b><br>\n"
                + "\t\t<p>" + doc.getConsider() + "</p><br>\n"
                + "\t\t<b>Resuelvo:</b><br>\n"
                + "\t\t<p>" + doc.getResolve() + "</p><br>\n"
                + "\t\t<b>Notifiquese</b><br>\n"
                + "\t\t<p>" + doc.getNotify() + "</p>\n"
                + "\t</body>\n"
                + "</html>";
        
        try {
            FileOutputStream file = new FileOutputStream(resId + ".html");
            PrintStream ps = new PrintStream(file);
            ps.print(buffer);
        } catch(Exception ex) {}
    }
    
    private String format(int id) {
        if(id < 10)
            return "00" + id;
        else if(id < 100)
            return "0" + id;
        
        return String.valueOf(id);
    }
}
