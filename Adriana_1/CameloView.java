import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class CameloView extends TelaBase {

    private final JTextField tfQtd = Tema.campo(12);
    private final JButton btnDividir = Tema.botao("Dividir a herança");
    private final JTextArea taResultado = Tema.areaTexto(6, 24);

    public CameloView() {
        super("Os Trinta e Cinco Camelos", "Metade, um terço e um nono: como dividir a herança?", 580, 520);

        JPanel form = Tema.painelForm();
        Tema.linha(form, 0, "Quantidade de camelos:", tfQtd);

        corpo.add(Tema.bloco(form, Tema.painelBotoes(btnDividir)), BorderLayout.NORTH);
        corpo.add(Tema.rolagem(taResultado), BorderLayout.CENTER);
    }

    public String getQtd() { return tfQtd.getText(); }
    public void setResultado(String texto) { taResultado.setText(texto); }

    public void addDividirListener(ActionListener l) {
        btnDividir.addActionListener(l);
        tfQtd.addActionListener(l);
    }
}
