import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ball extends JFrame implements ActionListener {
    JButton l, r, u, d;
    int x = 250;
    int y = 250;

    public Ball() {
        setSize(500, 500);
        l = new JButton("Left");
        u = new JButton("Up");
        d = new JButton("Down");
        r = new JButton("Right");
        add(l);
        add(u);
        add(d);
        add(r);
        setLayout(new FlowLayout());
        setVisible(true);
        l.addActionListener(this);
        u.addActionListener(this);
        d.addActionListener(this);
        r.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == l) {
            x = x - 10;
        } else if (e.getSource() == r) {
            x = x + 10;
        } else if (e.getSource() == u) {
            y = y - 10;
        } else {
            y = y + 10;
        }
        repaint();
    }

    public static void main(String[] args) {
        new Ball();
    }
}
