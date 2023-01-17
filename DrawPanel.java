import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public static int ALTEZZA = 660;
    public static int LARGHEZZA = 1280;
    private boolean griglia = true;

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
     }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(griglia == true) {
            g.setColor(new Color(200,200,200));
             for(int i = 0; i < LARGHEZZA; i += 40)
                g.drawLine(i, 0, i, 660);
            for(int i = 0; i < ALTEZZA; i += 40)
                g.drawLine(0, i, 1280, i);
        }
     }

     public boolean getGriglia() {
        return griglia;
     }

     public void setGriglia (boolean s) {
        griglia = s;
     }
}