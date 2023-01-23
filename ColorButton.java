
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorButton extends DrawButton implements ActionListener{

    public int TURN = -1;
    private Color colore;
    private Singleton s = Singleton.getInstance();

    public ColorButton() {
        super();
        super.TURN = this.TURN;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(colore);
        g.fillRect(5, 5, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        JColorChooser colorChooser = new JColorChooser();
        colore = colorChooser.showDialog(null, "scegli un colore", colore);
        s.setColore(colore);
        repaint();
    }
    
}
