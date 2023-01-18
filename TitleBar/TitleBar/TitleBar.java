package TitleBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleBar extends JPanel implements MouseMotionListener{
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
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
        Point posizioneNelloSchermo = e.getLocationOnScreen();
        riferimento.setLocation(posizioneNelloSchermo.x , posizioneNelloSchermo.y);
     }

    public void mouseClicked(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }
 
    public void mouseReleased(MouseEvent e) { }
 
    public void mouseEntered(MouseEvent e) { }
 
    public void mouseExited(MouseEvent e) { }

    public void mouseMoved(MouseEvent e) { }
}
