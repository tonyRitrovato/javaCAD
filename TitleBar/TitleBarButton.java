package TitleBar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleBarButton extends JButton implements MouseListener {
   
    private Color COLORE = new Color(15, 52, 96);
    private Color HOVER = new Color(25, 62, 106); 
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 30;

    public TitleBarButton() {
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setBorderPainted(false);
        setForeground(new Color(255, 255, 255));
        setBackground(COLORE);
        addMouseListener(this);
     }
     
     public void mouseClicked(MouseEvent e) { }

     public void mousePressed(MouseEvent e) { }
  
     public void mouseReleased(MouseEvent e) { }
  
     public void mouseEntered(MouseEvent e) { 
        setBackground(HOVER);
     }
  
     public void mouseExited(MouseEvent e) {
        setBackground(COLORE);
      }
}
