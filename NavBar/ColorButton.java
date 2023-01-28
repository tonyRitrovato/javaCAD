package NavBar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Singleton.Singleton;

public class ColorButton extends DrawButton implements ActionListener{

    private int turno = -1;
    private Color colore;
    private Singleton s = Singleton.getInstance();

    public ColorButton() {
        super();
        super.turno = this.turno;
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
