package by.epam.timebysecond.bean;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public Time(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hour;
        result = prime * result + minute;
        result = prime * result + second;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        if (hour != other.hour)
            return false;
        if (minute != other.minute)
            return false;
        if (second != other.second)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
    }

}