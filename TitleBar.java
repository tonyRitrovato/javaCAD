
import javax.swing.JPanel;
import java.awt.*;

public class TitleBar extends JPanel {
    
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;

    public TitleBar() {
        setBackground(new Color(255,255,255));
        setSize(LARGHEZZA, ALTEZZA);
        ExitButton exit = new ExitButton();
        add(exit);
    }
}
