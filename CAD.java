import java.awt.*;
import javax.swing.*;

public class CAD extends JFrame{

    private int ALTEZZA = 720;
    private int LARGHEZZA = 1280;

    public static void main(String args[]) {
         new CAD();
    }

    public CAD() {
        setSize (LARGHEZZA, ALTEZZA);
        //palette colori: 1A1A2E (26, 26, 46) - 16213E (22, 33, 62) - 0F3460 (15, 52, 96) - E94560 (233, 69, 96)
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;

        add(new TitleBar(this),c);

        c.gridy = 1;
        add(new NavBar(), c);

        c.gridy = 200;
        add(new DrawPanel(), c);
        addKeyListener(new ShortCut());
        setUndecorated(true);
        setLocationRelativeTo(null);
        setFocusable(true);
        setResizable(false); 
        setVisible(true);
    }
}