
import java.awt.*;

public class Rectangle extends Draw{

    private Point punto1;
    private Point punto2;

    public Rectangle(Color colore, BasicStroke thick, Point p) {
        super(colore, thick);
        punto1 = p;
    }

    public void setPunto(Point p) {
        punto2 = p;
    }

    public void paintComponent(Graphics g) {
        int xcoordinates[] = {(int)punto1.getX(), (int)punto2.getX(), (int)punto2.getX(), (int)punto1.getX()};
        int ycoordinates[] = {(int)punto2.getY(),  (int)punto2.getY(), (int)punto1.getY(), (int)punto1.getY()};
        super.paintComponent(g);
        Polygon p = new Polygon(xcoordinates, ycoordinates, 4);
        g.drawPolygon(p);
    }
}
