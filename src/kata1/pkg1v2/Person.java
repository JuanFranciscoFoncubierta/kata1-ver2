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
public class Person {
    private String name;
    private Calendar birthday;
    private final long MILLISECONDS_PER_YEAR= (long) (1000*60*60*24*365.25);
    public Person(String name,Calendar birthday) {
        this.name=name;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Calendar today=GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    public long milliSecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
    
}
