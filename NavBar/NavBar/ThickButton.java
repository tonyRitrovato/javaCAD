package NavBar;
import java.awt.*;

public class ThickButton extends DrawButton{

    
    public int TURN = -1;

    public ThickButton() {
        super();
        super.TURN = this.TURN;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);    
        g.drawLine(5, 15, 25, 15);   
    }
}
