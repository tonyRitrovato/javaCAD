
import javax.swing.*;
import java.awt.*;

public class TitleBarButton extends JButton {

    public static  Color COLORE = new Color(15, 52, 96);
    public static Color HOVER = new Color(15, 52, 106); 
    public static int ALTEZZA = 30;
    public static int LARGHEZZA = 30;

    public TitleBarButton() {
        setSize(ALTEZZA, LARGHEZZA);
        setBorderPainted(false);
        setForeground(new Color(255, 255, 255));
        setBackground(COLORE);
     }
}
