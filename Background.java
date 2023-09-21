import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Background extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    public Background() {
        setSize(500, 500);
        b1 = new JButton("Red");
        b2 = new JButton("Blue");
        b3 = new JButton("Black");
        add(b1);
        add(b2);
        add(b3);
        setLayout(new FlowLayout());
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getActionCommand().equals("Blue")) {
            getContentPane().setBackground(Color.BLUE);
        } else {
            getContentPane().setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new Background();
    }
}
