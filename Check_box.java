import java.awt.*;
import java.awt.event.*;

public class Mycheckbox extends Frame implements ItemListener {
    String msg="";
    Checkbox c1,c2;
    public static void main(String args[])
    {
        Mycheckbox ch=new Mycheckbox();
        ch.setTitle("Check box status");
        ch.setSize(450,400);
        ch.setVisible(true);
         
    }
    Mycheckbox()
    {
      c1=new Checkbox("Arial",true);
      c2=new Checkbox("Bold");
      add(c1);
      add(c2);
       this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private void addItemListener(CheckClass checkClass) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {    
    }
   class CheckClass implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) {
      
        }
       
    }
    
    public void paint(Graphics g)
    {
        g.drawString("Show state:",15,100);
        msg="Arial:"+c1.getState();
        g.drawString(msg,15,140);
         msg="Bold:"+c2.getState();
         g.drawString(msg,15,140);
    }
    
}
