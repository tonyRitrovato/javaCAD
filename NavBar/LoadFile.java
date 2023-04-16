package NavBar;

import java.awt.event.*;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.ArrayList;

import Singleton.Singleton;
import Draw.*;

public class LoadFile extends FileMenuOption implements ActionListener{

    Singleton s = Singleton.getInstance();
    
    public LoadFile() { 
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();

        try (FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn)) {

            // Legge l'oggetto dal file
                ArrayList<Draw> disegni = (ArrayList<Draw>) in.readObject();
                s.setDraw(disegni);
                s.setStartDraw(true);
                s.getPanel().repaint();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        }
     }
}
