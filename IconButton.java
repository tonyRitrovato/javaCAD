
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

public class IconButton extends TitleBarButton implements ActionListener {

    JFrame riferimento;

    public IconButton(JFrame riferimento) {
        super();
        this.riferimento = riferimento;
        addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 20, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        riferimento.setState(JFrame.ICONIFIED);
     }
}