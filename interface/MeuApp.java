import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;

public class MeuApp {

    static Clip somPrincipal;
    static boolean camposVisiveis = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("primeira janela");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.PINK);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        topPanel.setBackground(Color.PINK);

        JLabel titulo = new JLabel("Acerte o brain rot pelo som");
        titulo.setFont(new Font("Serif", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);

        JButton tocarSomBtn = new JButton("Tocar Som");
        tocarSomBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        tocarSomBtn.setBackground(Color.GREEN);

        topPanel.add(titulo);
        topPanel.add(tocarSomBtn);
        panel.add(topPanel, BorderLayout.NORTH);

        somPrincipal = carregarSom("som.wav");
        Clip som1 = carregarSom("som.wav");
        Clip som2 = carregarSom("lobo.wav");
        Clip som3 = carregarSom("wenomechainsama.wav");
        Clip som4 = carregarSom("nugget.wav");

        tocarSomBtn.addActionListener(e -> tocarClip(somPrincipal));

        JPanel botoesPainel = new JPanel(new GridLayout(2, 2, 10, 10));
        botoesPainel.setBackground(Color.PINK);
        botoesPainel.setBorder(BorderFactory.createEmptyBorder(40, 40, 10, 40));

        // Campos de texto abaixo dos botões
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        JTextField campo3 = new JTextField();
        JTextField campo4 = new JTextField();

        campo1.setVisible(false);
        campo2.setVisible(false);
        campo3.setVisible(false);
        campo4.setVisible(false);

        // Painel para organizar botão + campo de texto juntos
        JPanel box1 = criarBotaoComCampo("atumalaca.png", som1, true, campo1);
        JPanel box2 = criarBotaoComCampo("lobo.png", som2, false, campo2);
        JPanel box3 = criarBotaoComCampo("wenamwchinsama.png", som3, false, campo3);
        JPanel box4 = criarBotaoComCampo("nugget.png", som4, false, campo4);

        botoesPainel.add(box1);
        botoesPainel.add(box2);
        botoesPainel.add(box3);
        botoesPainel.add(box4);

        panel.add(botoesPainel, BorderLayout.CENTER);

        JTextArea textArea = new JTextArea("In Internet culture, brain rot (or brainrot) is Internet content deemed to be of low quality or value, or the supposed negative psychological and cognitive effects caused by it...");
        textArea.setFont(new Font("Serif", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setBackground(Color.PINK);
        panel.add(textArea, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static JPanel criarBotaoComCampo(String imagem, Clip som, boolean ehCerto, JTextField campoTexto) {
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.setBackground(Color.PINK);

        JButton botao = new JButton(new ImageIcon(imagem));
        botao.setBackground(Color.WHITE);

        botao.addActionListener(e -> {
            pausarSomPrincipal();
            tocarClip(som);

            if (ehCerto) {
                JOptionPane.showMessageDialog(null, "Acertou!", "Atumalaca", JOptionPane.INFORMATION_MESSAGE);
                campoTexto.setVisible(true); // mostra os campos de texto se acertar
            } else {
                JOptionPane.showMessageDialog(null, "Errou!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            som.stop(); // para o som ao fechar a janelinha
        });

        campoTexto.setPreferredSize(new Dimension(100, 25));
        campoTexto.setVisible(false);

        painel.add(botao, BorderLayout.CENTER);
        painel.add(campoTexto, BorderLayout.SOUTH);

        return painel;
    }

    public static Clip carregarSom(String caminho) {
        try {
            File arquivo = new File(caminho);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            return clip;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar som: " + e.getMessage());
            return null;
        }
    }

    public static void tocarClip(Clip clip) {
        if (clip != null) {
            if (clip.isRunning()) clip.stop();
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static void pausarSomPrincipal() {
        if (somPrincipal != null && somPrincipal.isRunning()) {
            somPrincipal.stop();
        }
    }
}
