import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleBarButton extends JButton implements MouseListener, ActionListener {

    private Color COLORE = new Color(15, 52, 96);
    private Color hover; 
    private int ALTEZZA = getHeight();
    private int LARGHEZZA = getWidth();
    private int funzione;

    public TitleBarButton(Color hover, int funzione) {
        this.hover = hover;
        this.funzione = funzione;
        setSize(ALTEZZA, LARGHEZZA);
        setBorderPainted(false);
        setForeground(new Color(255, 255, 255));
        setBackground(COLORE);
        addActionListener(this);
        addMouseListener(this);
        repaint();
     }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        switch (funzione) {

            case 1: g.drawLine(5,25,25,5);  g.drawLine(25,5,5,25); break;
            case 2:
            case 3:
        }
    }

    public void actionPerformed(ActionEvent e) {
        switch (funzione) 
        {
            case 1: System.exit(0); break;
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
