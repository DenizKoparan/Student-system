/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Calendar;

/**
 *
 * @author User
 */
public class tarih {
    public static int tarih(){
        Calendar calendar=Calendar .getInstance();
        int x=calendar.get(Calendar.YEAR);
        return x;
    }
    
    
}
