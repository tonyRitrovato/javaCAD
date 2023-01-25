import java.awt.*;

public class Punto extends Draw{

    private Point punto;

    public Punto(Color colore, BasicStroke thick, Point punto) {
        super(colore, thick);
        this.punto = punto;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval((int)punto.getX(), (int)punto.getY(), 3, 3);
    }

    public void setPunto(Point p) {
        return;
    }

    public boolean intersects(Selection sel) {
        if(sel.getPunto2().getX() > punto.getX() && sel.getPunto2().getY() > punto.getY())
            return true;
        else
            return false;
    } 
}
