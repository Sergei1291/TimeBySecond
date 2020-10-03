package by.epam.timebysecond.logic;

import by.epam.timebysecond.bean.Time;

public class TimeCreator {

    private final static int SECONDS_PER_MINUTE = 60;
    private final static int MINUTES_PER_HOUR = 60;

    public Time createTime(int seconds) {

        seconds--;
        
        int minutes = seconds / SECONDS_PER_MINUTE;

        int second = seconds % SECONDS_PER_MINUTE;
        int minute = minutes % MINUTES_PER_HOUR;
        int hour = minutes / MINUTES_PER_HOUR;

        return new Time(hour, minute, second);
    }

}