import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

public class MenuView extends TelaBase {

    private final List<JButton> botoes = new ArrayList<>();

    public MenuView(String[] opcoes) {
        super("Exercícios Java", "Qual você deseja executar?", 520, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel lista = new JPanel(new GridLayout(opcoes.length, 1, 0, 10));
        lista.setOpaque(false);
        for (String opcao : opcoes) {
            JButton b = Tema.botao(opcao);
            b.setHorizontalAlignment(SwingConstants.LEFT);
            botoes.add(b);
            lista.add(b);
        }
        corpo.add(lista, BorderLayout.CENTER);
    }

    /** Avisa qual opção (1, 2, 3...) foi clicada. */
    public void addOpcaoListener(IntConsumer consumidor) {
        for (int i = 0; i < botoes.size(); i++) {
            final int numero = i + 1;
            botoes.get(i).addActionListener(e -> consumidor.accept(numero));
        }
    }
}
