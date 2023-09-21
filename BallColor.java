import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class BallColor extends JFrame implements ActionListener {
    JButton b;

    public BallColor() {
        setSize(500, 500);
        b = new JButton("Change");
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        b.addActionListener(this);
    }

    public void paint(Graphics g) {
        Random r = new Random();
        Float red = r.nextFloat();
        Float pink = r.nextFloat();
        Float black = r.nextFloat();
        Color c = new Color(red, pink, black);
        g.setColor(c);
        g.fillOval(250, 250, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        new BallColor();
    }
}
