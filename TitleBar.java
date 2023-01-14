
import javax.swing.JPanel;

import java.awt.*;

public class TitleBar extends JPanel {
    
    private int ALTEZZA = 10;
    private int LARGHEZZA = 1280;

    public TitleBar() {
        setBackground(new Color(12, 12 ,12));
        setSize(LARGHEZZA, ALTEZZA);
    }
}
