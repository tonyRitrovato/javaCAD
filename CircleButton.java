
import java.awt.*;

public class CircleButton extends DrawButton {

    public int TURN = 4;
    
    public CircleButton() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(5, 5, 20, 20);
    }

}
