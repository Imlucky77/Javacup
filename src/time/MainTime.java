package time;

import javax.swing.*;

public class MainTime {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog();

        Time time = new Time(12, 255, 28);
        //System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
        JOptionPane.showMessageDialog(null, time);
    }
}
