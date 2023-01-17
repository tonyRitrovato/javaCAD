import java.awt.*;

public class PointButton extends DrawButton {

    public int TURN = 1;

    public PointButton() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(15, 15, 3, 3);
    }
    
}
