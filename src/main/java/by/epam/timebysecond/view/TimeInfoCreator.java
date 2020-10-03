package by.epam.timebysecond.view;

import by.epam.timebysecond.bean.Time;

public class TimeInfoCreator {

    public StringBuilder createInfo(Time time) {

        StringBuilder builder = new StringBuilder();

        builder.append("Time - ");
        builder.append(time.getHour());
        builder.append(":");
        builder.append(time.getMinute());
        builder.append(":");
        builder.append(time.getSecond());

        return builder;
    }

}