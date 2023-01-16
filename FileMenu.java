
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;



public class FileMenu extends JButton implements MouseListener{
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 55;
    private Font f = new Font("Calibri", Font.PLAIN, 14);
    private Color COLORE = new Color(22, 33, 62);
    private Color HOVER = new Color(32, 43, 72);

    public FileMenu() {

        super("File");
        setFont(f);
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setForeground(new Color(255,255,255));
        setBorderPainted(false);
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
