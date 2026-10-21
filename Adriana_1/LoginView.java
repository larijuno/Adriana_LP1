import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class LoginView extends TelaBase {

    private final JPasswordField pfSenha = Tema.campoSenha(14);
    private final JButton btnEntrar = Tema.botao("Entrar");
    private final JLabel lblStatus = new JLabel(" ", SwingConstants.CENTER);

    public LoginView() {
        super("Sistema de Login", "Bem-vindo(a)! Digite sua senha para continuar.", 500, 380);

        lblStatus.setFont(Tema.NEGRITO);
        lblStatus.setBorder(new EmptyBorder(14, 12, 14, 12));

        JPanel form = Tema.painelForm();
        Tema.linha(form, 0, "Senha:", pfSenha);

        JPanel topo = new JPanel(new BorderLayout(0, 18));
        topo.setOpaque(false);
        topo.add(Tema.bloco(form, Tema.painelBotoes(btnEntrar)), BorderLayout.NORTH);
        topo.add(lblStatus, BorderLayout.CENTER);
        corpo.add(topo, BorderLayout.NORTH);
    }

    public String getSenha() { return new String(pfSenha.getPassword()); }

    public void setStatus(String texto, boolean sucesso) {
        lblStatus.setText(texto);
        lblStatus.setOpaque(true);
        lblStatus.setBackground(sucesso ? Tema.DESTAQUE : Tema.BORDA);
        lblStatus.setForeground(sucesso ? Tema.FUNDO : Tema.CLARO);
    }

    public void limparSenha() { pfSenha.setText(""); }

    public void addEntrarListener(ActionListener l) {
        btnEntrar.addActionListener(l);
        pfSenha.addActionListener(l);
    }
}
