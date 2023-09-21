import java.awt.*;
import java.awt.event.*;

public class Shutwindow implements WindowListener {
    Frame f;

    public Shutwindow() {
        Frame f = new Frame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);// close entire application
        f.dispose();// close only frame
        f.setVisible(false);// make the frame invisible

    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Shutwindow();
    }

}
