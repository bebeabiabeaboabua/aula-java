import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class segundoApp {
    public static void main(String[] args) {
        JFrame miJFrame = new JFrame("Exemplo - Java Swing");
        miJFrame.setSize(500,300);

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300,500);

        miJPanel.setLayout(new GridBagLayout());

        JLabel miJLabel = new JLabel();
        miJLabel.setText("Diga-me a sua opiniao sobre Java Swing");
        JTextArea miJTextArea = new JTextArea(5,20);

        miJPanel.add(miJLabel); miJPanel.add(miJTextArea);

        miJFrame.add(miJPanel);
        miJFrame.setVisible(true);

    }
}
