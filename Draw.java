import java.awt.*;

public class Draw {

    private Color colore;
    private BasicStroke thick;

    public Draw(Color colore, BasicStroke thick) {
        this.thick = thick;
        this.colore = colore;
    }

    public void setPunto(Point p) { }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(colore);
        g2d.setStroke(thick);
    }
}
