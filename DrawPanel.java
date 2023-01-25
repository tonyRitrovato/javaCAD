
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements MouseMotionListener, MouseListener {

    private int ALTEZZA = 660;
    private int LARGHEZZA = 1280;
    private boolean griglia;
    private boolean startDraw = false;
    private int turno = -3;
    private Singleton s = Singleton.getInstance();
    private Selection sel;

    private ArrayList<Draw> disegni = new ArrayList<Draw>();

    public DrawPanel() {
        setBackground(new Color(255,255,255));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        s.setPanel(this);
        addMouseMotionListener(this);
        addMouseListener(this);
        setFocusable(false);
     }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        griglia = s.getGriglia();
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


     public void mouseDragged(MouseEvent e) {
        if(turno > -1) {
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
            if(turno == 0) {
                for(int i = 0; i < disegni.size() - 1; i++)
                    if(disegni.get(i).intersects(sel)) 
                        disegni.get(i).setColore(new Color(25,25,25));
            }
            repaint();
        }
      }

     public void mouseMoved(MouseEvent e) { }
 
     public void mouseClicked(MouseEvent e) {
        if(turno == 1) {
            Punto p = new Punto(s.getColore(), new BasicStroke(s.getThick()), e.getPoint());
            disegni.add(p);
            repaint();
        }
      }
 
     public void mousePressed(MouseEvent e) {
         turno = s.getTurno();
         startDraw = true;
         switch(turno) {
            case 0: sel = new Selection(new Color(105,255,171), new BasicStroke(1), e.getPoint());  disegni.add(sel); break;
            case 2: Line l = new Line(s.getColore(), new BasicStroke(s.getThick()), e.getPoint()); disegni.add(l); break;
            case 3: Rectangle r = new Rectangle(s.getColore(), new BasicStroke(s.getThick()), e.getPoint(), s.getFill()); disegni.add(r); break;
            case 4: Oval d = new Oval(s.getColore(), new BasicStroke(s.getThick()), e.getPoint(), s.getFill()); disegni.add(d); break;
        }
      }
 
     public void mouseReleased(MouseEvent e) {
        if(turno > 1) 
            disegni.get(disegni.size() - 1).setPunto(e.getPoint());
        if(turno == 0) 
           disegni.remove(disegni.size() - 1);
        repaint();
      }
 
     public void mouseEntered(MouseEvent e) { }
 
     public void mouseExited(MouseEvent e) { }

}