/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
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
                + "\t\t<b align:\"center\">" + doc.getTitle() + "</b>\n"
                + "\t\t<b align:\"center\">" + resId + "</b>\n"
                + "\t</body>\n"
                + "</html>";
    }
    
    private String format(int id) {
        if(id < 10)
            return "00" + id;
        else if(id < 100)
            return "0" + id;
        
        return String.valueOf(id);
    }
}
