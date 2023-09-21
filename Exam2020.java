import java.awt.*;
import javax.swing.*;

public class Exam2020 extends JFrame {
    JButton b1, b2, b3, b4, b5;

    public Exam2020() {
        setSize(500, 500);
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Long Named Button 4");
        b5 = new JButton("Button 5");
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exam2020();
    }

}
