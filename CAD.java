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
        add(new TitleBar(this),c);

        c.gridy = 1;
        add(new NavBar(), c);

        c.gridy = 2;
        add(new DrawPanel(), c);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }
}