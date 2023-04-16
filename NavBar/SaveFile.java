package NavBar;

import java.awt.event.*;
import java.io.*;

import Singleton.Singleton;

import javax.swing.JFileChooser;

import Draw.Draw;

public class SaveFile extends FileMenuOption implements ActionListener{

    Singleton s = Singleton.getInstance();
    
    public SaveFile() { 
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File("object.ser"));
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
      
            try (FileOutputStream fileOut = new FileOutputStream(file);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
      
              // Scrive l'oggetto nel file
                  out.writeObject(s.getDraw());
      
            } catch (IOException ex) {
              ex.printStackTrace();
            }
          }
     }
}
