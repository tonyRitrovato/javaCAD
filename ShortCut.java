
import java.awt.event.*;


public class ShortCut implements KeyListener{

    Singleton s = Singleton.getInstance();

    public ShortCut() { }

    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == KeyEvent.VK_G) 
            gestioneGriglia();
     }

    public void keyPressed(KeyEvent e) { }

    public void keyReleased(KeyEvent e) {  }

    private void gestioneGriglia() {
        boolean griglia = s.getGriglia();
        griglia = (griglia == true) ? false : true;
        s.setGriglia(griglia);
        s.getPanel().repaint();
     }
}
