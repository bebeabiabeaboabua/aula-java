import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.*;

public class primeiroApp {
    public static void main(String[] args) {
        System.out.println("oi");

        JFrame frame = new JFrame("primeira janela");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("jo");
        button.setBackground(Color.GREEN);
        button.setForeground(Color.DARK_GRAY);
        button.setPreferredSize(new Dimension(80, 80));

        JLabel label = new JLabel("Que?");
        label.setFont(new Font("serif", Font.BOLD, 60));
        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 40));
        //acao para o botao
        button.addActionListener(e -> {
        JOptionPane.showMessageDialog(null, "errado", "titulo", 3);
        });

        JTextArea textArea = new JTextArea("sim realmente e verdade mesmo isso concordo cara arrasou muito fechou entao. concorda?");


        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.SOUTH);
        panel.add(button, BorderLayout.CENTER);
        frame.add(panel);
        frame.setLocationRelativeTo(null);






    }
}
