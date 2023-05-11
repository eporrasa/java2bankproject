package com.aulamatriz.java2bankproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Edwin Porras Angarita
 */
public class Utilities {

    public Date StringToDate(String s) {

        Date result = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
