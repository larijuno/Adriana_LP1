import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class MultiploView extends TelaBase {

    private final JTextField tfNum1 = Tema.campo(12);
    private final JTextField tfNum2 = Tema.campo(12);
    private final JButton btnVerificar = Tema.botao("Verificar");
    private final JTextArea taResultado = Tema.areaTexto(5, 20);

    public MultiploView() {
        super("Verificação de Múltiplo", "Informe dois números inteiros e veja se um é múltiplo do outro.", 540, 520);

        JPanel form = Tema.painelForm();
        Tema.linha(form, 0, "Primeiro número:", tfNum1);
        Tema.linha(form, 1, "Segundo número:", tfNum2);

        corpo.add(Tema.bloco(form, Tema.painelBotoes(btnVerificar)), BorderLayout.NORTH);
        corpo.add(Tema.rolagem(taResultado), BorderLayout.CENTER);
    }

    public String getNum1() { return tfNum1.getText(); }
    public String getNum2() { return tfNum2.getText(); }
    public void setResultado(String texto) { taResultado.setText(texto); }

    public void addVerificarListener(ActionListener l) {
        btnVerificar.addActionListener(l);
        tfNum1.addActionListener(l);
        tfNum2.addActionListener(l);
    }
}
