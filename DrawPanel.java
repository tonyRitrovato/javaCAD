import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawPanel extends JPanel implements KeyListener{

    public static int ALTEZZA = 660;
    public static int LARGHEZZA = 1280;
    private boolean griglia = true;

    public DrawPanel() {
        setBackground(new Color(26, 26, 46));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
     }

     public void paintComponent(Graphics g) {
        if(griglia == true) {
            g.setColor(new Color(200,200,200));
             for(int i = 0; i < LARGHEZZA; i += 40)
                g.drawLine(i, 0, i, 660);
            for(int i = 0; i < ALTEZZA; i += 40)
                g.drawLine(0, i, 1280, i);
        }
     }

    public void keyTyped(KeyEvent e) {
        System.out.println(e);
        /* char key = e.getKeyChar();
        if(key == 'p') {
            System.out.println(key);
        }
            griglia = (griglia == true) ? false : true;
        repaint(); */
     }

    public void keyPressed(KeyEvent e) { 
        System.out.println(e);
    }

    public void keyReleased(KeyEvent e) { }
}