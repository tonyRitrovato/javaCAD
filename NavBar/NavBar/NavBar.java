package NavBar;

import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {

    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
    private DrawButton drawButton[] = new DrawButton[9];
    private FileMenu file = new FileMenu();
    
    public NavBar() { 
        setBackground(new Color(22, 33, 62));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        JPanel padding = new JPanel();
        padding.setBackground(new Color(22, 33, 62));
        //setBorderPainted(false);

        initDrawButton();

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.WEST;
        add(file, c);
        for(DrawButton d : drawButton) {
            add(d,c);
            d.setGruppo(drawButton);
        }

        c.weightx = 1190;
        add(padding, c);
    }

    private void initDrawButton() {
        drawButton[0] = new Move();
        drawButton[1] = new PointButton();
        drawButton[2] = new LineButton();
        drawButton[3] = new RectangleButton();
        drawButton[4] = new PolygonButton();
        drawButton[5] = new CircleButton();
        drawButton[6] = new Fill();
        drawButton[7] = new ColorButton();
        drawButton[8] = new ThickButton();
    }
}
