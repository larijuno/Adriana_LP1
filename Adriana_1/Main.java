import javax.swing.SwingUtilities;

public class Main {

    void main() {
        String[] opcoes = {
                "1 - Verificação de Múltiplo",
                "2 - Sistema de Login Simplificado",
                "3 - Compra com desconto",
                "4 - Temperatura",
                "5 - Os trinta e cinco camelos",
                "6 - Calculadora de viagem",
                "7 - Aluguel de carro"
        };

        Tema.aplicar();

        SwingUtilities.invokeLater(() -> {
            MenuView menu = new MenuView(opcoes);
            menu.addOpcaoListener(this::abrir);
            menu.setVisible(true);
        });
    }

    void abrir(int num) {
        if (num == 1) {
            new MultiploController(new Multiplo(), new MultiploView()).iniciar();

        } else if (num == 2) {
            new LoginController(new Login(), new LoginView()).iniciar();

        } else if (num == 3) {
            new CompraController(new Compra(), new CompraView()).iniciar();

        } else if (num == 4) {
            new TemperaturaController(new Temperatura(), new TemperaturaView()).iniciar();

        } else if (num == 5) {
            new CameloController(new Camelo(), new CameloView()).iniciar();

        } else if (num == 6) {
            new ViagemController(new Viagem(), new ViagemView()).iniciar();

        } else if (num == 7) {
            new AluguelController(new Aluguel(), new AluguelView()).iniciar();

        } else {
            IO.println("Opção inválida");
        }
    }
}
