

import java.awt.*;

public class Fill extends DrawButton {

    public int TURN = -1;

    public Fill() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(5, 5, 20, 20);
    }
}
