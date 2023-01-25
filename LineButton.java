
import java.awt.*;

public class LineButton extends DrawButton {

    private int turno = 2;

    public LineButton() {
        super();
        super.turno = this.turno;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(25, 5, 5, 25);
    }
    
}
