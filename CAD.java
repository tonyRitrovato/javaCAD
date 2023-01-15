import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CAD extends JFrame{

    int ALTEZZA = 720;
    int LARGHEZZA = 1280;

    public CAD() {
        setSize (1280, 720);
        //getContentPane().setBackground(new Color(36,52,71)); palette colori: 1A1A2E (26, 26, 46) - 16213E (22, 33, 62) - 0F3460 (15, 52, 96) - E94560 (233, 69, 96)
        add(new TitleBar());
        add(new NavBar());
        add(new DrawPanel());
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setUndecorated(true);
        setLocation (50,50);
        setResizable(false); 
        setVisible(true);
        //setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
}