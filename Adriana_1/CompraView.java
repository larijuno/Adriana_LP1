import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CompraView extends TelaBase {

    private final List<JComboBox<String>> combos = new ArrayList<>();
    private final List<JSpinner> spinners = new ArrayList<>();
    private final List<JLabel> subtotais = new ArrayList<>();

    private final JPanel itens = Tema.painelForm();
    private final JTextArea taRecibo = Tema.areaTexto(20, 30);
    private final JButton btnFinalizar = Tema.botao("Finalizar compra");
    private final JButton btnLimpar = Tema.botaoSecundario("Limpar");

    public CompraView() {
        super("Compra com Desconto", "Monte o carrinho: compras acima de R$ 100,00 ganham 10% de desconto.", 1260, 700);

        JScrollPane rolagemItens = new JScrollPane(itens);
        rolagemItens.setBorder(null);
        rolagemItens.setOpaque(false);
        rolagemItens.getViewport().setOpaque(false);
        rolagemItens.getVerticalScrollBar().setUnitIncrement(16);

        JPanel esquerda = new JPanel(new BorderLayout(0, 12));
        esquerda.setOpaque(false);
        esquerda.add(rolagemItens, BorderLayout.CENTER);
        esquerda.add(Tema.painelBotoes(btnFinalizar, btnLimpar), BorderLayout.SOUTH);

        corpo.add(esquerda, BorderLayout.CENTER);
        corpo.add(Tema.rolagem(taRecibo), BorderLayout.EAST);
    }

    /** Monta uma linha (produto, opção, quantidade, subtotal) para cada categoria. */
    public void montarCatalogo(List<String> categorias, List<List<String>> rotulos) {
        GridBagConstraints g = new GridBagConstraints();
        g.anchor = GridBagConstraints.WEST;
        g.insets = new Insets(6, 4, 6, 12);

        String[] cabecalho = {"Produto", "Opção", "Qtd.", "Subtotal"};
        for (int c = 0; c < cabecalho.length; c++) {
            JLabel l = Tema.rotulo(cabecalho[c]);
            l.setFont(Tema.NEGRITO);
            l.setForeground(Tema.DESTAQUE);
            g.gridx = c;
            g.gridy = 0;
            itens.add(l, g);
        }

        for (int i = 0; i < categorias.size(); i++) {
            JLabel nome = Tema.rotulo(categorias.get(i));
            JComboBox<String> combo = Tema.combo(rotulos.get(i).toArray(new String[0]));
            JSpinner spinner = Tema.spinner(0, 99);
            JLabel subtotal = Tema.rotulo(Tema.moeda(0));
            subtotal.setHorizontalAlignment(SwingConstants.RIGHT);
            subtotal.setPreferredSize(new Dimension(110, 24));

            g.gridy = i + 1;

            g.gridx = 0; g.weightx = 0; g.fill = GridBagConstraints.NONE;
            itens.add(nome, g);
            g.gridx = 1; g.weightx = 1; g.fill = GridBagConstraints.HORIZONTAL;
            itens.add(combo, g);
            g.gridx = 2; g.weightx = 0; g.fill = GridBagConstraints.NONE;
            itens.add(spinner, g);
            g.gridx = 3;
            itens.add(subtotal, g);

            combos.add(combo);
            spinners.add(spinner);
            subtotais.add(subtotal);
        }

        // empurra as linhas para o topo
        g.gridx = 0;
        g.gridy = categorias.size() + 1;
        g.weighty = 1;
        itens.add(Box.createVerticalGlue(), g);

        itens.revalidate();
        itens.repaint();
    }

    public int getQuantidadeLinhas() { return combos.size(); }
    public int getOpcao(int linha) { return combos.get(linha).getSelectedIndex(); }
    public int getQuantidade(int linha) { return (Integer) spinners.get(linha).getValue(); }
    public void setSubtotal(int linha, String texto) { subtotais.get(linha).setText(texto); }
    public void setRecibo(String texto) { taRecibo.setText(texto); }

    public void limpar() {
        for (int i = 0; i < combos.size(); i++) {
            combos.get(i).setSelectedIndex(0);
            spinners.get(i).setValue(0);
        }
        taRecibo.setText("");
    }

    /** Executa o código sempre que uma opção ou quantidade for alterada. */
    public void addAlteracaoListener(Runnable acao) {
        for (JComboBox<String> c : combos) {
            c.addActionListener(e -> acao.run());
        }
        for (JSpinner s : spinners) {
            s.addChangeListener(e -> acao.run());
        }
    }

    public void addFinalizarListener(ActionListener l) { btnFinalizar.addActionListener(l); }
    public void addLimparListener(ActionListener l) { btnLimpar.addActionListener(l); }
}
