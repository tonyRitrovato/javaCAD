import java.awt.*;
import javax.swing.*;
import TitleBar.TitleBar;
import NavBar.NavBar;
import DrawPanel.DrawPanel;

public class CAD extends JFrame{

    private int ALTEZZA = 720;
    private int LARGHEZZA = 1280;

    public static void main(String args[]) {
         new CAD();
    }

    public CAD() {
        setSize (LARGHEZZA, ALTEZZA);
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