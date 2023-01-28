package Singleton;

import java.awt.*;

import DrawPanel.DrawPanel;

public class Singleton {

    private static Singleton instance;
    private int turno;
    private Color colore;
    private boolean fill;
    private boolean griglia = true;
    private int thick;
    private DrawPanel panel;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public DrawPanel getPanel() {
        return panel;
    }

    public void setPanel(DrawPanel panel) {
        this.panel = panel;
    }
    
    public int getThick() {
        return thick;
    }

    public void setThick(int thick) {
        this.thick = thick;
    }

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public boolean getGriglia() {
        return griglia;
    }

    public void setGriglia(boolean griglia) {
        this.griglia = griglia;
    }
}
