package NavBar;

import java.awt.*;
import java.awt.event.*;

import Singleton.Singleton;

public class Fill extends DrawButton implements ActionListener{

    private int turno = -1;
    private boolean fill;
    Singleton s = Singleton.getInstance();

    public Fill() {
        super();
        super.turno = this.turno;
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
