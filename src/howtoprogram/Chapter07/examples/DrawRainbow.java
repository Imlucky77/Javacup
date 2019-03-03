package howtoprogram.Chapter07.examples;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 7.25: DrawRainbow.java
 */
public class DrawRainbow extends JPanel {

    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = {Color.WHITE, Color.WHITE, Color.RED, Color.GREEN,
            Color.BLUE, Color.ORANGE, Color.YELLOW, VIOLET, INDIGO};

    public DrawRainbow() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        int radius = 20;
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int counter = colors.length; counter > 0; counter--) {
            graphics.setColor(colors[counter - 1]);

            graphics.fillArc(centerX - counter * radius,
                    centerY - counter * radius,
                    counter * radius * 2,
                    counter * radius * 2,
                    0, 180);
        }
    }
}

