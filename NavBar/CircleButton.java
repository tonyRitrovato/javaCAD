package NavBar;
import java.awt.*;

public class CircleButton extends DrawButton {

    private int turno = 4;
    
    public CircleButton() {
        super();
        super.turno = this.turno;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(5, 5, 20, 20);
    }

}
