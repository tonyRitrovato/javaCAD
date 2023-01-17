import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawPanel extends JPanel implements MouseWheelListener {

    public int ALTEZZA = 660;
    public int LARGHEZZA = 1280;
    private boolean griglia = true;
    private double zoomFactor = 1.0;
    private int zoomIndex = 10000;

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        addMouseWheelListener(this);
     }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(zoomFactor, zoomFactor);
        if(griglia == true) {
            g.setColor(new Color(225,225,225));
             for(int i = 0; i < getWidth() + zoomIndex; i += (20 * zoomFactor))
                g.drawLine(i, 0, i,  (getHeight() + zoomIndex));
            for(int i = 0; i < getHeight() + zoomIndex ; i += (20 * zoomFactor))
                g.drawLine(0, i, (getWidth() + zoomIndex), i);
        }
        g.setColor(new Color(0,0,0));
        g.drawLine(5, 5, 600, 600);
       
     }

     public boolean getGriglia() {
        return griglia;
     }

     public void setGriglia (boolean s) {
        griglia = s;
     }

    public void mouseWheelMoved(MouseWheelEvent e) {
        int rotazione = e.getWheelRotation();
        if(rotazione > 0)
            zoomIn();
        else
            zoomOut();
     }

     public void zoomIn() {
        if(zoomFactor > 0.5) 
            zoomFactor -= 0.1;
        repaint();
     }

     public void zoomOut() {
        if(zoomFactor < 2) 
            zoomFactor += 0.1;
        repaint();
     }
}