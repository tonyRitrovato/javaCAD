import javax.swing.*;
import java.awt.*;

public class NavBar extends JPanel {

    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 1280;
    
    public NavBar() { 
        setBackground(new Color(22, 33, 62));
        setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        JPanel padding = new JPanel();
        padding.setBackground(new Color(22, 33, 62));
        //setBorderPainted(false);
        FileMenu file = new FileMenu();
        DrawButton j = new DrawButton();
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.WEST;
        add(file, c);
        add(j , c);
        c.weightx = 1190;
        add(padding, c);
    }
}
