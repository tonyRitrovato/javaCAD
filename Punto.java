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
}
