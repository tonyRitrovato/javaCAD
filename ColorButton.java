
import java.awt.*;

public class ColorButton extends DrawButton {

    public int TURN = -1;

    public ColorButton() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawLine(5, 5, 25, 25);
    }
    
}
