import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Guess extends JFrame implements ActionListener {
    JTextField t;
    JLabel l;
    JButton b;
    int attempt, num;

    public Guess() {
        setSize(500, 500);
        t = new JTextField();
        t.setColumns(10);
        l = new JLabel();
        generateRandom();
        b = new JButton("Try");
        add(t);
        add(l);
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        b.addActionListener(this);
    }

    public void generateRandom() {
        attempt = 0;
        l.setText("Attempt: " + attempt);
        Random r = new Random();
        num = r.nextInt(10);
    }

    public void actionPerformed(ActionEvent e) {
        attempt++;
        l.setText("Attempt: " + attempt);
        int a = Integer.parseInt(t.getText());
        if (a == num) {
            JOptionPane.showMessageDialog(this, "Congratulations!!!");
            t.setText("");
            generateRandom();
        } else {
            t.setText("");
            JOptionPane.showMessageDialog(this, "Wrong!!!");
        }
    }

    public static void main(String[] args) {
        new Guess();
    }
}
