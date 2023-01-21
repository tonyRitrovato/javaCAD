import java.awt.*;
import javax.swing.*;

public class CAD extends JFrame{

    private int ALTEZZA = 720;
    private int LARGHEZZA = 1280;
    private TitleBar t = new TitleBar(this);
    private static NavBar n = new NavBar();
    private DrawPanel d = new DrawPanel();

    public static void main(String args[]) {
         new CAD();
    }

    public CAD() {
        setSize (LARGHEZZA, ALTEZZA);
        //palette colori: 1A1A2E (26, 26, 46) - 16213E (22, 33, 62) - 0F3460 (15, 52, 96) - E94560 (233, 69, 96)
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;

        add(t,c);

        c.gridy = 1;
        add(n, c);

        c.gridy = 200;
        add(d, c);
        addKeyListener(new ShortCut(this));
        setUndecorated(true);
        setLocationRelativeTo(null);
        setFocusable(true);
        setResizable(false); 
        setVisible(true);
    }

    public TitleBar getTitleBar() {
        return t;
    }

    public DrawPanel getDrawPanel() {
        return d;
    }

    public static NavBar getNavBar() {
        return n;
    }
}