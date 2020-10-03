package by.epam.timebysecond.logic;

import by.epam.timebysecond.bean.Time;
import org.junit.Assert;
import org.junit.Test;

public class TimeCreatorTest {

    private TimeCreator timeCreator = new TimeCreator();

    @Test
    public void testCreateShouldEqualsTimeWhenSecondsIs() {
        //given
        final int HOUR = 13;
        final int MINUTE = 50;
        final int SECOND = 51;
        Time timeExpected = new Time(HOUR, MINUTE, SECOND);
        //when
        int seconds = 49852;
        Time actual = timeCreator.createTime(seconds);
        //then
        Assert.assertEquals(timeExpected, actual);
    }

    @Test
    public void textCreateShouldNotEqualsWhenSecondsIs() {
        //given
        final int HOUR = 13;
        final int MINUTE = 50;
        final int SECOND = 51;
        Time timeExpected = new Time(HOUR, MINUTE, SECOND);
        //when
        int seconds = 500;
        Time actual = timeCreator.createTime(seconds);
        //then
        Assert.assertNotEquals(timeExpected, actual);
    }

}