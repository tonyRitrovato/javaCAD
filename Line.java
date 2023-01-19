import java.awt.*;

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
    
}
