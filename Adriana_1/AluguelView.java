import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class AluguelView extends TelaBase {

    private final JTextField tfDias = Tema.campo(12);
    private final JTextField tfKm = Tema.campo(12);
    private final JButton btnCalcular = Tema.botao("Calcular aluguel");
    private final JTextArea taResultado = Tema.areaTexto(6, 24);

    public AluguelView() {
        super("Aluguel de Carro", "Diária R$ 90,00 | 100 km inclusos por dia | R$ 0,50 por km extra", 640, 540);

        JPanel form = Tema.painelForm();
        Tema.linha(form, 0, "Dias de aluguel:", tfDias);
        Tema.linha(form, 1, "Quilometragem percorrida:", tfKm);

        corpo.add(Tema.bloco(form, Tema.painelBotoes(btnCalcular)), BorderLayout.NORTH);
        corpo.add(Tema.rolagem(taResultado), BorderLayout.CENTER);
    }

    public String getDias() { return tfDias.getText(); }
    public String getKm() { return tfKm.getText(); }
    public void setResultado(String texto) { taResultado.setText(texto); }

    public void addCalcularListener(ActionListener l) {
        btnCalcular.addActionListener(l);
        tfDias.addActionListener(l);
        tfKm.addActionListener(l);
    }
}
