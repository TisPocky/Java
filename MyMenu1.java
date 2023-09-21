import javax.swing.*;

public class MyMenu1 extends JFrame {
    JMenuBar bar;
    JMenu file, edit;
    JMenuItem n, save;

    public MyMenu1() {
        setSize(500, 500);
        bar = new JMenuBar();
        setJMenuBar(bar);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        bar.add(file);
        bar.add(edit);
        n = new JMenuItem("New");
        save = new JMenuItem("Save");
        file.add(n);
        file.add(save);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyMenu1();
    }

}
