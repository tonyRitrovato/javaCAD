package Draw;

import java.awt.*;
import java.io.Serializable;

public  abstract class Draw implements Serializable{

    public Color colore;
    private int thick;
    private static final long serialVersionUID = 111111111;

    public Draw(Color colore, int thick) {
        this.thick = thick;
        this.colore = colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(colore);
        g2d.setStroke(new BasicStroke(thick)); 
    }

    public abstract void setPunto(Point p);

    public abstract boolean intersects(Selection sel);
}
