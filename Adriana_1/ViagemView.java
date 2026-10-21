import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class ViagemView extends TelaBase {

    private final JTextField tfKm = Tema.campo(12);
    private final JTextField tfPreco = Tema.campo(12);
    private final JButton btnCalcular = Tema.botao("Calcular");
    private final JTextArea taResultado = Tema.areaTexto(6, 24);

    public ViagemView() {
        super("Calculadora de Viagem", "Consumo de 12 km/L. Acima de 500 km, 5% de desconto.", 580, 540);

        JPanel form = Tema.painelForm();
        Tema.linha(form, 0, "Distância (km):", tfKm);
        Tema.linha(form, 1, "Preço do combustível (R$/L):", tfPreco);

        corpo.add(Tema.bloco(form, Tema.painelBotoes(btnCalcular)), BorderLayout.NORTH);
        corpo.add(Tema.rolagem(taResultado), BorderLayout.CENTER);
    }

    public String getKm() { return tfKm.getText(); }
    public String getPreco() { return tfPreco.getText(); }
    public void setResultado(String texto) { taResultado.setText(texto); }

    public void addCalcularListener(ActionListener l) {
        btnCalcular.addActionListener(l);
        tfKm.addActionListener(l);
        tfPreco.addActionListener(l);
    }
}
