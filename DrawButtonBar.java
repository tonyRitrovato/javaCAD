import javax.swing.*;
import java.awt.*;

public class DrawButtonBar extends JPanel {
    
    private DrawButton drawButton[] = new DrawButton[9];
    private int turno;
    
    public DrawButtonBar() {
        setBackground(new Color(22, 33, 62));
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.WEST;

        drawButton[0] = new Move();
        drawButton[1] = new PointButton();
        drawButton[2] = new LineButton();
        drawButton[3] = new RectangleButton();
        drawButton[4] = new PolygonButton();
        drawButton[5] = new CircleButton();
        drawButton[6] = new Fill();
        drawButton[7] = new ColorButton();
        drawButton[8] = new ThickButton();

        for(DrawButton d : drawButton) {
            d.setGruppo(drawButton);
            d.setBar(this);
            add(d);
        } 
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno() {
        for(DrawButton d : drawButton)
            if(d.getStato() == true)
                this.turno = d.getTurn();            
    }
}
