import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Chnagetext extends JFrame implements ActionListener {
    JTextField t;
    JButton b;

    public Chnagetext() {
        setSize(500, 500);
        t = new JTextField();
        t.setBounds(100, 100, 100, 50);
        b = new JButton("Change");
        b.setBounds(100, 150, 100, 50);
        add(t);
        add(b);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = t.getText();
        t.setText(msg.toUpperCase());
        t.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new Chnagetext();
    }

}
