

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleBar extends JPanel implements MouseMotionListener {
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
    private Point posizione;
    private JFrame riferimento;

    public TitleBar(JFrame riferimento) {
        this.riferimento = riferimento;
        addMouseMotionListener(this);
        setBackground(new Color(15, 52, 96));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        ExitButton exit = new ExitButton();
        IconButton icon = new IconButton(riferimento);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.weightx = 400;
        add(icon, c);
        c.weightx = 1;
        add(exit, c);
    }

    public void mouseDragged(MouseEvent e) {
       riferimento.setLocation(e.getLocationOnScreen());
     }

    public void mouseMoved(MouseEvent e) { }
}