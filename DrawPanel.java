import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public static int ALTEZZA = 660;
    public static int LARGHEZZA = 1280;

    public DrawPanel() {
        setBackground(new Color(26, 26, 46));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
     }
}