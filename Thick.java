
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Thick extends JSlider implements ChangeListener{

    private int thick;

    public Thick() {
        super();
        setMinimum(1);
        setMaximum(10);
        setValue(1);
        setPaintTicks(true);
        setMajorTickSpacing(10);
        setBackground(new Color(22,33,62));
        setForeground(new Color(255,255,255));
        addChangeListener(this);
    }

    public int getThick() {
        return thick;
    }

    public void stateChanged(ChangeEvent e) { 
        this.thick = getValue();
     }
}