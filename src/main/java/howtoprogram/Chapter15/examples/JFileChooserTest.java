package howtoprogram.Chapter15.examples;

import javax.swing.*;
import java.io.IOException;

/**
 * @author imlucky
 * @Created: 2019/03/16
 * @Examples: Fig. 15.13: JFileChooserTest.java
 */
public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        JFileChooserDemo application = new JFileChooserDemo();

        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
