

import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {

    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;;
    private FileMenu file = new FileMenu();
    private Color colore;
    private DrawButtonBar d = new DrawButtonBar();
    
    public NavBar() { 
        setBackground(new Color(22, 33, 62));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        JPanel padding = new JPanel();
        padding.setBackground(new Color(22, 33, 62));

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.WEST;
        add(file, c);
       /*  */
       add(d, c);
        c.weightx = 1000;
        add(padding, c);
    }

    public Color getColore() {
        return d.getColore();
    }

    public boolean getFill() {
        return d.getFill();
    }

    public int getTurno() {
        return d.getTurno();
    }
}
