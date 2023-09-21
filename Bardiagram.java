import java.awt.*;
import javax.swing.*;

public class Bardiagram extends JFrame {
    int data[] = { 20, 35, 30 };
    Color colors[] = { Color.RED, Color.BLUE, Color.BLACK };

    public Bardiagram() {
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 100;
        int barWidth = 30;
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i]);
            int barHeight = data[i];
            g.fillRect(x, y - barHeight, barWidth, barHeight);
            x += 50;
        }
    }

    public static void main(String[] args) {
        new Bardiagram();
    }
}