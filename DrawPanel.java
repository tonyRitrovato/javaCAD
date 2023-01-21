
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseMotionListener, MouseListener {

    public int ALTEZZA = 660;
    public int LARGHEZZA = 1280;
    private boolean griglia = true;
    private boolean startDraw = false;
    private int turno = -3;
    private int thick = 1;
    private boolean fill = false;
    private Color colore = CAD.getNavBar().getColore();

    private ArrayList<Draw> disegni = new ArrayList<Draw>();

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        addMouseMotionListener(this);
        addMouseListener(this);
     }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(griglia == true) {
            g.setColor(new Color(225,225,225));
             for(int i = 0; i < getWidth(); i += 20)
                g.drawLine(i, 0, i,  (getHeight()));
            for(int i = 0; i < getHeight(); i += (20))
                g.drawLine(0, i, (getWidth()), i);
        }
        if(startDraw == true) {
            for(Draw d : disegni)
                d.paintComponent(g);
        }
     }

     public void setTurno() {
        this.turno = CAD.getNavBar().getTurno();
     }

     public void setColore() {
        this.colore = CAD.getNavBar().getColore();
     }

     public void setFill() {
        this.fill = CAD.getNavBar().getFill();
     }

     public void setThick() {
        this.thick = CAD.getNavBar().getThick();
     }

     public void mouseDragged(MouseEvent e) {
        if(turno > 1) {
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
            repaint();
        }
      }

     public void mouseMoved(MouseEvent e) {
        setTurno();
        setColore();
        setFill();
        setThick();
      }
 
     public void mouseClicked(MouseEvent e) {
        if(turno == 1) {
            Punto p = new Punto(colore, new BasicStroke(thick), e.getPoint());
            disegni.add(p);
            repaint();
        }
      }
 
     public void mousePressed(MouseEvent e) {
        startDraw = true;
        switch(turno) {
            case 2: Line l = new Line(colore, new BasicStroke(thick), e.getPoint()); disegni.add(l); break;
            case 3: Rectangle r = new Rectangle(colore, new BasicStroke(thick), e.getPoint(), fill); disegni.add(r); break;
            case 4: Oval d = new Oval(colore, new BasicStroke(thick), e.getPoint(), fill); disegni.add(d); break;
        }
      }
 
     public void mouseReleased(MouseEvent e) {
        if(turno > 1) {
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
        }
      }
 
     public void mouseEntered(MouseEvent e) { }
 
     public void mouseExited(MouseEvent e) { }

    public boolean getGriglia() {
        return griglia;
     }

     public void setGriglia (boolean s) {
        griglia = s;
     }
}