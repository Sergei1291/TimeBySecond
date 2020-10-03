package by.epam.timebysecond.main;

import by.epam.timebysecond.bean.Time;
import by.epam.timebysecond.data.*;
import by.epam.timebysecond.logic.TimeCreator;
import by.epam.timebysecond.view.ConsolePrinter;
import by.epam.timebysecond.view.Printer;

public class Main {

    public static void main(String[] args) {

        //get second's number
        ResourceType resourceTypeResource = ResourceType.CONSOLE;
        DataAcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = factory.createDataAcquirer(resourceTypeResource);
        int seconds = dataAcquirer.read();

        //get time
        TimeCreator timeCreator = new TimeCreator();
        Time time = timeCreator.createTime(seconds);

        //output time
        Printer printer = new ConsolePrinter();
        printer.print(time);

    }

}