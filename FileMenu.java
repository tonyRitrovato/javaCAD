
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class FileMenu extends JButton implements MouseListener{
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 55;
    private Font f = new Font("Calibri", Font.PLAIN, 14);
    private Color COLORE = new Color(22, 33, 62);
    private Color HOVER = new Color(32, 43, 72);

    private JPopupMenu menu = new JPopupMenu();
    private JMenuItem opzione1 = new JMenuItem("prova");

    public FileMenu() {

        super("File");
        setFont(f);
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setBackground(COLORE);
        setEnabled(false);
        setForeground(Color.WHITE);
        setBorderPainted(false);
        addMouseListener(this);
        menu.add(opzione1);
    }

    public void mouseClicked(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { 
        setBackground(HOVER);
        menu.show(e.getComponent(), 0, 30);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(COLORE);
     }
}
