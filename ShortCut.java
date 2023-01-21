
import java.awt.event.*;


public class ShortCut implements KeyListener{

    private CAD cad;

    public ShortCut(CAD cad) {
        this.cad = cad;
    }

    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == KeyEvent.VK_G)
            gestioneGriglia();
      }

    public void keyPressed(KeyEvent e) {  }

    public void keyReleased(KeyEvent e) {  }

    public void gestioneGriglia() {
        boolean griglia = cad.getDrawPanel().getGriglia();
        griglia = (griglia == true) ? false : true;
         cad.getDrawPanel().setGriglia(griglia);
         cad.getDrawPanel().repaint();
     }
}
