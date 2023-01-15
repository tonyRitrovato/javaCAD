import java.awt.event.*;
import java.awt.*;


public class ExitButton extends TitleBarButton implements ActionListener, MouseListener {

    public ExitButton() {
        super();
        addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(5, 5, 25, 25);
        g.drawLine(5, 25, 25, 5);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
     }

    public void mouseClicked(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }
    
}
