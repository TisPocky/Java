import javax.swing.*;
import java.awt.event.*;

public class Coordinates extends JFrame implements MouseListener, MouseMotionListener {
    JTextField t1, t2;

    public Coordinates() {
        setSize(500, 500);
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        t2 = new JTextField();
        t2.setBounds(100, 150, 100, 50);
        add(t1);
        add(t2);
        setLayout(null);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e) {
        t2.setText("X:" + e.getX() + " Y:" + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        t1.setText("Inside Frame");
    }

    public void mouseExited(MouseEvent e) {
        t1.setText("Outside Frame");
        t2.setText("");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Coordinates();
    }

}
