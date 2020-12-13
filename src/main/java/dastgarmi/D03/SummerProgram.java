package dastgarmi.D03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class SummerProgram {
    public static void main(String[] args) {
        String[] dates = {"123/AGU/1", "2018/jun/04", "98/04/23", "1398/FeB/01"};
        List<Month> months = Arrays.stream(dates)
                .filter(date -> date.matches("^\\d{2,4}\\/[a-zA-Z]+\\/\\d{2}"))
                .map(SummerProgram::get)
                .sorted(Comparator.comparingInt(Month::getNum).reversed())
                .collect(Collectors.toList());
        Month month = months.get(0);
        switch (month) {
            case JAN:
            case FEB:
            case MAR:
                System.out.print("winter ");
                break;
            case APR:
            case MAY:
            case JUN:
                System.out.print("spring ");
            default:
                System.out.print("summer ");
        }
    }

    private static Month get(String date) {
        int i1 = date.indexOf("/"), i2 = date.lastIndexOf("/");
        String monName = date.substring(i1 + 1, i2);
        return EnumSet.allOf(Month.class).stream().
                filter(m -> m.name().equalsIgnoreCase(monName)).findFirst().get();
    }
}

enum Month {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),
    JUL(7), AGU(8), SEP(9), OCT(10), NOV(11), DES(12);
    public final int num;

    public int getNum() {
        return num;
    }

    Month(int num) {
        this.num = num;
    }
}
