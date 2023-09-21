import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DigitalWatch extends JFrame {
    JLabel t;
    SimpleDateFormat timeformat;
    String time;

    public DigitalWatch() {
        setSize(500, 500);
        t = new JLabel();
        t.setOpaque(true);
        add(t);
        timeformat = new SimpleDateFormat("HH:mm:ss");
        setVisible(true);
        showTime();
    }

    public void showTime() {
        while (true) {
            time = timeformat.format(Calendar.getInstance().getTime());
            t.setText(time);
        }
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }
}
