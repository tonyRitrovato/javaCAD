
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
        int width = (int)(punto2.getX() - punto1.getX());
        int height = (int)(punto2.getY() - punto1.getY());
        super.paintComponent(g);
        g.drawRect((int)punto1.getX(),(int)punto1.getY(),width, height);
    }
    
}
