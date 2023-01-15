import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Testing {
  public static void main(String args[]) {
    JFrame frame = new JFrame("My Frame");
frame.setLayout(new GridBagLayout());
GridBagConstraints c = new GridBagConstraints();
frame.setSize(1280, 720);

JPanel panel1 = new JPanel();
panel1.setBackground(new Color(255,255,0));
c.fill = GridBagConstraints.BOTH;
c.gridx = 0;
c.gridy = 0;
c.weightx = 0.33;
c.weighty = 1;
frame.add(panel1, c);

JPanel panel2 = new JPanel();
c.fill = GridBagConstraints.BOTH;
c.gridx = 1;
c.gridy = 0;
c.weightx = 0.33;
c.weighty = 1;
frame.add(panel2, c);

JPanel panel3 = new JPanel();
panel3.setPreferredSize(new Dimension(400,720));
JButton button = new JButton("My button");
panel3.add(button);
c.fill = GridBagConstraints.BOTH;
c.gridx = 2;
c.gridy = 0;
c.weightx = 0.33;
c.weighty = 1;
frame.add(panel3, c);
frame.setVisible(true);
  }
}