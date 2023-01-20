
import java.awt.*;

public class Oval extends Draw {

    private Point centro;
    private Point raggio;

    public Oval(Color colore, BasicStroke thick, Point centro) {
        super(colore, thick);
        this.centro = centro;
    }

    public void setPunto(Point p) {
        raggio = p;
    }

    public void paintComponent(Graphics g) {
        int diffx = (int)(raggio.getX() - centro.getX() / 2);
        int diffy = (int)(raggio.getY() - centro.getY() / 2);
        System.out.println(diffx);
        System.out.println(diffy);
        super.paintComponent(g);
        g.drawOval((int)centro.getX(), (int)centro.getY(), diffx * 2, diffy * 2);
    }
    
}
