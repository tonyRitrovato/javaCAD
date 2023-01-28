package NavBar;

import javax.swing.*;
import java.awt.*;

public class FileMenuOption extends JMenuItem {

    private int ALTEZZA = 30;
    private int LARGHEZZA = 55;
    private Font f = new Font("Calibri", Font.PLAIN, 14);
    private Color COLORE = new Color(22, 33, 62);

    public FileMenuOption() {
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setBackground(COLORE);
        setFont(f);
        setHorizontalAlignment(SwingConstants.CENTER);
        setForeground(Color.WHITE);
        setBorderPainted(false);
    }
}
