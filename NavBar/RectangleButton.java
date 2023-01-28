package NavBar;

import java.awt.*;

public class RectangleButton extends DrawButton {

    public int turno = 3;

    public RectangleButton() {
        super();
        super.turno = this.turno;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, 20, 20);
    }
    
}
