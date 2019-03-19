package howtoprogram.Chapter16.examples;

import howtoprogram.Chapter08.examples.Time1;

import java.util.Comparator;

/**
 * @author imlucky
 * @Created: 2019/03/17
 * @Examples: Fig. 16.8: TimeComparator.java
 */
public class TimeComparator implements Comparator<Time1> {

    @Override
    public int compare(Time1 time1, Time1 time2) {

        int hourDifference = time1.getHour() - time2.getHour();
        if (hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();
        if (minuteDifference != 0) {
            return minuteDifference;
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}
