package time;

import javax.swing.*;

public class MainTime {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog();

        Time time = new Time(12, 22, 28);
        //System.output.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
        JOptionPane.showMessageDialog(null, time);
    }
}
