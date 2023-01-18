package NavBar;
import java.awt.*;

public class LineButton extends DrawButton {

    public int TURN = 2;

    public LineButton() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(25, 5, 5, 25);
    }
    
}
