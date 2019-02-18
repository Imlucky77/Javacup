package howtoprogram.Chapter06.examples;

import javax.swing.*;
import java.awt.*;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.11: DrawSmiley.java
 */
public class DrawSmiley extends JPanel {

    public void paintComponent(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(10, 10, 200, 200);

        graphics.setColor(Color.BLACK);
        // eyes
        graphics.fillOval(35, 65, 30, 30);
        graphics.fillOval(135, 65, 30, 30);
        // nose
        graphics.fillOval(95, 100, 20, 20);

        // mouth
        graphics.fillOval(50, 110, 120, 60);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(50, 110, 120, 30);
        graphics.fillOval(50, 120, 120, 40);
    }
}
