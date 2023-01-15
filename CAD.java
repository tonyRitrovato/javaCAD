import java.awt.*;
import javax.swing.JFrame;

public class CAD extends JFrame{

    int ALTEZZA = 720;
    int LARGHEZZA = 1280;

    public static void main(String args[]) {
        CAD cad = new CAD();
    }

    public CAD() {
        setSize (1280, 720);
        //palette colori: 1A1A2E (26, 26, 46) - 16213E (22, 33, 62) - 0F3460 (15, 52, 96) - E94560 (233, 69, 96)
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;
        TitleBar t = new TitleBar();
        t.setPreferredSize(new Dimension(TitleBar.LARGHEZZA, TitleBar.ALTEZZA));
        add(t,c);

        c.gridy = 1;
        NavBar n = new NavBar();
        n.setPreferredSize(new Dimension(NavBar.LARGHEZZA, NavBar.ALTEZZA));
        add(n, c);

        c.gridy = 2;
        DrawPanel d = new DrawPanel();
        d.setPreferredSize(new Dimension(DrawPanel.LARGHEZZA, DrawPanel.ALTEZZA));
        add(d, c);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }
}