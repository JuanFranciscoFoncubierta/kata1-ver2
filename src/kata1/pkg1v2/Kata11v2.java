/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1.pkg1v2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author juanf
 */
public class Kata11v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar date;
        date=GregorianCalendar.getInstance();
        date.set(1949,9,24);
        
        Person person=new Person("Blas",date);
        System.out.println(person.getName()+ " tiene " + person.getAge());
    }
    
}
