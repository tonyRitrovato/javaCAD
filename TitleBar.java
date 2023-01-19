

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleBar extends JPanel implements MouseMotionListener{
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
    private Point posizione = new Point(0,0);
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
        if (posizione != null)
        {
            Point posizioneNelloSchermo = e.getLocationOnScreen();
            riferimento.setLocation(posizioneNelloSchermo.x - (int)posizione.getX() , posizioneNelloSchermo.y -(int)posizione.getY());   
        }
        posizione = new Point(e.getX(), e.getY());
     }

    public void mouseMoved(MouseEvent e) { }
}