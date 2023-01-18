
import java.awt.event.*;
import java.awt.*;


public class ExitButton extends TitleBarButton implements ActionListener {

    public ExitButton() {
        super();
        addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 10, 20, 20);
        g.drawLine(10, 20, 20, 10);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
     }
}
