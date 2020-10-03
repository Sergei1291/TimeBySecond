package by.epam.timebysecond.data;

public class DataAcquirerFactory {

    public DataAcquirer createDataAcquirer(ResourceType resourceType) {

        switch (resourceType) {
            case FILE:
                return new FileDataAcquirer();
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalArgumentException("Unknown resource Type" + resourceType);
        }

    }

}