import java.awt.*;
import javax.swing.*;
class Flag extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        int [] x1={100,200,100};
        int [] y1={50,150,150};
        g.fillPolygon(x1,y1,3);
        int [] x2={100,200,100};
        int [] y2={150,300,300};
        g.fillPolygon(x2,y2,3);
        g.setColor(Color.BLACK);
        g.drawLine(100,50,100,400);
    }
    public static void main(String [] args){
        JFrame f= new JFrame();
        f.setSize(500,500);
        f.add(new Flag());
        f.setVisible(true);
    }
}
