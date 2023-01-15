import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleBarButton extends JButton implements MouseListener, ActionListener {

    private Color COLORE = new Color(15, 52, 96);
    private Color hover; 
    private int ALTEZZA = 30;
    private int LARGHEZZA = 54;
    private int funzione;

    public TitleBarButton(Color hover, Icon img, int funzione) {
        super(img);
        this.hover = hover;
        this.funzione = funzione;
        setSize(ALTEZZA, LARGHEZZA);
        addActionListener(this);
        addMouseListener(this);
     }

    public void actionPerformed(ActionEvent e) {
        switch (funzione) 
        {
            case 1: 
            case 2:
            case 3:
        }
     }

    public void mouseClicked(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }
    
}
