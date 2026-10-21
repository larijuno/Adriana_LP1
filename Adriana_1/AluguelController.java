public class AluguelController {

    private final Aluguel model;
    private final AluguelView view;

    public AluguelController(Aluguel model, AluguelView view) {
        this.model = model;
        this.view = view;
        view.addCalcularListener(e -> calcular());
    }

    private void calcular() {
        int dias;
        double km;
        try {
            dias = Integer.parseInt(view.getDias().trim());
            km = Tema.lerNumero(view.getKm());
        } catch (NumberFormatException ex) {
            view.mostrarErro("Dias deve ser um número inteiro e a quilometragem deve ser um número.");
            return;
        }
        if (dias <= 0 || km < 0) {
            view.mostrarErro("Informe pelo menos 1 dia e uma quilometragem válida.");
            return;
        }

        model.alugar(dias, km);

        StringBuilder sb = new StringBuilder();
        sb.append("Preço das diárias: ").append(Tema.moeda(model.getPrecoBase())).append("\n");
        if (model.excedeuLimite()) {
            sb.append("Km excedidos: ").append(Tema.decimal(model.getKmExtra())).append(" km\n");
            sb.append("Taxa extra por km: ").append(Tema.moeda(model.getTaxaExtra())).append("\n");
        } else {
            sb.append("Dentro do limite de km do plano.\n");
        }
        sb.append("\nVALOR TOTAL DO ALUGUEL: ").append(Tema.moeda(model.getPrecoTotal()));
        view.setResultado(sb.toString());
    }

    public void iniciar() {
        view.setVisible(true);
    }
}
