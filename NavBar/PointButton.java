package NavBar;


import java.awt.*;


public class PointButton extends DrawButton {

    private int turno = 1;

    public PointButton() {
        super();
        super.turno = this.turno;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(15, 15, 3, 3);
    }
    
}
