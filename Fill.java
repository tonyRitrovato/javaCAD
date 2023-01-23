

import java.awt.*;
import java.awt.event.*;

public class Fill extends DrawButton implements ActionListener{

    public int TURN = -1;
    private boolean fill;
    Singleton s = Singleton.getInstance();

    public Fill() {
        super();
        super.TURN = this.TURN;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(5, 5, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        fill = (fill == true) ? false : true;
        s.setFill(fill);
    }
}
