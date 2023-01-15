
import javax.swing.JPanel;

import java.awt.*;

public class TitleBar extends JPanel {
    
    private int ALTEZZA = 30;
    private int LARGHEZZA = getWidth();

    public TitleBar() {
        setBackground(new Color(12, 12 ,12));
        setSize(LARGHEZZA, ALTEZZA);
    }
}
