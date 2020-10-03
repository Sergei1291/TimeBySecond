package by.epam.timebysecond.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    @Override
    public int read() {

        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);

            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            return scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}