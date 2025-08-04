import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MeuApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MeuApp().criarJanela());
    }

    private Clip clip; // Som atual

    private void criarJanela() {
        JFrame frame = new JFrame("Quiz brain rot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Título centralizado
        JLabel titulo = new JLabel("ADIVINHE O BRAIN ROT PELO SOM");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 40));
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        // Painel com os botões e campos de texto
        JPanel botoesPanel = new JPanel(new GridLayout(4, 2, 20, 20)); // 4 linhas, 2 colunas

        // Novos itens adicionados às arrays
        String[] imagens = {
            "atumalaca.png", "lobo.png", "wenomechinsama.png", "nugget.png",
            "brainrot.png", "lapolizia.png", "Jet2Holidays.png", "finjoquenaopercebo.png"
        };

        String[] respostasCorretas = {
            "atumalaca", "lobo auu", "wenomechinsama", "chicken nugget",
            "italian brain rot ringtone", "no la polizia", "jet2holidays", "eu finjo que não percebo mas tudo está sendo observado"
        };

        String[] caminhosSom = {
            "som.wav", "lobo.wav", "wenomechinsama.wav", "nugget.wav",
            "ringtone.wav", "lapolizia.wav", "jet2-holiday.wav", "eu-finjo-que-nao-percebo.wav"
        };

        for (int i = 0; i < imagens.length; i++) {
            JPanel container = new JPanel(new BorderLayout());

            int index = i;

            JButton botao = new JButton();
            botao.setPreferredSize(new Dimension(150, 150));

            // Carrega e redimensiona a imagem corretamente
            try {
                BufferedImage imagemOriginal = ImageIO.read(new File(imagens[i]));
                Image imagemRedimensionada = imagemOriginal.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                botao.setIcon(new ImageIcon(imagemRedimensionada));
            } catch (IOException e) {
                e.printStackTrace();
            }

            JTextField campoTexto = new JTextField();
            campoTexto.setFont(new Font("Serif", Font.PLAIN, 20));

            // Quando clicar no botão, tocar o som correspondente
            botao.addActionListener(e -> {
                pararSom();
                tocarSom(caminhosSom[index]);
            });

            // Quando digitar no campo e apertar Enter, verificar resposta
            campoTexto.addActionListener(e -> {
                pararSom(); // parar o som de fundo

                String resposta = campoTexto.getText().trim().toLowerCase();
                if (resposta.equals(respostasCorretas[index])) {
                    tocarSom("yippee.wav"); // som de acerto
                    JOptionPane.showMessageDialog(null, "Acertou!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    tocarSom("miau.wav"); // som de erro
                    JOptionPane.showMessageDialog(null, "Errou.", "Resultado", JOptionPane.ERROR_MESSAGE);
                }

                pararSom(); // parar o som quando fechar o pop-up
                campoTexto.setText("");
            });

            container.add(botao, BorderLayout.CENTER);
            container.add(campoTexto, BorderLayout.SOUTH);
            botoesPanel.add(container);
        }

        panelPrincipal.add(botoesPanel, BorderLayout.CENTER);
        frame.add(panelPrincipal);
        frame.setVisible(true);
    }

    private void tocarSom(String caminho) {
        try {
            File audioFile = new File(caminho);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }

    private void pararSom() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}
