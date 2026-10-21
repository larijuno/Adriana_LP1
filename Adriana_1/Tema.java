import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Paleta de cores, fontes e componentes estilizados usados por todas as Views.
 */
public class Tema {

    // Paleta
    public static final Color FUNDO     = new Color(0x350a06);
    public static final Color PAINEL    = new Color(0x56070c);
    public static final Color BORDA     = new Color(0x8f3d38);
    public static final Color DESTAQUE  = new Color(0xFFFFFF);
    public static final Color CLARO     = new Color(0xEABFBF);

    // Fontes
    public static final Font TITULO  = new Font("SansSerif", Font.BOLD, 24);
    public static final Font TEXTO   = new Font("SansSerif", Font.PLAIN, 14);
    public static final Font NEGRITO = new Font("SansSerif", Font.BOLD, 14);
    public static final Font MONO    = new Font("Monospaced", Font.PLAIN, 14);

    private static final Locale PT_BR = Locale.of("pt", "BR");

    public static void aplicar() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            // segue com o visual padrão
        }
        UIManager.put("Panel.background", PAINEL);
        UIManager.put("OptionPane.background", PAINEL);
        UIManager.put("OptionPane.messageForeground", CLARO);
        UIManager.put("Button.background", DESTAQUE);
        UIManager.put("Button.foreground", FUNDO);
        UIManager.put("Button.select", CLARO);
        UIManager.put("ComboBox.selectionBackground", DESTAQUE);
        UIManager.put("ComboBox.selectionForeground", FUNDO);
    }

    // ---------- Rótulos ----------

    public static JLabel titulo(String texto) {
        JLabel l = new JLabel(texto);
        l.setFont(TITULO);
        l.setForeground(DESTAQUE);
        return l;
    }

    public static JLabel subtitulo(String texto) {
        JLabel l = new JLabel(texto);
        l.setFont(TEXTO);
        l.setForeground(CLARO);
        return l;
    }

    public static JLabel rotulo(String texto) {
        JLabel l = new JLabel(texto);
        l.setFont(TEXTO);
        l.setForeground(CLARO);
        return l;
    }

    // ---------- Campos ----------

    public static JTextField campo(int colunas) {
        JTextField c = new JTextField(colunas);
        estilizarCampo(c);
        return c;
    }

    public static JPasswordField campoSenha(int colunas) {
        JPasswordField c = new JPasswordField(colunas);
        estilizarCampo(c);
        return c;
    }

    private static void estilizarCampo(JTextField c) {
        c.setFont(TEXTO);
        c.setBackground(CLARO);
        c.setForeground(FUNDO);
        c.setCaretColor(FUNDO);
        c.setBorder(new CompoundBorder(new LineBorder(DESTAQUE, 2), new EmptyBorder(6, 8, 6, 8)));
    }

    public static JSpinner spinner(int min, int max) {
        JSpinner s = new JSpinner(new SpinnerNumberModel(min, min, max, 1));
        JTextField tf = ((JSpinner.DefaultEditor) s.getEditor()).getTextField();
        tf.setFont(TEXTO);
        tf.setBackground(CLARO);
        tf.setForeground(FUNDO);
        s.setBorder(new LineBorder(DESTAQUE, 2));
        s.setPreferredSize(new Dimension(80, 32));
        return s;
    }

    public static JComboBox<String> combo(String[] opcoes) {
        JComboBox<String> c = new JComboBox<>(opcoes);
        c.setFont(TEXTO);
        c.setBackground(CLARO);
        c.setForeground(FUNDO);
        c.setPreferredSize(new Dimension(280, 32));
        return c;
    }

    // ---------- Botões ----------

    public static JButton botao(String texto) {
        return criarBotao(texto, DESTAQUE, FUNDO, CLARO);
    }

    public static JButton botaoSecundario(String texto) {
        return criarBotao(texto, BORDA, CLARO, new Color(0xa84e48));
    }

    private static JButton criarBotao(String texto, Color fundo, Color letra, Color hover) {
        JButton b = new JButton(texto);
        b.setFont(NEGRITO);
        b.setBackground(fundo);
        b.setForeground(letra);
        b.setOpaque(true);
        b.setFocusPainted(false);
        b.setBorder(new CompoundBorder(new LineBorder(CLARO, 1), new EmptyBorder(10, 22, 10, 22)));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { b.setBackground(hover); }
            @Override public void mouseExited(MouseEvent e)  { b.setBackground(fundo); }
        });
        return b;
    }

    // ---------- Áreas de texto e painéis ----------

    public static JTextArea areaTexto(int linhas, int colunas) {
        JTextArea a = new JTextArea(linhas, colunas);
        a.setEditable(false);
        a.setFont(MONO);
        a.setBackground(FUNDO);
        a.setForeground(CLARO);
        a.setMargin(new Insets(12, 14, 12, 14));
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        return a;
    }

    public static JScrollPane rolagem(Component c) {
        JScrollPane sp = new JScrollPane(c);
        sp.setBorder(new LineBorder(BORDA, 2));
        sp.getViewport().setBackground(FUNDO);
        return sp;
    }

    /** Painel transparente em grade, para formulários (rótulo + campo). */
    public static JPanel painelForm() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setOpaque(false);
        return p;
    }

    public static void linha(JPanel p, int y, String texto, JComponent componente) {
        GridBagConstraints g = new GridBagConstraints();
        g.gridy = y;
        g.anchor = GridBagConstraints.WEST;
        g.gridx = 0;
        g.insets = new Insets(6, 0, 6, 14);
        p.add(rotulo(texto), g);
        g.gridx = 1;
        g.weightx = 1;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(6, 0, 6, 0);
        p.add(componente, g);
    }

    /** Painel transparente com botões alinhados à esquerda. */
    public static JPanel painelBotoes(JButton... botoes) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        p.setOpaque(false);
        for (JButton b : botoes) {
            p.add(b);
            p.add(Box.createHorizontalStrut(10));
        }
        return p;
    }

    /** Formulário em cima, botões embaixo. */
    public static JPanel bloco(JPanel form, JPanel botoes) {
        JPanel p = new JPanel(new BorderLayout(0, 14));
        p.setOpaque(false);
        p.add(form, BorderLayout.NORTH);
        p.add(botoes, BorderLayout.CENTER);
        return p;
    }

    // ---------- Formatação / leitura ----------

    public static String moeda(double valor) {
        return NumberFormat.getCurrencyInstance(PT_BR).format(valor);
    }

    public static String decimal(double valor) {
        return String.format(PT_BR, "%.2f", valor);
    }

    /** Aceita vírgula ou ponto como separador decimal. */
    public static double lerNumero(String texto) {
        return Double.parseDouble(texto.trim().replace(",", "."));
    }
}
