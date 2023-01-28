package Draw;
import java.awt.*;
import java.awt.geom.*;

public class Rectangle extends Draw{

    private Point punto1;
    private Point punto2;
    private boolean fill = false;

    public Rectangle(Color colore, BasicStroke thick, Point p, boolean fill) {
        super(colore, thick);
        punto1 = p;
        this.fill = fill;
    }

    public void setPunto(Point p) {
        punto2 = p;
    }

    public void paintComponent(Graphics g) {
        int xcoordinates[] = {(int)punto1.getX(), (int)punto2.getX(), (int)punto2.getX(), (int)punto1.getX()};
        int ycoordinates[] = {(int)punto2.getY(),  (int)punto2.getY(), (int)punto1.getY(), (int)punto1.getY()};
        super.paintComponent(g);
        Polygon p = new Polygon(xcoordinates, ycoordinates, 4);
        if(fill == false)
             g.drawPolygon(p);
        else
            g.fillPolygon(p);
    }

    public boolean intersects(Selection sel) {
        Rectangle2D r = new Rectangle2D.Double(punto1.getX(), punto1.getY(), punto2.getX() - punto1.getX(), punto2.getY() - punto1.getY());
        Rectangle2D s = new Rectangle2D.Double(sel.getPunto1().getX(), sel.getPunto1().getY(), sel.getPunto2().getX() - sel.getPunto1().getX(), sel.getPunto2().getY() - sel.getPunto1().getY());
        if (s.intersects(r)) 
            return true;
        else
            return false;
    }
}
