import java.awt.*;

public class Move extends DrawButton {

    public int TURN = 0;

    public Move() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(18, 25, 25, 19);
        g.drawLine(25, 19, 17, 11);
        g.drawLine(19, 25, 11, 17);
        g.drawLine(11, 17, 5, 23);
        g.drawLine(5, 23, 5, 5);
        g.drawLine(5, 5, 23, 5);
        g.drawLine(23, 5, 17, 11);
    }
}
