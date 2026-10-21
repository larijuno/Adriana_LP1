public class LoginController {

    private final Login model;
    private final LoginView view;

    public LoginController(Login model, LoginView view) {
        this.model = model;
        this.view = view;
        view.addEntrarListener(e -> entrar());
    }

    private void entrar() {
        if (model.autenticar(view.getSenha())) {
            view.setStatus("Acesso permitido", true);
        } else {
            view.setStatus("Acesso negado", false);
        }
        view.limparSenha();
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
