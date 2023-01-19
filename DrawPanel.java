
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseWheelListener, MouseMotionListener, MouseListener {

    public int ALTEZZA = 660;
    public int LARGHEZZA = 1280;
    private boolean griglia = true;
    private double zoomFactor = 1.0;
    private int zoomIndex = 10000;
    private boolean startDraw = false;
    private int turno;
    private ArrayList<Draw> disegni = new ArrayList<Draw>();

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        addMouseWheelListener(this);
        addMouseMotionListener(this);
        addMouseListener(this);
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
        if(startDraw == true) {
            for(Draw d : disegni)
                d.paintComponent(g);
        }
     }

     public void setTurno() {
        this.turno = CAD.getNavBar().getTurno();
     }

     public void mouseDragged(MouseEvent e) {
        if(turno != 1) {
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
            repaint();
        }
      }

     public void mouseMoved(MouseEvent e) {
        setTurno();
      }
 
     public void mouseClicked(MouseEvent e) {
        if(turno == 1) {
            Punto p = new Punto(Color.black, new BasicStroke(1), e.getPoint());
            disegni.add(p);
            repaint();
        }
      }
 
     public void mousePressed(MouseEvent e) {
        startDraw = true;
        switch(turno) {
            case 2: Line l = new Line(Color.black, new BasicStroke(1), e.getPoint()); disegni.add(l); break;
        }
      }
 
     public void mouseReleased(MouseEvent e) {
        if(turno != 1) {
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
        }
      }
 
     public void mouseEntered(MouseEvent e) { }
 
     public void mouseExited(MouseEvent e) { }

     public void mouseWheelMoved(MouseWheelEvent e) {
        int rotazione = e.getWheelRotation();
        if(rotazione > 0)
            zoomIn();
        else
            zoomOut();
     }

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