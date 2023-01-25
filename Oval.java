
import java.awt.*;

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
         diffx = (int)(raggio.getX() - centro.getX() / 2);
         diffy = (int)(raggio.getY() - centro.getY() / 2);
        super.paintComponent(g);
        if(fill == false)
            g.drawOval((int)centro.getX(), (int)centro.getY(), diffx * 2, diffy * 2);
        else
            g.fillOval((int)centro.getX(), (int)centro.getY(), diffx * 2, diffy * 2);
    }

    public boolean intersects(Selection d) {
       
        return true;
    }
    
}
