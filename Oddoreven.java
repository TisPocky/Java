import javax.swing.*;
import java.awt.event.*;

public class Oddoreven extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b;

    public Oddoreven() {
        setSize(500, 500);
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        t2 = new JTextField();
        t2.setBounds(100, 150, 100, 50);
        b = new JButton("Check");
        b.setBounds(100, 200, 100, 50);
        add(t1);
        add(t2);
        add(b);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        if (a % 2 != 0) {
            t2.setText("It is odd");
        } else {
            t2.setText("It is even");
        }
    }

    public static void main(String[] args) {
        new Oddoreven();
    }
}
