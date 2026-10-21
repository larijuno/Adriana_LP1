import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class TemperaturaView extends TelaBase {

    private final DefaultTableModel tabelaModelo =
            new DefaultTableModel(new String[]{"Mês", "Temperatura", "Classificação"}, 0) {
                @Override public boolean isCellEditable(int linha, int coluna) { return false; }
            };
    private final JTable tabela = new JTable(tabelaModelo);
    private final JButton btnAnalisar = Tema.botao("Analisar temperaturas");
    private final JLabel lblMedia = new JLabel(" ");
    private final JLabel lblConclusao = new JLabel(" ");

    public TemperaturaView() {
        super("Temperatura", "Média mensal em São José dos Campos: frio (abaixo de 18 ºC) ou agradável?", 640, 720);

        tabela.setFont(Tema.TEXTO);
        tabela.setRowHeight(28);
        tabela.setBackground(Tema.FUNDO);
        tabela.setForeground(Tema.CLARO);
        tabela.setGridColor(Tema.BORDA);
        tabela.setSelectionBackground(Tema.DESTAQUE);
        tabela.setSelectionForeground(Tema.FUNDO);

        JTableHeader cabecalho = tabela.getTableHeader();
        cabecalho.setFont(Tema.NEGRITO);
        cabecalho.setBackground(Tema.BORDA);
        cabecalho.setForeground(Tema.CLARO);
        cabecalho.setReorderingAllowed(false);

        lblMedia.setFont(Tema.NEGRITO);
        lblMedia.setForeground(Tema.DESTAQUE);
        lblConclusao.setFont(Tema.NEGRITO);
        lblConclusao.setForeground(Tema.CLARO);

        JPanel resumo = new JPanel(new GridLayout(2, 1, 0, 6));
        resumo.setOpaque(false);
        resumo.setBorder(new EmptyBorder(4, 2, 0, 2));
        resumo.add(lblMedia);
        resumo.add(lblConclusao);

        corpo.add(Tema.painelBotoes(btnAnalisar), BorderLayout.NORTH);
        corpo.add(Tema.rolagem(tabela), BorderLayout.CENTER);
        corpo.add(resumo, BorderLayout.SOUTH);
    }

    public void limparTabela() { tabelaModelo.setRowCount(0); }

    public void adicionarLinha(String mes, String temperatura, String classificacao) {
        tabelaModelo.addRow(new Object[]{mes, temperatura, classificacao});
    }

    public void setMedia(String texto) { lblMedia.setText(texto); }
    public void setConclusao(String texto) { lblConclusao.setText(texto); }

    public void addAnalisarListener(ActionListener l) { btnAnalisar.addActionListener(l); }
}
