import javax.swing.*;
import java.awt.event.*;

public class Operation extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1, b2;

    public Operation() {
        setSize(500, 500);
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        t2 = new JTextField();
        t2.setBounds(100, 150, 100, 50);
        t3 = new JTextField();
        t3.setBounds(100, 200, 100, 50);
        b1 = new JButton("Add");
        b1.setBounds(100, 250, 100, 50);
        b2 = new JButton("Subtract");
        b2.setBounds(250, 250, 100, 50);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        setLayout(null);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getActionCommand().equals("Add")) {
            int result = a + b;
            t3.setText("" + result);
        } else {
            int result = a - b;
            t3.setText("" + result);
        }
    }

    public static void main(String[] args) {
        new Operation();
    }
}
