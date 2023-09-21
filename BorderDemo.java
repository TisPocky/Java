import java.awt.*;
import javax.swing.*;

public class BorderDemo extends JFrame {
    JButton n, e, s, w, c;

    public BorderDemo() {
        setSize(500, 500);
        n = new JButton("North");
        s = new JButton("South");
        e = new JButton("East");
        w = new JButton("West");
        c = new JButton("Center");
        add(n, BorderLayout.NORTH);
        add(s, BorderLayout.SOUTH);
        add(e, BorderLayout.EAST);
        add(w, BorderLayout.WEST);
        add(c);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderDemo();
    }
}
