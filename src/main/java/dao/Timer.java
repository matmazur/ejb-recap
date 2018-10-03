package dao;

import javax.ejb.Local;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Singleton
public class Timer {

    @Schedule(second ="*/5",minute = "*",hour = "*",persistent = false)
    public void tickEveryFiveSec(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US);

        System.out.println(formatter.format(LocalTime.now()));
    }
}
