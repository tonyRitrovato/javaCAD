package NavBar;

import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {

    private int ALTEZZA = 30;
    private int LARGHEZZA = 1280;;
    private FileMenu file = new FileMenu();
    private DrawButton[] d = new DrawButton[7];
    private Thick t = new Thick();
    
    public NavBar() { 
        setBackground(new Color(22, 33, 62));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        JPanel padding = new JPanel();
        padding.setBackground(new Color(22, 33, 62));
        setFocusable(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.WEST;
        add(file, c);
       /*  */
       initDrawButton();
       for(DrawButton button : d) {
        add(button,c);
        button.setGruppo(d);
       }
       add(t,c);
        c.weightx = 1000;
        add(padding, c);
    }

    private void initDrawButton() {
       d[0] = new Move();
       d[1] = new PointButton();
       d[2] = new LineButton();
       d[3] = new RectangleButton();
       d[4] = new CircleButton();
       d[5] = new Fill();
       d[6] = new ColorButton();
    }
}
