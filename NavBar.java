import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {

    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
    
    public NavBar() { 
        setBackground(new Color(22, 33, 62));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        FileMenu file = new FileMenu();
        add(file);
    }
}
