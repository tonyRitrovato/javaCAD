import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw implements MouseMotionListener {

    private Point p;
    private Point pf;
    private JPanel drawPanel;
    private Color colore = new Color(0,0,0);

    public Draw(Point p,JPanel drawPanel) {
       this.p = p;
       this.drawPanel = drawPanel;
    }

    public void paintComponent(Graphics g) {
        System.out.println(2);
        g.setColor(colore);
       g.drawLine((int)p.getX(),(int)p.getY(),(int) pf.getX(),(int) pf.getY());
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println(1);
        pf.setLocation(e.getPoint());
        drawPanel.repaint();
     }

    public void mouseMoved(MouseEvent e) { }
    
}
