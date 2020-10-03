package by.epam.timebysecond.data;

import org.junit.Assert;
import org.junit.Test;

public class DataAcquirerFactoryTest {

    @Test
    public void createDataAcquirerShouldReturnConsoleDataAcquirer() {
        //given
        ResourceType resourceType = ResourceType.CONSOLE;
        DataAcquirerFactory factory = new DataAcquirerFactory();
        //when
        DataAcquirer actual = factory.createDataAcquirer(resourceType);
        //then
        Assert.assertEquals(ConsoleDataAcquirer.class, actual.getClass());
    }

    @Test
    public void createDataAcquirerShouldReturnFileDataAcquirer() {
        //given
        ResourceType resourceType = ResourceType.FILE;
        DataAcquirerFactory factory = new DataAcquirerFactory();
        //when
        DataAcquirer actual = factory.createDataAcquirer(resourceType);
        //then
        Assert.assertEquals(FileDataAcquirer.class, actual.getClass());
    }

}