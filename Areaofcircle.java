import javax.swing.*;
import java.awt.event.*;

public class Areaofcircle extends JFrame implements ActionListener {
    JTextField t;
    JLabel l;
    JButton b;

    public Areaofcircle() {
        setSize(500, 500);
        t = new JTextField();
        t.setBounds(100, 100, 100, 50);
        l = new JLabel();
        l.setBounds(100, 150, 100, 50);
        b = new JButton("Calculate");
        b.setBounds(100, 200, 100, 50);
        add(t);
        add(l);
        add(b);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double r = Integer.parseInt(t.getText());
        double result = 3.14 * r * r;
        l.setText("" + result);
    }

    public static void main(String[] args) {
        new Areaofcircle();
    }
}
