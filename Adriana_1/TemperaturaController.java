public class TemperaturaController {

    private final Temperatura model;
    private final TemperaturaView view;

    public TemperaturaController(Temperatura model, TemperaturaView view) {
        this.model = model;
        this.view = view;
        view.addAnalisarListener(e -> analisar());
    }

    private void analisar() {
        view.limparTabela();

        for (int i = 0; i < model.getQuantidadeMeses(); i++) {
            int t = model.getTemp(i);
            view.adicionarLinha(model.getMes(i), t + " ºC", model.classificar(t));
        }

        view.setMedia("Média anual de 2025: " + Tema.decimal(model.media()) + " ºC");

        if (model.geralmenteAgradavel()) {
            view.setConclusao("Em geral, a temperatura em São José dos Campos é agradável.");
        } else {
            view.setConclusao("Em geral, a temperatura em São José dos Campos é fria.");
        }
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
