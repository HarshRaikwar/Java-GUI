import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class smiley extends Frame {
    smiley() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(40, 40, 200, 200);
        g.drawOval(90, 70, 80, 80);
        g.drawOval(110, 95, 5, 5);
        g.drawOval(145, 95, 5, 5);
        g.drawLine(130, 95, 130, 115);
        g.drawArc(113, 115, 35, 20, 0, -180);
    }


    public static void main(String[] args) {
        smiley drawSmiley = new smiley();
        drawSmiley.setSize(400, 400);
        drawSmiley.setTitle("smile");
        drawSmiley.setVisible(true);

    }
}
