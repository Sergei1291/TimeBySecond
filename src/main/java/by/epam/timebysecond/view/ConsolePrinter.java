package by.epam.timebysecond.view;

import by.epam.timebysecond.bean.Time;

public class ConsolePrinter implements Printer {

    @Override
    public void print(Time time) {

        TimeInfoCreator infoCreator = new TimeInfoCreator();
        StringBuilder timeInfo = infoCreator.createInfo(time);

        System.out.println(timeInfo);

    }

}