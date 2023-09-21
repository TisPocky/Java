import java.awt.*;
import java.applet.*;

public class htmltoapplet extends Applet {
    String msg;

    public void init() {
        msg = getParameter("College");
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}

<html><head><body><applet code=htmltoapplet.class height="100" width="100">
<param name="College" value="NCIT">
</applet>
</body>
</head>
</html>
