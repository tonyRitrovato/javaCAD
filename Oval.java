
import java.awt.*;
import java.awt.geom.*;

public class Oval extends Draw {

    private Point centro;
    private Point raggio;
    private boolean fill;
    private int diffx;
    private int diffy;

    public Oval(Color colore, BasicStroke thick, Point centro, boolean fill) {
        super(colore, thick);
        this.centro = centro;
        this.fill = fill;
    }

    public void setPunto(Point p) {
        raggio = p;
    }

    public void paintComponent(Graphics g) {
         diffx = (int)((raggio.getX() - centro.getX()) / 2);
         diffy = (int)((raggio.getY() - centro.getY()) / 2);
        super.paintComponent(g);
        if(fill == false)
            g.drawOval((int)(centro.getX() - diffx), (int)(centro.getY() - diffy),(int) diffx * 2 ,(int) diffy * 2);
        else
            g.fillOval((int)(centro.getX() - diffx), (int)(centro.getY() - diffy), (int) diffx * 2,(int) diffy * 2);
    }

    public boolean intersects(Selection sel) {
       Ellipse2D e = new Ellipse2D.Double(centro.getX(), centro.getY(), diffx * 2, diffy * 2);
        Rectangle2D s = new Rectangle2D.Double(sel.getPunto1().getX(), sel.getPunto1().getY(), sel.getPunto2().getX() - sel.getPunto1().getX(), sel.getPunto2().getY() - sel.getPunto1().getY());
        if (e.intersects(s)) 
            return true;
        else
            return false;
    }    
}
