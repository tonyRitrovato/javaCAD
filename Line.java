import java.awt.*;
import  java.awt.geom.*;

public class Line extends Draw{

    private Point punto1;
    private Point punto2;

    public Line(Color colore, BasicStroke thick, Point punto1) {
        super(colore, thick);
        this.punto1 = punto1;
    }

    public void setPunto(Point punto2) {
        this.punto2 = punto2;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine((int)punto1.getX(), (int)punto1.getY(), (int)punto2.getX(), (int)punto2.getY());
    }

    public boolean intersects(Selection sel) {
        Line2D line = new Line2D.Double(punto1.getX(), punto1.getY(), punto2.getX(), punto2.getY());
        Rectangle2D r = new Rectangle2D.Double(sel.getPunto1().getX(), sel.getPunto1().getY(), sel.getPunto2().getX() - sel.getPunto1().getX(), sel.getPunto2().getY() - sel.getPunto1().getY());
        if (r.intersectsLine(line)) 
            return true;
        else
            return false;
    }
    
}
