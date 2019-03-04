package howtoprogram.Chapter08.examples;

import javax.swing.*;

/**
 * @author imlucky
 * @Created: 2019/03/03
 * @Examples: Fig. 8.19: TestDraw.java
 */
public class TestDraw {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
