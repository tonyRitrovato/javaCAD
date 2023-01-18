package NavBar;
import java.awt.*;

public class PolygonButton extends DrawButton {

    public int TURN = 4;

    public PolygonButton() {
        super();
        super.TURN = this.TURN;
    }
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 25, 20, 25);
        g.drawLine(10, 25, 7, 16);
        g.drawLine(7, 16, 15, 10);
        g.drawLine(23, 16, 20, 25);
        g.drawLine(15, 10, 23, 16);   
    }
}
