
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseWheelListener, MouseListener, MouseMotionListener {

    public int ALTEZZA = 660;
    public int LARGHEZZA = 1280;
    private boolean griglia = true;
    private double zoomFactor = 1.0;
    private int zoomIndex = 10000;
    private boolean startDraw = false;
    private ArrayList<Draw> disegni = new ArrayList<Draw>();

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        addMouseWheelListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
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
        if(startDraw == true)
            for(Draw d : disegni) {
                d.paintComponent(g);
                addMouseMotionListener(d);
            }
     }

     public void mouseWheelMoved(MouseWheelEvent e) {
        int rotazione = e.getWheelRotation();
        if(rotazione > 0)
            zoomIn();
        else
            zoomOut();
     }

    public void mouseClicked(MouseEvent e) {
        startDraw = true;
        System.out.println(3);
        Draw d = new Draw(e.getPoint(), this);
        disegni.add(d);
        repaint();
     }

    public void mouseDragged(MouseEvent e) {
    
     }

    public void mouseMoved(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }

    public boolean getGriglia() {
        return griglia;
     }

     public void setGriglia (boolean s) {
        griglia = s;
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