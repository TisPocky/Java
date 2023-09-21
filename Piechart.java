import java.awt.*;
import javax.swing.*;

public class Piechart extends JFrame {
    int data[] = { 25, 15, 8 };
    int angle[] = new int[3];
    int initialangle = 0;
    Color colors[] = { Color.RED, Color.BLUE, Color.BLACK };

    public Piechart() {
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 3; i++) {
            angle[i] = (data[i] * 360 / 48);
        }
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i]);
            g.fillArc(150, 150, 300, 300, initialangle, angle[i]);
            initialangle = initialangle + angle[i];
        }
    }

    public static void main(String[] args) {
        new Piechart();
    }

}
