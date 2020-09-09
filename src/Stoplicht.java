
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 80, 170);
        g.setColor(Color.RED);
        g.fillArc(67,60,45,45, 360, 360);
        g.setColor(Color.ORANGE);
        g.fillArc(67,110,45,45, 360, 360);
        g.setColor(Color.GREEN);
        g.fillArc(67,160,45,45, 360, 360);
        g.setColor(Color.black);
        g.fillRect(77, 220,20,200);
    }
}