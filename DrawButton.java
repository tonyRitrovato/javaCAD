import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawButton extends JButton implements ActionListener {
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 30;
    public int TURN;
    private int PREVIOUS_TURN;
    private Color COLORE = new Color(22, 33, 62);
    private Color ATTIVO = new Color(12, 23, 52);
    private boolean stato = false;
    private DrawButton gruppo[] = new DrawButton[8];

    public DrawButton() {
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setBackground(COLORE);
        setForeground(Color.WHITE);
        setBorderPainted(false);
        addActionListener(this);
    }

    public void setGruppo(DrawButton gruppo[]) {
        this.gruppo = gruppo;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(stato == true)
            setBackground(ATTIVO);
        else
            setBackground(COLORE);
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    } 

    public boolean getStato(boolean stato) {
        return stato;
    }

    public void actionPerformed(ActionEvent e) {
        stato = (stato == true) ? false : true;
        if(stato == true)
            for(DrawButton g : gruppo) 
                if(g.TURN != this.TURN)
                    g.setStato(false);
    }
}
