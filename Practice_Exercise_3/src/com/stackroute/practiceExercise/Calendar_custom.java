package com.stackroute.practiceExercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_custom {
    public String calendarCustom (){
        String returnDate = "";
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_YEAR);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        returnDate = returnDate + dateFormat.format(cal.getTime());
        for(int i = 0; i < 6; i++){
            cal.add(cal.DATE,1);
        }
        return returnDate +"\n" + dateFormat.format(cal.getTime());
    }
}
