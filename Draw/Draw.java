package Draw;

import java.awt.*;

public  abstract class Draw {

    private Color colore;
    private BasicStroke thick;

    public Draw(Color colore, BasicStroke thick) {
        this.thick = thick;
        this.colore = colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(colore);
        g2d.setStroke(thick);
    }

    public abstract void setPunto(Point p);

    public abstract boolean intersects(Selection sel);
}
