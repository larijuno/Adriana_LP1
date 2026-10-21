import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public abstract class TelaBase extends JFrame {

    protected final JPanel corpo = new JPanel(new BorderLayout(14, 14));

    protected TelaBase(String titulo, String descricao, int largura, int altura) {
        super(titulo);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(largura, altura);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Tema.FUNDO);
        setLayout(new BorderLayout(0, 14));

        JPanel cabecalho = new JPanel(new GridLayout(2, 1, 0, 4));
        cabecalho.setBackground(Tema.FUNDO);
        cabecalho.setBorder(new EmptyBorder(20, 28, 0, 28));
        cabecalho.add(Tema.titulo(titulo));
        cabecalho.add(Tema.subtitulo(descricao));
        add(cabecalho, BorderLayout.NORTH);

        corpo.setBackground(Tema.PAINEL);
        corpo.setBorder(new CompoundBorder(new LineBorder(Tema.BORDA, 2), new EmptyBorder(20, 22, 20, 22)));

        JPanel moldura = new JPanel(new BorderLayout());
        moldura.setBackground(Tema.FUNDO);
        moldura.setBorder(new EmptyBorder(0, 28, 28, 28));
        moldura.add(corpo, BorderLayout.CENTER);
        add(moldura, BorderLayout.CENTER);
    }

    public void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
    }
}
