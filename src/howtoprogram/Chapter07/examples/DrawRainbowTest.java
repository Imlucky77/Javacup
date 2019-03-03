package howtoprogram.Chapter07.examples;

import javax.swing.*;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 250);
        application.add(panel);
        application.setVisible(true);
    }
}
