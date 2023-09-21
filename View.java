import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class View extends JFrame {
    JTextField t;
    JButton b;

    public View() {
        setSize(500, 500);
        t = new JTextField();
        t.setBounds(100, 100, 100, 50);
        b = new JButton("Change");
        b.setBounds(100, 150, 100, 50);
        add(t);
        add(b);
        setLayout(null);
        setVisible(true);
        EventHandler ev = new EventHandler(this);
        b.addActionListener(ev);
    }

    public static void main(String[] args) {
        new View();
    }

    public class EventHandler implements ActionListener {
        View v;

        public EventHandler(View v) {
            this.v = v;
        }

        public void actionPerformed(ActionEvent e) {
            Font f = new Font("Arial", Font.BOLD, 20);
            this.v.t.setFont(f);
            this.v.t.setForeground(Color.RED);
        }
    }
}