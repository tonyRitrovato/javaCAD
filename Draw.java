import java.awt.*;

public class Draw {

    private Color colore;
    private BasicStroke thick;
    private boolean fill;
    private Point punto1;
    private Point punto2;

    public Draw(Color colore, BasicStroke thick, Point punto) {
        this.thick = thick;
        this.colore = colore;
        this.punto1 = punto;
    }

    public void setPunto2(Point p) {
        this.punto2 = p;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(colore);
        g2d.setStroke(thick);
    }
}
