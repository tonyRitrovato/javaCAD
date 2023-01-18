package NavBar;
import java.awt.*;

public class RectangleButton extends DrawButton {

    public int TURN = 3;

    public RectangleButton() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, 20, 20);
    }
    
}
