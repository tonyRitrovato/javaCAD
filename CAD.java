import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CAD extends JFrame{

    int ALTEZZA = 720;
    int LARGHEZZA = 1280;

    public CAD() {
        //setSize (1280, 720);
        //getContentPane().setBackground(new Color(36,52,71)); colore griglia
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